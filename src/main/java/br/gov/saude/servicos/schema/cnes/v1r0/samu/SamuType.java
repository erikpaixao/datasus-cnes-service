
package br.gov.saude.servicos.schema.cnes.v1r0.samu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SamuType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SamuType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoPrefixoAeronave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroEmbacacaoMarinha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataAtivacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataDesativacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="codigoDesativacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamuType", propOrder = {
    "placa",
    "chassi",
    "codigoPrefixoAeronave",
    "numeroEmbacacaoMarinha",
    "dataAtivacao",
    "dataDesativacao",
    "codigoDesativacao"
})
public class SamuType {

    protected String placa;
    protected String chassi;
    protected String codigoPrefixoAeronave;
    protected String numeroEmbacacaoMarinha;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAtivacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDesativacao;
    protected String codigoDesativacao;

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade chassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Define o valor da propriedade chassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassi(String value) {
        this.chassi = value;
    }

    /**
     * Obtém o valor da propriedade codigoPrefixoAeronave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrefixoAeronave() {
        return codigoPrefixoAeronave;
    }

    /**
     * Define o valor da propriedade codigoPrefixoAeronave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrefixoAeronave(String value) {
        this.codigoPrefixoAeronave = value;
    }

    /**
     * Obtém o valor da propriedade numeroEmbacacaoMarinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEmbacacaoMarinha() {
        return numeroEmbacacaoMarinha;
    }

    /**
     * Define o valor da propriedade numeroEmbacacaoMarinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEmbacacaoMarinha(String value) {
        this.numeroEmbacacaoMarinha = value;
    }

    /**
     * Obtém o valor da propriedade dataAtivacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtivacao() {
        return dataAtivacao;
    }

    /**
     * Define o valor da propriedade dataAtivacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtivacao(XMLGregorianCalendar value) {
        this.dataAtivacao = value;
    }

    /**
     * Obtém o valor da propriedade dataDesativacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDesativacao() {
        return dataDesativacao;
    }

    /**
     * Define o valor da propriedade dataDesativacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDesativacao(XMLGregorianCalendar value) {
        this.dataDesativacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoDesativacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDesativacao() {
        return codigoDesativacao;
    }

    /**
     * Define o valor da propriedade codigoDesativacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDesativacao(String value) {
        this.codigoDesativacao = value;
    }

}
