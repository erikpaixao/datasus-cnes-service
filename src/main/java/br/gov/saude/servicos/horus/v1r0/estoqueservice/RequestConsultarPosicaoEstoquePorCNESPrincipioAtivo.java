
package br.gov.saude.servicos.horus.v1r0.estoqueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="cnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="principioAtivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "cnes",
    "principioAtivo"
})
@XmlRootElement(name = "requestConsultarPosicaoEstoquePorCNESPrincipioAtivo")
public class RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo {

    protected int cnes;
    @XmlElement(required = true)
    protected String principioAtivo;

    /**
     * Obtém o valor da propriedade cnes.
     * 
     */
    public int getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     * 
     */
    public void setCnes(int value) {
        this.cnes = value;
    }

    /**
     * Obtém o valor da propriedade principioAtivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    /**
     * Define o valor da propriedade principioAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipioAtivo(String value) {
        this.principioAtivo = value;
    }

}
