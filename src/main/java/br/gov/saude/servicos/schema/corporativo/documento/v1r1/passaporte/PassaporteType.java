
package br.gov.saude.servicos.schema.corporativo.documento.v1r1.passaporte;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.corporativo.v1r2.pais.PaisType;


/**
 * <p>Classe Java de PassaporteType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PassaporteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numeroPassaporte" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pais" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/pais}PaisType" minOccurs="0"/&gt;
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataExpedicao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassaporteType", propOrder = {
    "identificador",
    "numeroPassaporte",
    "pais",
    "dataValidade",
    "dataExpedicao"
})
public class PassaporteType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    protected String numeroPassaporte;
    @XmlElement(name = "Pais")
    protected PaisType pais;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExpedicao;

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
     * Obtém o valor da propriedade numeroPassaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    /**
     * Define o valor da propriedade numeroPassaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPassaporte(String value) {
        this.numeroPassaporte = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link PaisType }
     *     
     */
    public PaisType getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisType }
     *     
     */
    public void setPais(PaisType value) {
        this.pais = value;
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

}
