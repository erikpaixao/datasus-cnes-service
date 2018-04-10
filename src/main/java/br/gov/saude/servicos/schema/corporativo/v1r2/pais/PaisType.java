
package br.gov.saude.servicos.schema.corporativo.v1r2.pais;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PaisType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoPais" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="codigoPaisAntigo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaisType", propOrder = {
    "codigoPais",
    "codigoPaisAntigo",
    "nomePais"
})
public class PaisType {

    protected String codigoPais;
    protected String codigoPaisAntigo;
    protected String nomePais;

    /**
     * Obtém o valor da propriedade codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define o valor da propriedade codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtém o valor da propriedade codigoPaisAntigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisAntigo() {
        return codigoPaisAntigo;
    }

    /**
     * Define o valor da propriedade codigoPaisAntigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisAntigo(String value) {
        this.codigoPaisAntigo = value;
    }

    /**
     * Obtém o valor da propriedade nomePais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePais() {
        return nomePais;
    }

    /**
     * Define o valor da propriedade nomePais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePais(String value) {
        this.nomePais = value;
    }

}
