package br.gov.saude.servicos.cnes.v1r0.equipamentoservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-12T09:06:36.423-03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "EquipamentoService", 
                  wsdlLocation = "https://servicoshm.saude.gov.br/cnes/EquipamentoService/v1r0?wsdl",
                  targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice") 
public class EquipamentoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice", "EquipamentoService");
    public final static QName EquipamentoServiceSOAP11Port = new QName("http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice", "EquipamentoServiceSOAP11Port");
    public final static QName EquipamentoServicePort = new QName("http://servicos.saude.gov.br/cnes/v1r0/equipamentoservice", "EquipamentoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://servicoshm.saude.gov.br/cnes/EquipamentoService/v1r0?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EquipamentoService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://servicoshm.saude.gov.br/cnes/EquipamentoService/v1r0?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EquipamentoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EquipamentoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EquipamentoService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public EquipamentoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EquipamentoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EquipamentoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns EquipamentoServicePortType
     */
    @WebEndpoint(name = "EquipamentoServiceSOAP11Port")
    public EquipamentoServicePortType getEquipamentoServiceSOAP11Port() {
        return super.getPort(EquipamentoServiceSOAP11Port, EquipamentoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EquipamentoServicePortType
     */
    @WebEndpoint(name = "EquipamentoServiceSOAP11Port")
    public EquipamentoServicePortType getEquipamentoServiceSOAP11Port(WebServiceFeature... features) {
        return super.getPort(EquipamentoServiceSOAP11Port, EquipamentoServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns EquipamentoServicePortType
     */
    @WebEndpoint(name = "EquipamentoServicePort")
    public EquipamentoServicePortType getEquipamentoServicePort() {
        return super.getPort(EquipamentoServicePort, EquipamentoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EquipamentoServicePortType
     */
    @WebEndpoint(name = "EquipamentoServicePort")
    public EquipamentoServicePortType getEquipamentoServicePort(WebServiceFeature... features) {
        return super.getPort(EquipamentoServicePort, EquipamentoServicePortType.class, features);
    }

}
