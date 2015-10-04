JViewer
=======

It is a webinar platform for conferences about HTML, JavaScript, CSS and Java, which allows to:
- create separate rooms (Web and Java)
- demonstrate entered code and result of this code in real time
- get tested on specific questions of topic

Technologies and frameworks, which are used:
- Java
- Spring & Spring Security
- JSF
- PrimeFaces
- WebSocket
- SQLite
- Maven
- JMX

## Available platforms
- Windows
- Linux
- MAC OS

## Download
Links to download JViewer are available <a href="http://jviewer.tk:8080/download.xhtml" target="_blank">here</a>

## Configure Tomcat locally
1. Add the next connector into the ${catalina.home}/conf/server.xml:

    ```
    <Connector port="8443" SSLEnabled="true" protocol="org.apache.coyote.http11.Http11NioProtocol"
            maxThreads="150" scheme="https" secure="true"
            clientAuth="false" sslProtocol="TLS"
            keystoreFile="${catalina.home}/keystore/jviewer.tk.jks" keystorePass="secret" keystoreType="JKS"
            keyAlias="tomcat"/>
    ```
2. Replace "secret" with a real value for the keystorePass
3. Create the "keystore" directory inside the ${catalina.home} one
4. Put the jviewer.tk.jks key file into the "keystore" directory
5. Create the "database" directory inside the ${catalina.home} one
6. Put the JViewer\database\*.db files into the "database" directory