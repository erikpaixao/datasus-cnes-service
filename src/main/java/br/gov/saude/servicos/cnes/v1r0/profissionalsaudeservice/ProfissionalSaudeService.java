package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T18:29:32.926-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "ProfissionalSaudeService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cnes/ProfissionalSaudeService/v1r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/profissionalsaudeservice") 
public class ProfissionalSaudeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cnes/v1r0/profissionalsaudeservice", "ProfissionalSaudeService");
    public final static QName ProfissionalSaudeServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cnes/v1r0/profissionalsaudeservice", "ProfissionalSaudeServiceSOAP11Port");
    public final static QName ProfissionalSaudeServicePort = new QName("http://servicos.saude.gov.br/cnes/v1r0/profissionalsaudeservice", "ProfissionalSaudeServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cnes/ProfissionalSaudeService/v1r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProfissionalSaudeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cnes/ProfissionalSaudeService/v1r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProfissionalSaudeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProfissionalSaudeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProfissionalSaudeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ProfissionalSaudeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProfissionalSaudeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProfissionalSaudeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ProfissionalSaudeServicePortType
     */
    @WebEndpoint(name = "ProfissionalSaudeServiceSOAP11Port")
    public ProfissionalSaudeServicePortType getProfissionalSaudeServiceSOAP11Port() {
        return super.getPort(ProfissionalSaudeServiceSOAP11Port, ProfissionalSaudeServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfissionalSaudeServicePortType
     */
    @WebEndpoint(name = "ProfissionalSaudeServiceSOAP11Port")
    public ProfissionalSaudeServicePortType getProfissionalSaudeServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(ProfissionalSaudeServiceSOAP11Port, ProfissionalSaudeServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns ProfissionalSaudeServicePortType
     */
    @WebEndpoint(name = "ProfissionalSaudeServicePort")
    public ProfissionalSaudeServicePortType getProfissionalSaudeServicePort() {
        return super.getPort(ProfissionalSaudeServicePort, ProfissionalSaudeServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfissionalSaudeServicePortType
     */
    @WebEndpoint(name = "ProfissionalSaudeServicePort")
    public ProfissionalSaudeServicePortType getProfissionalSaudeServicePort(WebServiceFeature... features) {
        return super.getPort(ProfissionalSaudeServicePort, ProfissionalSaudeServicePortType.class, features);
    }

}
