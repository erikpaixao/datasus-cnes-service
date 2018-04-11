
package br.gov.saude.servicos.schema.corporativo.documento.v1r1.tituloeleitor;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TituloEleitorType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TituloEleitorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numeroTituloEleitor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[1-9][0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="zona" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="secao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloEleitorType", propOrder = {
    "identificador",
    "numeroTituloEleitor",
    "zona",
    "secao"
})
public class TituloEleitorType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    protected String numeroTituloEleitor;
    protected String zona;
    protected String secao;

    /**
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificador(BigInteger value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade numeroTituloEleitor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTituloEleitor() {
        return numeroTituloEleitor;
    }

    /**
     * Define o valor da propriedade numeroTituloEleitor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTituloEleitor(String value) {
        this.numeroTituloEleitor = value;
    }

    /**
     * Obtém o valor da propriedade zona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZona() {
        return zona;
    }

    /**
     * Define o valor da propriedade zona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Obtém o valor da propriedade secao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecao() {
        return secao;
    }

    /**
     * Define o valor da propriedade secao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecao(String value) {
        this.secao = value;
    }

}
