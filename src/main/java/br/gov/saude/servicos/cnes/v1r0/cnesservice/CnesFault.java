package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF 3.1.10 2018-04-10T14:07:25.164-03:00
 * Generated source version: 3.1.10
 */
@WebFault(name = "MSFalha", targetNamespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class CnesFault extends Exception {

    private br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha;

    public CnesFault() {
        super();
    }

    public CnesFault(String message) {
        super(message);
    }

    public CnesFault(String message, Throwable cause) {
        super(message, cause);
    }

    public CnesFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha) {
        super(message);
        this.msFalha = msFalha;
    }

    public CnesFault(String message, br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha msFalha, Throwable cause) {
        super(message, cause);
        this.msFalha = msFalha;
    }

    public br.gov.saude.servicos.wsdl.mensageria.falha.v5r0.msfalha.MSFalha getFaultInfo() {
        return this.msFalha;
    }
}
