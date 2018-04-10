package br.gov.saude.servicos.cnes.v1r0.leitoservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T14:07:27.414-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "LeitoService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cnes/LeitoService/v1r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/leitoservice") 
public class LeitoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cnes/v1r0/leitoservice", "LeitoService");
    public final static QName LeitoServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cnes/v1r0/leitoservice", "LeitoServiceSOAP11Port");
    public final static QName LeitoServicePort = new QName("http://servicos.saude.gov.br/cnes/v1r0/leitoservice", "LeitoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cnes/LeitoService/v1r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LeitoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cnes/LeitoService/v1r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LeitoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LeitoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LeitoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public LeitoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LeitoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LeitoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns LeitoServicePortType
     */
    @WebEndpoint(name = "LeitoServiceSOAP11Port")
    public LeitoServicePortType getLeitoServiceSOAP11Port() {
        return super.getPort(LeitoServiceSOAP11Port, LeitoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LeitoServicePortType
     */
    @WebEndpoint(name = "LeitoServiceSOAP11Port")
    public LeitoServicePortType getLeitoServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(LeitoServiceSOAP11Port, LeitoServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns LeitoServicePortType
     */
    @WebEndpoint(name = "LeitoServicePort")
    public LeitoServicePortType getLeitoServicePort() {
        return super.getPort(LeitoServicePort, LeitoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LeitoServicePortType
     */
    @WebEndpoint(name = "LeitoServicePort")
    public LeitoServicePortType getLeitoServicePort(WebServiceFeature... features) {
        return super.getPort(LeitoServicePort, LeitoServicePortType.class, features);
    }

}