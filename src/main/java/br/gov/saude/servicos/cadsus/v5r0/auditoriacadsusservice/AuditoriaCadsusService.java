package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-11T09:47:33.838-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "AuditoriaCadsusService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cadsus/AuditoriaCadsusService/v5r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cadsus/v5r0/auditoriacadsusservice") 
public class AuditoriaCadsusService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cadsus/v5r0/auditoriacadsusservice", "AuditoriaCadsusService");
    public final static QName AuditoriaCadsusServicePort = new QName("http://servicos.saude.gov.br/cadsus/v5r0/auditoriacadsusservice", "AuditoriaCadsusServicePort");
    public final static QName AuditoriaCadsusServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cadsus/v5r0/auditoriacadsusservice", "AuditoriaCadsusServiceSOAP11Port");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cadsus/AuditoriaCadsusService/v5r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AuditoriaCadsusService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cadsus/AuditoriaCadsusService/v5r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AuditoriaCadsusService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuditoriaCadsusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuditoriaCadsusService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AuditoriaCadsusService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AuditoriaCadsusService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AuditoriaCadsusService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AuditoriaCadsusServicePortType
     */
    @WebEndpoint(name = "AuditoriaCadsusServicePort")
    public AuditoriaCadsusServicePortType getAuditoriaCadsusServicePort() {
        return super.getPort(AuditoriaCadsusServicePort, AuditoriaCadsusServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuditoriaCadsusServicePortType
     */
    @WebEndpoint(name = "AuditoriaCadsusServicePort")
    public AuditoriaCadsusServicePortType getAuditoriaCadsusServicePort(WebServiceFeature... features) {
        return super.getPort(AuditoriaCadsusServicePort, AuditoriaCadsusServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns AuditoriaCadsusServicePortType
     */
    @WebEndpoint(name = "AuditoriaCadsusServiceSOAP11Port")
    public AuditoriaCadsusServicePortType getAuditoriaCadsusServiceSOAP11Port() {
        return super.getPort(AuditoriaCadsusServiceSOAP11Port, AuditoriaCadsusServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuditoriaCadsusServicePortType
     */
    @WebEndpoint(name = "AuditoriaCadsusServiceSOAP11Port")
    public AuditoriaCadsusServicePortType getAuditoriaCadsusServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(AuditoriaCadsusServiceSOAP11Port, AuditoriaCadsusServicePortType.class, features);
    }

}
