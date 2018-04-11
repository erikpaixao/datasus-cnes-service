package br.gov.saude.servicos.horus.v1r0.estoqueservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-11T09:47:24.680-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "EstoqueService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/horus/v1r0/EstoqueService?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/horus/v1r0/EstoqueService") 
public class EstoqueService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/horus/v1r0/EstoqueService", "EstoqueService");
    public final static QName EstoqueServicePort = new QName("http://servicos.saude.gov.br/horus/v1r0/EstoqueService", "EstoqueServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/horus/v1r0/EstoqueService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EstoqueService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/horus/v1r0/EstoqueService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EstoqueService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EstoqueService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EstoqueService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public EstoqueService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EstoqueService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EstoqueService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns EstoqueServicePortType
     */
    @WebEndpoint(name = "EstoqueServicePort")
    public EstoqueServicePortType getEstoqueServicePort() {
        return super.getPort(EstoqueServicePort, EstoqueServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EstoqueServicePortType
     */
    @WebEndpoint(name = "EstoqueServicePort")
    public EstoqueServicePortType getEstoqueServicePort(WebServiceFeature... features) {
        return super.getPort(EstoqueServicePort, EstoqueServicePortType.class, features);
    }

}
