package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T14:07:05.122-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "VinculacaoProfissionalService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cnes/VinculacaoProfissionalService/v1r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice") 
public class VinculacaoProfissionalService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "VinculacaoProfissionalService");
    public final static QName VinculacaoProfissionalServicePort = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "VinculacaoProfissionalServicePort");
    public final static QName VinculacaoProfissionalServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "VinculacaoProfissionalServiceSOAP11Port");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cnes/VinculacaoProfissionalService/v1r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VinculacaoProfissionalService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cnes/VinculacaoProfissionalService/v1r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VinculacaoProfissionalService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VinculacaoProfissionalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VinculacaoProfissionalService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public VinculacaoProfissionalService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public VinculacaoProfissionalService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public VinculacaoProfissionalService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns VinculacaoPortType
     */
    @WebEndpoint(name = "VinculacaoProfissionalServicePort")
    public VinculacaoPortType getVinculacaoProfissionalServicePort() {
        return super.getPort(VinculacaoProfissionalServicePort, VinculacaoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VinculacaoPortType
     */
    @WebEndpoint(name = "VinculacaoProfissionalServicePort")
    public VinculacaoPortType getVinculacaoProfissionalServicePort(WebServiceFeature... features) {
        return super.getPort(VinculacaoProfissionalServicePort, VinculacaoPortType.class, features);
    }


    /**
     *
     * @return
     *     returns VinculacaoPortType
     */
    @WebEndpoint(name = "VinculacaoProfissionalServiceSOAP11Port")
    public VinculacaoPortType getVinculacaoProfissionalServiceSOAP11Port() {
        return super.getPort(VinculacaoProfissionalServiceSOAP11Port, VinculacaoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VinculacaoPortType
     */
    @WebEndpoint(name = "VinculacaoProfissionalServiceSOAP11Port")
    public VinculacaoPortType getVinculacaoProfissionalServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(VinculacaoProfissionalServiceSOAP11Port, VinculacaoPortType.class, features);
    }

}
