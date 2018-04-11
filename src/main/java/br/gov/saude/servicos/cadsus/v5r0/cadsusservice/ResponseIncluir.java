
package br.gov.saude.servicos.cadsus.v5r0.cadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorlocal.IdentificadorLocalType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNS"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorlocal}IdentificadorLocal" minOccurs="0"/&gt;
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
    "cns",
    "identificadorLocal"
})
@XmlRootElement(name = "responseIncluir")
public class ResponseIncluir {

    @XmlElement(name = "CNS", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/cns", required = true)
    protected CNSType cns;
    @XmlElement(name = "IdentificadorLocal", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorlocal")
    protected IdentificadorLocalType identificadorLocal;

    /**
     * Obtém o valor da propriedade cns.
     * 
     * @return
     *     possible object is
     *     {@link CNSType }
     *     
     */
    public CNSType getCNS() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     * 
     * @param value
     *     allowed object is
     *     {@link CNSType }
     *     
     */
    public void setCNS(CNSType value) {
        this.cns = value;
    }

    /**
     * Obtém o valor da propriedade identificadorLocal.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorLocalType }
     *     
     */
    public IdentificadorLocalType getIdentificadorLocal() {
        return identificadorLocal;
    }

    /**
     * Define o valor da propriedade identificadorLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorLocalType }
     *     
     */
    public void setIdentificadorLocal(IdentificadorLocalType value) {
        this.identificadorLocal = value;
    }

}
