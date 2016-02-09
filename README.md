# Prácticas del Curso de Elementos de Programación

##Práctica No. 1 Configuración del contenedor tomcat
###Objetivo: Configurar el puerto y los usuarios del tomcat version 7 u 8.

1. Una vez descargado el tomcat del sitio oficial que  [se encuetra en este link](https://tomcat.apache.org/download-80.cgi), descargas la version que es una carpeta en zip,  vas a descompirmirla en tu computadora, en el interior te vas a ir la carpeta conf y vas a buscar el archivo **server.xml**, en ese archivo vas a a encontrar la siguiente configuracion de conexion al puerto http, por defecto es el puerto 8080, cambialo como se muestra al puerto 8095. VALOR 2 PUNTOS

```xml
<Connector port="8095" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />

```

2. En la misma carpeta que el punto anterior vas a buscar el archivo tomcat-users.xml en el vas a desbloquear los usuarios del tomcat, el archivo debe aparecer de la siguiente manera, ya con los usuarios desbloqueados. VALOR 2 PUNTOS

Configuracion de los usuarios
```xml
 <role rolename="tomcat"/>
<role rolename="manager-gui"/>
<role rolename="manager-script"/>
  <role rolename="role1"/>
  <user username="tomcat" password="tomcat" roles="tomcat,manager-gui,manager-script"/>
  <user username="both" password="tomcat" roles="tomcat,role1"/>
  <user username="role1" password="tomcat" roles="role1"/>
```

3. Una vez hecho lo anterio, regresa una carpeta arriba en donde estabas en los puntos anteriores y busca la carpeta **bin**, en ella vas a ejecutar el archivo por lotes startup.bat y despues de que se cargue en una pantalla ms-dos el tomcat dirigete a tu navegador google chrome y teclea la direccion **http://localhost:8095** y debes de ver la pagina de inicio del tomcat. VALOR 2 PUNTOS.

