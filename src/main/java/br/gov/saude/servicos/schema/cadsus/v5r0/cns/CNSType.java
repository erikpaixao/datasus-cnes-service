
package br.gov.saude.servicos.schema.cadsus.v5r0.cns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CNSType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CNSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCNS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="15"/&gt;
 *               &lt;maxLength value="15"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataAtribuicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tipoCartao" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}TipoCNSType" minOccurs="0"/&gt;
 *         &lt;element name="manual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="justificativaManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNSType", propOrder = {
    "numeroCNS",
    "dataAtribuicao",
    "tipoCartao",
    "manual",
    "justificativaManual"
})
public class CNSType {

    @XmlElement(required = true)
    protected String numeroCNS;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtribuicao;
    @XmlSchemaType(name = "string")
    protected TipoCNSType tipoCartao;
    protected Boolean manual;
    protected String justificativaManual;

    /**
     * Obtém o valor da propriedade numeroCNS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Define o valor da propriedade numeroCNS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
    }

    /**
     * Obtém o valor da propriedade dataAtribuicao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtribuicao() {
        return dataAtribuicao;
    }

    /**
     * Define o valor da propriedade dataAtribuicao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtribuicao(XMLGregorianCalendar value) {
        this.dataAtribuicao = value;
    }

    /**
     * Obtém o valor da propriedade tipoCartao.
     * 
     * @return
     *     possible object is
     *     {@link TipoCNSType }
     *     
     */
    public TipoCNSType getTipoCartao() {
        return tipoCartao;
    }

    /**
     * Define o valor da propriedade tipoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCNSType }
     *     
     */
    public void setTipoCartao(TipoCNSType value) {
        this.tipoCartao = value;
    }

    /**
     * Obtém o valor da propriedade manual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManual() {
        return manual;
    }

    /**
     * Define o valor da propriedade manual.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManual(Boolean value) {
        this.manual = value;
    }

    /**
     * Obtém o valor da propriedade justificativaManual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaManual() {
        return justificativaManual;
    }

    /**
     * Define o valor da propriedade justificativaManual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaManual(String value) {
        this.justificativaManual = value;
    }

}
