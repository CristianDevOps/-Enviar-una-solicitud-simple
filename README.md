# Simple request🧠
Enviar una solicitud mediante el método de conveniencia Volley.newRequestQueue, que configura una RequestQueue por ti.

## Caso de uso compatible: 🤖

**Este proyecto desarrollado para un ambito personal y originalmente ser una retroalimentación** entre desarrolladores de software, proyecto hecho por [@CristianDevOps](https://www.facebook.com/cristian.va.5688/).

## Requerimientos:⭐ 

 - Permiso de INTERNET: Para usar Volley, debes agregar el permiso
   android.permission.INTERNET al manifiesto de tu app. Sin este
   permiso, tu app no podrá conectarse a la red.
 ```
 <uses-permission android:name="android.permission.INTERNET" />
 ```
 
 - Función de configuración de seguridad de la red. Permite que la app,
   personalize las opciones de seguridad de red de la app.
   
 ```
 [ModuleLibraryVolley/app/src/main/res/xml/network_security_config.xml]
 
<!-- ARCHIVO DE CONFIGURACIÓN SEGURO Y DECLARATIVO -->

<network-security-config>
    <!-- Personalizar las conexiones de seguridad de la apps | mediante base-config -->
    <base-config cleartextTrafficPermitted="true">
        <trust-anchors>
            <!-- HOST SIN CERTIFICADO(CA) NI CUYOS SSL EMITIDOS POR (CA) PRIVADAS  -->
            <certificates src="system" /> <!-- PARA LOS CERTIFICADOS (CA) PREINSTALADOS DEL SISTEMA-->
        </trust-anchors>
    </base-config>
</network-security-config>
  ```
