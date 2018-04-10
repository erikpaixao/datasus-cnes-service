package br.gov.saude.servicos.sigtap.v1.procedimentoservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T17:57:53.802-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "ProcedimentoService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/sigtap/ProcedimentoService/v1?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/sigtap/v1/procedimentoservice") 
public class ProcedimentoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/sigtap/v1/procedimentoservice", "ProcedimentoService");
    public final static QName ProcedimentoServicePort = new QName("http://servicos.saude.gov.br/sigtap/v1/procedimentoservice", "ProcedimentoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/sigtap/ProcedimentoService/v1?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProcedimentoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/sigtap/ProcedimentoService/v1?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProcedimentoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProcedimentoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcedimentoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ProcedimentoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProcedimentoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProcedimentoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ProcedimentoServicePortType
     */
    @WebEndpoint(name = "ProcedimentoServicePort")
    public ProcedimentoServicePortType getProcedimentoServicePort() {
        return super.getPort(ProcedimentoServicePort, ProcedimentoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProcedimentoServicePortType
     */
    @WebEndpoint(name = "ProcedimentoServicePort")
    public ProcedimentoServicePortType getProcedimentoServicePort(WebServiceFeature... features) {
        return super.getPort(ProcedimentoServicePort, ProcedimentoServicePortType.class, features);
    }

}