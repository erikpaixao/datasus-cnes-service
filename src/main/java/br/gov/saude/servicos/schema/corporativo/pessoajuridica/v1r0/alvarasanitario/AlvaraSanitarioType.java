package br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.alvarasanitario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de AlvaraSanitarioType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="AlvaraSanitarioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroAlvara" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataVigenciaInicial" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataVigenciaFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlvaraSanitarioType", propOrder = {
    "numeroAlvara",
    "dataVigenciaInicial",
    "dataVigenciaFinal"
})
public class AlvaraSanitarioType {

    protected String numeroAlvara;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVigenciaInicial;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVigenciaFinal;

    /**
     * Obtém o valor da propriedade numeroAlvara.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroAlvara() {
        return numeroAlvara;
    }

    /**
     * Define o valor da propriedade numeroAlvara.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroAlvara(String value) {
        this.numeroAlvara = value;
    }

    /**
     * Obtém o valor da propriedade dataVigenciaInicial.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataVigenciaInicial() {
        return dataVigenciaInicial;
    }

    /**
     * Define o valor da propriedade dataVigenciaInicial.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDataVigenciaInicial(XMLGregorianCalendar value) {
        this.dataVigenciaInicial = value;
    }

    /**
     * Obtém o valor da propriedade dataVigenciaFinal.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataVigenciaFinal() {
        return dataVigenciaFinal;
    }

    /**
     * Define o valor da propriedade dataVigenciaFinal.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDataVigenciaFinal(XMLGregorianCalendar value) {
        this.dataVigenciaFinal = value;
    }

}
