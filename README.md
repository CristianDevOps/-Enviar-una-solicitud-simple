# ¿Qué es?, ¿Qué busca originalmente este proyecto o los objetivos?, ¿Quién lo desarrollo?🧠

**Este proyecto desarrollado esta hecho para un ambito personal y originalmente ser una retroalimentación** entre desarrolladores de Android y Java.
Este es un sistema qué incorpora los cimientos mediante la utilidad de la biblioteca HTTP Volley.

Este proyecto esta realizado por [@CristianDevOps](https://github.com/CristianDevOps). con las intenciones auténtica de aprender el lenguaje **Java-Android(Android Studio SDK,API, BIBLOTECA HTTP)** y a la par, realizar procesos aplicable, que puedan ser expuestos y utilizados con la finalidad de compartir conocimientos sobre programación.


## Caso de uso compatible🤖

**- Envía una solicitud simple:** mediante el método de conveniencia Volley.newRequestQueue, que configura una RequestQueue por ti, mediante valores predeterminados de Volley (comportamiento original).

**- Configuración de opciones de seguridad de red:** Habilita el trafico de cleartText; admite conexiones host sin certificado autoafirmados particulares, o sin autoridades de certificación (CA).

**- Cancelar solicitudes:** El sistema garantizará qué nunca se llame a el controlador de respuestas. Lo que en práctica significa qué puedes cancelar todas las solicitudes pentiendes en el método onStop() de tu actividad, o puedes hacerlo manualmente a través de la selección 'CANCELAR  SOLICITUD'. 

**- Consume un Web Services de Google:** A través de la creación de solicitud de respuesta de cadena, de la URL proporcionada. Y luego mostras los primeros 500 caracteres de la cedena de respuesta.


## Estado del proyecto📈

**Este proyecto se encuentra en DESARROLLO** actualmente es una **guía para desarrolladores**.


## Directrices de codificación🔨

La intención es seguir las mejores prácticas de Android Studio. Visite su 
documentación oficial, en la qué parte este test unitario y las prácticas:

[Página oficial de Android Studio - Volley](https://developer.android.com/training/volley/simple?hl=es)

Incorpore el plugin **tabnine** en Android Studio: [página oficial](https://www.tabnine.com/) cómo asistente de autocompletado de código, impulsado con IA GPT-2. 

**Nota: el formato de código y el estilo perfecto están fuera de nuestras implementaciones, por el momento**.


## Requerimientos🚧

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


## Contribuciones👥

Si quieres dar algún comentario, sobre un problema, Adradezco los comentarios y sugerencias. Tenga en cuenta qué este proyecto es una guía independiente.
 
Actualmente, SI ACEPTO CONTRIBUCIONES DE CÓDIGO(Solicitudes de extracción). Además como se encuentra en un estado de desarrollo, puedes alojar tús comentarios sobre el sistema actual.

