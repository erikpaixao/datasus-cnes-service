
package br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidaoantiga;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CertidaoAntigaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CertidaoAntigaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TipoCertidao" type="{http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/tipocertidao}TipoCertidaoType"/&gt;
 *         &lt;element name="nomeCartorio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;pattern value="[-0-9A-Z ]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="livro" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;pattern value="[-0-9A-Z]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="folha" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="[-0-9A-Z]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="termo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;pattern value="[-0-9A-Z]*"/&gt;
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
@XmlType(name = "CertidaoAntigaType", propOrder = {
    "identificador",
    "tipoCertidao",
    "nomeCartorio",
    "livro",
    "folha",
    "termo",
    "dataEmissao"
})
public class CertidaoAntigaType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "TipoCertidao", required = true)
    protected String tipoCertidao;
    protected String nomeCartorio;
    protected String livro;
    protected String folha;
    protected String termo;
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
     * Obtém o valor da propriedade nomeCartorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCartorio() {
        return nomeCartorio;
    }

    /**
     * Define o valor da propriedade nomeCartorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCartorio(String value) {
        this.nomeCartorio = value;
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
