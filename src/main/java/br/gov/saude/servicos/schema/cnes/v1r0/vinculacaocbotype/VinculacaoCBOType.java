package br.gov.saude.servicos.schema.cnes.v1r0.vinculacaocbotype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java de VinculacaoCBOType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="VinculacaoCBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoCBO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoCBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtCargaHorariaAmbulatotial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtCargaHorariaOutros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtCargaHorariaHospSus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comptInicio" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="comptFin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculacaoCBOType", propOrder = {
    "codigoCBO",
    "descricaoCBO",
    "qtCargaHorariaAmbulatotial",
    "qtCargaHorariaOutros",
    "qtCargaHorariaHospSus",
    "comptInicio",
    "comptFin"
})
public class VinculacaoCBOType {

    @XmlElement(required = true)
    protected String codigoCBO;
    protected String descricaoCBO;
    protected String qtCargaHorariaAmbulatotial;
    protected String qtCargaHorariaOutros;
    protected String qtCargaHorariaHospSus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar comptInicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar comptFin;

    /**
     * Obtém o valor da propriedade codigoCBO.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoCBO() {
        return codigoCBO;
    }

    /**
     * Define o valor da propriedade codigoCBO.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoCBO(String value) {
        this.codigoCBO = value;
    }

    /**
     * Obtém o valor da propriedade descricaoCBO.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescricaoCBO() {
        return descricaoCBO;
    }

    /**
     * Define o valor da propriedade descricaoCBO.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescricaoCBO(String value) {
        this.descricaoCBO = value;
    }

    /**
     * Obtém o valor da propriedade qtCargaHorariaAmbulatotial.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQtCargaHorariaAmbulatotial() {
        return qtCargaHorariaAmbulatotial;
    }

    /**
     * Define o valor da propriedade qtCargaHorariaAmbulatotial.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQtCargaHorariaAmbulatotial(String value) {
        this.qtCargaHorariaAmbulatotial = value;
    }

    /**
     * Obtém o valor da propriedade qtCargaHorariaOutros.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQtCargaHorariaOutros() {
        return qtCargaHorariaOutros;
    }

    /**
     * Define o valor da propriedade qtCargaHorariaOutros.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQtCargaHorariaOutros(String value) {
        this.qtCargaHorariaOutros = value;
    }

    /**
     * Obtém o valor da propriedade qtCargaHorariaHospSus.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQtCargaHorariaHospSus() {
        return qtCargaHorariaHospSus;
    }

    /**
     * Define o valor da propriedade qtCargaHorariaHospSus.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQtCargaHorariaHospSus(String value) {
        this.qtCargaHorariaHospSus = value;
    }

    /**
     * Obtém o valor da propriedade comptInicio.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getComptInicio() {
        return comptInicio;
    }

    /**
     * Define o valor da propriedade comptInicio.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setComptInicio(XMLGregorianCalendar value) {
        this.comptInicio = value;
    }

    /**
     * Obtém o valor da propriedade comptFin.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getComptFin() {
        return comptFin;
    }

    /**
     * Define o valor da propriedade comptFin.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setComptFin(XMLGregorianCalendar value) {
        this.comptFin = value;
    }

}
