
package br.gov.saude.servicos.schema.corporativo.documento.v1r1.ric;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.orgaoemissor.OrgaoEmissorType;


/**
 * <p>Classe Java de RICType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RICType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numeroRIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="11"/&gt;
 *               &lt;maxLength value="11"/&gt;
 *               &lt;pattern value="[1-9][0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataExpedicao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OrgaoEmissor" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/orgaoemissor}OrgaoEmissorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RICType", propOrder = {
    "identificador",
    "numeroRIC",
    "dataValidade",
    "dataExpedicao",
    "orgaoEmissor"
})
public class RICType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    protected String numeroRIC;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExpedicao;
    @XmlElement(name = "OrgaoEmissor")
    protected OrgaoEmissorType orgaoEmissor;

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
     * Obtém o valor da propriedade numeroRIC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRIC() {
        return numeroRIC;
    }

    /**
     * Define o valor da propriedade numeroRIC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRIC(String value) {
        this.numeroRIC = value;
    }

    /**
     * Obtém o valor da propriedade dataValidade.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Define o valor da propriedade dataValidade.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

    /**
     * Obtém o valor da propriedade dataExpedicao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExpedicao() {
        return dataExpedicao;
    }

    /**
     * Define o valor da propriedade dataExpedicao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExpedicao(XMLGregorianCalendar value) {
        this.dataExpedicao = value;
    }

    /**
     * Obtém o valor da propriedade orgaoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link OrgaoEmissorType }
     *     
     */
    public OrgaoEmissorType getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Define o valor da propriedade orgaoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgaoEmissorType }
     *     
     */
    public void setOrgaoEmissor(OrgaoEmissorType value) {
        this.orgaoEmissor = value;
    }

}
