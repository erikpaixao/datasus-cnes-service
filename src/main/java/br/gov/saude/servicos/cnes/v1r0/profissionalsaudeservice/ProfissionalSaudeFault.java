
package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-04-10T14:07:12.351-03:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "MSFalha", targetNamespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class ProfissionalSaudeFault extends Exception {
    
    private br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha;

    public ProfissionalSaudeFault() {
        super();
    }
    
    public ProfissionalSaudeFault(String message) {
        super(message);
    }
    
    public ProfissionalSaudeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ProfissionalSaudeFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha) {
        super(message);
        this.msFalha = msFalha;
    }

    public ProfissionalSaudeFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha, Throwable cause) {
        super(message, cause);
        this.msFalha = msFalha;
    }

    public br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha getFaultInfo() {
        return this.msFalha;
    }
}