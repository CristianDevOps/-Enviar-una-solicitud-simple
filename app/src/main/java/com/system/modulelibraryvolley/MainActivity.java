package com.system.modulelibraryvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
/*
        ENVIAR UNA SOLICITUD SIMPLE Y CANCELARLA
 */
public class MainActivity extends AppCompatActivity {

    private Spinner sp_option;
    private TextView tv_response;

    private RequestQueue request_queue;

    // Definir etiqueta y agregarla a la solicitud
    private static final String TAG_REQUEST = "MyTag";
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_option = findViewById(R.id.sp_option);
        tv_response = findViewById(R.id.tv_response);

        String[] option = {"ENVIAR SOLICITUD","CANCELAR SOLICITUD"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, option);
        sp_option.setAdapter(arrayAdapter);
    }
    // Cancelarla en el tiempo adecuado
    @Override
    public void onStop() {
        super.onStop();
        if(request_queue != null){
            Log.i(TAG, "Solicitud[Type: GET] -> 1) Canalización 2) Se envío " +
                    "3) Se análizo su respuesta sin procesar 4) Se entraga");
            request_queue.cancelAll(TAG_REQUEST);
            Log.i(TAG, "Bibloteca HTTP: (Volley) -> [SOLICITUD CANCELADA] - garantizo que nunca se llame a el controlador de respuesta del sistema ");
        } else {
            Log.i(TAG, "No existe solicitud en cola");
        }
    }

    public void RequestResponseSubmit(View view){
        StringRequest stringRequest;
        // Administra los subprocesos de trabajo para las operaciones de red
        request_queue = Volley.newRequestQueue(getApplicationContext());
        final String URL = "http://www.google.com";

        String select = sp_option.getSelectedItem().toString();

        if(select.equals("ENVIAR SOLICITUD")){

            // Solicitud de respuesta de cadena de la URL proporcionada | CREA LA SOLICITUD
            stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) { // Cadena de respuesta -> response: String
                    // Mostrar los primeros 500 caracteres de la cadena de respuesta
                    tv_response.setText(response.substring(0,500));
                    Log.i(TAG, "¡Se a agregado una solicitud en la cola!");
                    Log.i(TAG, "La respuesta almacenada en caché se analiza -> Subproceso de caché");
                    Log.i(TAG, "La respuesta analizada se entrego al subproceso principal");
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.w(TAG, "Error -> " + error);
                }
            });

            stringRequest.setTag(TAG_REQUEST);
            // Agregar la solicitud al request_queue
            request_queue.add(stringRequest);

        } else if(select.equals("CANCELAR SOLICITUD")){
            if(request_queue != null){
                request_queue.cancelAll(TAG_REQUEST);
                tv_response.setText("");
                Log.i(TAG, "Bibloteca HTTP: (Volley) -> [SOLICITUD CANCELADA] - garantizo que nunca se llame a el controlador de respuesta del sistema ");
            } else {
                Log.i(TAG, "No existe solicitud en cola");
            }
        }


    }
}