module server {
    requires java.xml.ws;
    requires jdk.httpserver;
    requires java.logging;
    requires java.rmi;

    // generated by WebServiceWrapperGenerator
    exports fromjava.nosei_apt.server.jaxws;
    exports fromjava.nosei_apt.server;
}
