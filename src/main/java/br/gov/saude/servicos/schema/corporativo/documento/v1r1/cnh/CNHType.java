
package br.gov.saude.servicos.schema.corporativo.documento.v1r1.cnh;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CNHType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CNHType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numeroCNH" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="siglaUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNHType", propOrder = {
    "identificador",
    "numeroCNH",
    "dataEmissao",
    "siglaUF"
})
public class CNHType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    protected String numeroCNH;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;
    protected String siglaUF;

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
     * Obtém o valor da propriedade numeroCNH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNH() {
        return numeroCNH;
    }

    /**
     * Define o valor da propriedade numeroCNH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNH(String value) {
        this.numeroCNH = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade siglaUF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaUF() {
        return siglaUF;
    }

    /**
     * Define o valor da propriedade siglaUF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaUF(String value) {
        this.siglaUF = value;
    }

}
