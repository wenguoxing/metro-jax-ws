module server {
    requires java.xml.ws;
     requires jdk.httpserver;
      requires java.logging; 

    // generated by WebServiceWrapperGenerator
    exports server.basic_auth.server.jaxws;

}