
package br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r2.certidao;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CertidaoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CertidaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TipoCertidao" type="{http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/tipocertidao}TipoCertidaoType"/&gt;
 *         &lt;element name="numeroCartorio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="6"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="acervo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="servicoRegistroCivil" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ano" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[1-9][0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tipoLivro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="livro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="5"/&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="folha" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="termo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="7"/&gt;
 *               &lt;maxLength value="7"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="digitoVerificador" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertidaoType", propOrder = {
    "identificador",
    "tipoCertidao",
    "numeroCartorio",
    "acervo",
    "servicoRegistroCivil",
    "ano",
    "tipoLivro",
    "livro",
    "folha",
    "termo",
    "digitoVerificador",
    "dataEmissao"
})
public class CertidaoType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "TipoCertidao", required = true)
    protected String tipoCertidao;
    protected String numeroCartorio;
    protected String acervo;
    protected String servicoRegistroCivil;
    protected String ano;
    protected String tipoLivro;
    protected String livro;
    protected String folha;
    protected String termo;
    protected String digitoVerificador;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;

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
     * Obtém o valor da propriedade tipoCertidao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCertidao() {
        return tipoCertidao;
    }

    /**
     * Define o valor da propriedade tipoCertidao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCertidao(String value) {
        this.tipoCertidao = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartorio() {
        return numeroCartorio;
    }

    /**
     * Define o valor da propriedade numeroCartorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartorio(String value) {
        this.numeroCartorio = value;
    }

    /**
     * Obtém o valor da propriedade acervo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcervo() {
        return acervo;
    }

    /**
     * Define o valor da propriedade acervo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcervo(String value) {
        this.acervo = value;
    }

    /**
     * Obtém o valor da propriedade servicoRegistroCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoRegistroCivil() {
        return servicoRegistroCivil;
    }

    /**
     * Define o valor da propriedade servicoRegistroCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoRegistroCivil(String value) {
        this.servicoRegistroCivil = value;
    }

    /**
     * Obtém o valor da propriedade ano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno(String value) {
        this.ano = value;
    }

    /**
     * Obtém o valor da propriedade tipoLivro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLivro() {
        return tipoLivro;
    }

    /**
     * Define o valor da propriedade tipoLivro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLivro(String value) {
        this.tipoLivro = value;
    }

    /**
     * Obtém o valor da propriedade livro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivro() {
        return livro;
    }

    /**
     * Define o valor da propriedade livro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivro(String value) {
        this.livro = value;
    }

    /**
     * Obtém o valor da propriedade folha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolha() {
        return folha;
    }

    /**
     * Define o valor da propriedade folha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolha(String value) {
        this.folha = value;
    }

    /**
     * Obtém o valor da propriedade termo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermo() {
        return termo;
    }

    /**
     * Define o valor da propriedade termo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermo(String value) {
        this.termo = value;
    }

    /**
     * Obtém o valor da propriedade digitoVerificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    /**
     * Define o valor da propriedade digitoVerificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificador(String value) {
        this.digitoVerificador = value;
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

}
