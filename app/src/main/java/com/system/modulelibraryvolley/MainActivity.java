package com.system.modulelibraryvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
/*
        ENVIAR UNA SOLICITUD SIMPLE
 */
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.text);
    }

    public void RequestResponseSubmit(View view){
        // Administra los subprocesos de trabajo para las operaciones de red
        RequestQueue request_queue = Volley.newRequestQueue(getApplicationContext());
        final String url = "http://www.google.com";
        // Solicitud de respuesta de cadena de la URL proporcionada | CREA LA SOLICITUD
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) { // Cadena de respuesta -> response: String
                // Mostrar los primeros 500 caracteres de la cadena de respuesta
                textView.setText("Respuesta es: " + response.substring(0, 500));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Esto no funciono");
                Log.w(TAG, "Error programming -> " + error);
            }
        });
        // Agregar la solicitud al request_queue
    request_queue.add(stringRequest);

    }
}