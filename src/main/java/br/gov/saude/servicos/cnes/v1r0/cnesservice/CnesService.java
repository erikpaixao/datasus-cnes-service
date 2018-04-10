package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T17:57:44.543-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "CnesService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cnes/CnesService/v1r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/cnesservice") 
public class CnesService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cnes/v1r0/cnesservice", "CnesService");
    public final static QName CnesServicePort = new QName("http://servicos.saude.gov.br/cnes/v1r0/cnesservice", "CnesServicePort");
    public final static QName CnesServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cnes/v1r0/cnesservice", "CnesServiceSOAP11Port");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cnes/CnesService/v1r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CnesService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cnes/CnesService/v1r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CnesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CnesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CnesService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CnesService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CnesService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CnesService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CnesServicePortType
     */
    @WebEndpoint(name = "CnesServicePort")
    public CnesServicePortType getCnesServicePort() {
        return super.getPort(CnesServicePort, CnesServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CnesServicePortType
     */
    @WebEndpoint(name = "CnesServicePort")
    public CnesServicePortType getCnesServicePort(WebServiceFeature... features) {
        return super.getPort(CnesServicePort, CnesServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns CnesServicePortType
     */
    @WebEndpoint(name = "CnesServiceSOAP11Port")
    public CnesServicePortType getCnesServiceSOAP11Port() {
        return super.getPort(CnesServiceSOAP11Port, CnesServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CnesServicePortType
     */
    @WebEndpoint(name = "CnesServiceSOAP11Port")
    public CnesServicePortType getCnesServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(CnesServiceSOAP11Port, CnesServicePortType.class, features);
    }

}
