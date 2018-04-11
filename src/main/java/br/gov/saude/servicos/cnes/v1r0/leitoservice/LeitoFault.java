
package br.gov.saude.servicos.cnes.v1r0.leitoservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-11T09:47:15.544-03:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "MSFalha", targetNamespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class LeitoFault extends Exception {
    
    private br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha;

    public LeitoFault() {
        super();
    }
    
    public LeitoFault(String message) {
        super(message);
    }
    
    public LeitoFault(String message, Throwable cause) {
        super(message, cause);
    }

    public LeitoFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha) {
        super(message);
        this.msFalha = msFalha;
    }

    public LeitoFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha, Throwable cause) {
        super(message, cause);
        this.msFalha = msFalha;
    }

    public br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha getFaultInfo() {
        return this.msFalha;
    }
}
