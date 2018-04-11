
package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.transacaoauditoria.TransacaoAuditoriaType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/transacaoauditoria}TransacaoAuditoria" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transacaoAuditoria"
})
@XmlRootElement(name = "responseObterHistoricoTransacoesUsuarioSUS")
public class ResponseObterHistoricoTransacoesUsuarioSUS {

    @XmlElement(name = "TransacaoAuditoria", namespace = "http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/transacaoauditoria", required = true)
    protected List<TransacaoAuditoriaType> transacaoAuditoria;

    /**
     * Gets the value of the transacaoAuditoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transacaoAuditoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransacaoAuditoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransacaoAuditoriaType }
     * 
     * 
     */
    public List<TransacaoAuditoriaType> getTransacaoAuditoria() {
        if (transacaoAuditoria == null) {
            transacaoAuditoria = new ArrayList<TransacaoAuditoriaType>();
        }
        return this.transacaoAuditoria;
    }

}
