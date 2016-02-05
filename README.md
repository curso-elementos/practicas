# Prácticas del Curso de Elementos de Programación

##Práctina No. 1 Configuración del contenedor tomcat

```xml
<Connector port="8095" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />

```


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


