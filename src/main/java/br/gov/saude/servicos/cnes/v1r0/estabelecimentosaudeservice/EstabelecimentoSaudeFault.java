
package br.gov.saude.servicos.cnes.v1r0.estabelecimentosaudeservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-12T09:05:55.166-03:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "MSFalha", targetNamespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class EstabelecimentoSaudeFault extends Exception {
    
    private br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha;

    public EstabelecimentoSaudeFault() {
        super();
    }
    
    public EstabelecimentoSaudeFault(String message) {
        super(message);
    }
    
    public EstabelecimentoSaudeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public EstabelecimentoSaudeFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha) {
        super(message);
        this.msFalha = msFalha;
    }

    public EstabelecimentoSaudeFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha, Throwable cause) {
        super(message, cause);
        this.msFalha = msFalha;
    }

    public br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha getFaultInfo() {
        return this.msFalha;
    }
}
