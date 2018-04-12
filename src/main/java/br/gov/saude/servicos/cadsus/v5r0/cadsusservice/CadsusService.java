package br.gov.saude.servicos.cadsus.v5r0.cadsusservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-12T09:07:15.072-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "CadsusService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cadsus/CadsusService/v5r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cadsus/v5r0/cadsusservice") 
public class CadsusService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cadsus/v5r0/cadsusservice", "CadsusService");
    public final static QName CadsusServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cadsus/v5r0/cadsusservice", "CadsusServiceSOAP11Port");
    public final static QName CadsusServicePort = new QName("http://servicos.saude.gov.br/cadsus/v5r0/cadsusservice", "CadsusServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cadsus/CadsusService/v5r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CadsusService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cadsus/CadsusService/v5r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CadsusService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CadsusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CadsusService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CadsusService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CadsusService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CadsusService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CadsusServicePortType
     */
    @WebEndpoint(name = "CadsusServiceSOAP11Port")
    public CadsusServicePortType getCadsusServiceSOAP11Port() {
        return super.getPort(CadsusServiceSOAP11Port, CadsusServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CadsusServicePortType
     */
    @WebEndpoint(name = "CadsusServiceSOAP11Port")
    public CadsusServicePortType getCadsusServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(CadsusServiceSOAP11Port, CadsusServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns CadsusServicePortType
     */
    @WebEndpoint(name = "CadsusServicePort")
    public CadsusServicePortType getCadsusServicePort() {
        return super.getPort(CadsusServicePort, CadsusServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CadsusServicePortType
     */
    @WebEndpoint(name = "CadsusServicePort")
    public CadsusServicePortType getCadsusServicePort(WebServiceFeature... features) {
        return super.getPort(CadsusServicePort, CadsusServicePortType.class, features);
    }

}
