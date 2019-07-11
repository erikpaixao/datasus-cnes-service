
package br.jus.cnj.intercomunicacao_2_2;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java de tipoDocumento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="assinatura" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoAssinatura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outroParametro" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoParametro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *         &lt;element name="documentoVinculado" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoDocumento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="idDocumentoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tipoDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataHora" type="{http://www.cnj.jus.br/intercomunicacao-2.2.2}tipoDataHora" /&gt;
 *       &lt;attribute name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nivelSigilo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="movimento" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="hash" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tipoDocumentoLocal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "conteudo",
    "assinatura",
    "outroParametro",
    "any",
    "documentoVinculado"
})
public class TipoDocumento {

    @XmlMimeType("application/octet-stream")
    protected DataHandler conteudo;
    @XmlElement(nillable = true)
    protected List<TipoAssinatura> assinatura;
    @XmlElement(nillable = true)
    protected List<TipoParametro> outroParametro;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlElement(nillable = true)
    protected List<TipoDocumento> documentoVinculado;
    @XmlAttribute(name = "idDocumento")
    protected String idDocumento;
    @XmlAttribute(name = "idDocumentoVinculado")
    protected String idDocumentoVinculado;
    @XmlAttribute(name = "tipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlAttribute(name = "dataHora")
    protected String dataHora;
    @XmlAttribute(name = "mimetype")
    protected String mimetype;
    @XmlAttribute(name = "nivelSigilo")
    protected Integer nivelSigilo;
    @XmlAttribute(name = "movimento")
    protected Integer movimento;
    @XmlAttribute(name = "hash")
    protected String hash;
    @XmlAttribute(name = "descricao")
    protected String descricao;
    @XmlAttribute(name = "tipoDocumentoLocal")
    protected String tipoDocumentoLocal;

    /**
     * Obtém o valor da propriedade conteudo.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getConteudo() {
        return conteudo;
    }

    /**
     * Define o valor da propriedade conteudo.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setConteudo(DataHandler value) {
        this.conteudo = value;
    }

    /**
     * Gets the value of the assinatura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assinatura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssinatura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAssinatura }
     * 
     * 
     */
    public List<TipoAssinatura> getAssinatura() {
        if (assinatura == null) {
            assinatura = new ArrayList<TipoAssinatura>();
        }
        return this.assinatura;
    }

    /**
     * Gets the value of the outroParametro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outroParametro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutroParametro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoParametro }
     * 
     * 
     */
    public List<TipoParametro> getOutroParametro() {
        if (outroParametro == null) {
            outroParametro = new ArrayList<TipoParametro>();
        }
        return this.outroParametro;
    }

    /**
     * Obtém o valor da propriedade any.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Define o valor da propriedade any.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the documentoVinculado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoVinculado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoVinculado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumento }
     * 
     * 
     */
    public List<TipoDocumento> getDocumentoVinculado() {
        if (documentoVinculado == null) {
            documentoVinculado = new ArrayList<TipoDocumento>();
        }
        return this.documentoVinculado;
    }

    /**
     * Obtém o valor da propriedade idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define o valor da propriedade idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtém o valor da propriedade idDocumentoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoVinculado() {
        return idDocumentoVinculado;
    }

    /**
     * Define o valor da propriedade idDocumentoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoVinculado(String value) {
        this.idDocumentoVinculado = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define o valor da propriedade tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade dataHora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHora() {
        return dataHora;
    }

    /**
     * Define o valor da propriedade dataHora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHora(String value) {
        this.dataHora = value;
    }

    /**
     * Obtém o valor da propriedade mimetype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Define o valor da propriedade mimetype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Obtém o valor da propriedade nivelSigilo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelSigilo() {
        return nivelSigilo;
    }

    /**
     * Define o valor da propriedade nivelSigilo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelSigilo(Integer value) {
        this.nivelSigilo = value;
    }

    /**
     * Obtém o valor da propriedade movimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMovimento() {
        return movimento;
    }

    /**
     * Define o valor da propriedade movimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMovimento(Integer value) {
        this.movimento = value;
    }

    /**
     * Obtém o valor da propriedade hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define o valor da propriedade hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumentoLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoLocal() {
        return tipoDocumentoLocal;
    }

    /**
     * Define o valor da propriedade tipoDocumentoLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoLocal(String value) {
        this.tipoDocumentoLocal = value;
    }

}
