
package br.gov.saude.servicos.schema.corporativo.v1r1.fotografia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de FotografiaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FotografiaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="dataCaptura" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="identificadorImagem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *               &lt;maxInclusive value="999999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bytesImagem" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FotografiaType", propOrder = {
    "identificador",
    "dataCaptura",
    "identificadorImagem",
    "bytesImagem"
})
public class FotografiaType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataCaptura;
    protected Long identificadorImagem;
    protected byte[] bytesImagem;

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
     * Obtém o valor da propriedade dataCaptura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCaptura() {
        return dataCaptura;
    }

    /**
     * Define o valor da propriedade dataCaptura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCaptura(XMLGregorianCalendar value) {
        this.dataCaptura = value;
    }

    /**
     * Obtém o valor da propriedade identificadorImagem.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificadorImagem() {
        return identificadorImagem;
    }

    /**
     * Define o valor da propriedade identificadorImagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificadorImagem(Long value) {
        this.identificadorImagem = value;
    }

    /**
     * Obtém o valor da propriedade bytesImagem.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBytesImagem() {
        return bytesImagem;
    }

    /**
     * Define o valor da propriedade bytesImagem.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBytesImagem(byte[] value) {
        this.bytesImagem = value;
    }

}
