
package br.gov.saude.servicos.sigtap.v1.procedimentoservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T18:29:53.947-03:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "MSFalha", targetNamespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class SIGTAPFault extends Exception {
    
    private br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha;

    public SIGTAPFault() {
        super();
    }
    
    public SIGTAPFault(String message) {
        super(message);
    }
    
    public SIGTAPFault(String message, Throwable cause) {
        super(message, cause);
    }

    public SIGTAPFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha) {
        super(message);
        this.msFalha = msFalha;
    }

    public SIGTAPFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha, Throwable cause) {
        super(message, cause);
        this.msFalha = msFalha;
    }

    public br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha getFaultInfo() {
        return this.msFalha;
    }
}
