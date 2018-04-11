
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.dadosnacionalidade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.corporativo.v1r2.pais.PaisType;


/**
 * <p>Classe Java de DadosNacionalidadeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosNacionalidadeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nacionalidade" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r1/dadosnacionalidade}NacionalidadeType"/&gt;
 *         &lt;element name="PaisNascimento" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/pais}PaisType"/&gt;
 *         &lt;element name="dataNaturalizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="numeroPortariaNaturalizacao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataChegadaBrasil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosNacionalidadeType", propOrder = {
    "nacionalidade",
    "paisNascimento",
    "dataNaturalizacao",
    "numeroPortariaNaturalizacao",
    "dataChegadaBrasil"
})
public class DadosNacionalidadeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NacionalidadeType nacionalidade;
    @XmlElement(name = "PaisNascimento", required = true)
    protected PaisType paisNascimento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNaturalizacao;
    protected String numeroPortariaNaturalizacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataChegadaBrasil;

    /**
     * Obtém o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link NacionalidadeType }
     *     
     */
    public NacionalidadeType getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link NacionalidadeType }
     *     
     */
    public void setNacionalidade(NacionalidadeType value) {
        this.nacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade paisNascimento.
     * 
     * @return
     *     possible object is
     *     {@link PaisType }
     *     
     */
    public PaisType getPaisNascimento() {
        return paisNascimento;
    }

    /**
     * Define o valor da propriedade paisNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisType }
     *     
     */
    public void setPaisNascimento(PaisType value) {
        this.paisNascimento = value;
    }

    /**
     * Obtém o valor da propriedade dataNaturalizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNaturalizacao() {
        return dataNaturalizacao;
    }

    /**
     * Define o valor da propriedade dataNaturalizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNaturalizacao(XMLGregorianCalendar value) {
        this.dataNaturalizacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroPortariaNaturalizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPortariaNaturalizacao() {
        return numeroPortariaNaturalizacao;
    }

    /**
     * Define o valor da propriedade numeroPortariaNaturalizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPortariaNaturalizacao(String value) {
        this.numeroPortariaNaturalizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataChegadaBrasil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegadaBrasil() {
        return dataChegadaBrasil;
    }

    /**
     * Define o valor da propriedade dataChegadaBrasil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegadaBrasil(XMLGregorianCalendar value) {
        this.dataChegadaBrasil = value;
    }

}
