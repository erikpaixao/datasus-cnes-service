
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.etniaindigena;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EtniaIndigenaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EtniaIndigenaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEtniaIndigena"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descricaoEtniaIndigena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtniaIndigenaType", propOrder = {
    "codigoEtniaIndigena",
    "descricaoEtniaIndigena"
})
public class EtniaIndigenaType {

    @XmlElement(required = true)
    protected String codigoEtniaIndigena;
    protected String descricaoEtniaIndigena;

    /**
     * Obtém o valor da propriedade codigoEtniaIndigena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtniaIndigena() {
        return codigoEtniaIndigena;
    }

    /**
     * Define o valor da propriedade codigoEtniaIndigena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtniaIndigena(String value) {
        this.codigoEtniaIndigena = value;
    }

    /**
     * Obtém o valor da propriedade descricaoEtniaIndigena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEtniaIndigena() {
        return descricaoEtniaIndigena;
    }

    /**
     * Define o valor da propriedade descricaoEtniaIndigena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEtniaIndigena(String value) {
        this.descricaoEtniaIndigena = value;
    }

}
