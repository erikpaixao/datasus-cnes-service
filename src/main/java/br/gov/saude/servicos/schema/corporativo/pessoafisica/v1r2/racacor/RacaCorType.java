
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.racacor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RacaCorType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RacaCorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRacaCor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricaoRacaCor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacaCorType", propOrder = {
    "codigoRacaCor",
    "descricaoRacaCor"
})
public class RacaCorType {

    @XmlElement(required = true)
    protected String codigoRacaCor;
    protected String descricaoRacaCor;

    /**
     * Obtém o valor da propriedade codigoRacaCor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRacaCor() {
        return codigoRacaCor;
    }

    /**
     * Define o valor da propriedade codigoRacaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRacaCor(String value) {
        this.codigoRacaCor = value;
    }

    /**
     * Obtém o valor da propriedade descricaoRacaCor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoRacaCor() {
        return descricaoRacaCor;
    }

    /**
     * Define o valor da propriedade descricaoRacaCor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoRacaCor(String value) {
        this.descricaoRacaCor = value;
    }

}
