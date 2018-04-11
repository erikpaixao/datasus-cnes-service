
package br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cadsus.v1r0.protocoloprecadastro.ProtocoloPreCadastroType;


/**
 * <p>Classe Java de DadosPreCadastroType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosPreCadastroType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProtocoloPreCadastro" type="{http://servicos.saude.gov.br/schema/cadsus/v1r0/protocoloprecadastro}ProtocoloPreCadastroType" minOccurs="0"/&gt;
 *         &lt;element name="homologado" type="{http://servicos.saude.gov.br/schema/cadsus/v1r1/dadosprecadastro}HomologadoType" minOccurs="0"/&gt;
 *         &lt;element name="dataHomologacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="solicitouAcessoPortal" type="{http://servicos.saude.gov.br/schema/cadsus/v1r1/dadosprecadastro}SolicitouAcessoPortalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPreCadastroType", propOrder = {
    "protocoloPreCadastro",
    "homologado",
    "dataHomologacao",
    "solicitouAcessoPortal"
})
public class DadosPreCadastroType {

    @XmlElement(name = "ProtocoloPreCadastro")
    protected ProtocoloPreCadastroType protocoloPreCadastro;
    @XmlSchemaType(name = "string")
    protected HomologadoType homologado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHomologacao;
    @XmlSchemaType(name = "string")
    protected SolicitouAcessoPortalType solicitouAcessoPortal;

    /**
     * Obtém o valor da propriedade protocoloPreCadastro.
     * 
     * @return
     *     possible object is
     *     {@link ProtocoloPreCadastroType }
     *     
     */
    public ProtocoloPreCadastroType getProtocoloPreCadastro() {
        return protocoloPreCadastro;
    }

    /**
     * Define o valor da propriedade protocoloPreCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocoloPreCadastroType }
     *     
     */
    public void setProtocoloPreCadastro(ProtocoloPreCadastroType value) {
        this.protocoloPreCadastro = value;
    }

    /**
     * Obtém o valor da propriedade homologado.
     * 
     * @return
     *     possible object is
     *     {@link HomologadoType }
     *     
     */
    public HomologadoType getHomologado() {
        return homologado;
    }

    /**
     * Define o valor da propriedade homologado.
     * 
     * @param value
     *     allowed object is
     *     {@link HomologadoType }
     *     
     */
    public void setHomologado(HomologadoType value) {
        this.homologado = value;
    }

    /**
     * Obtém o valor da propriedade dataHomologacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHomologacao() {
        return dataHomologacao;
    }

    /**
     * Define o valor da propriedade dataHomologacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHomologacao(XMLGregorianCalendar value) {
        this.dataHomologacao = value;
    }

    /**
     * Obtém o valor da propriedade solicitouAcessoPortal.
     * 
     * @return
     *     possible object is
     *     {@link SolicitouAcessoPortalType }
     *     
     */
    public SolicitouAcessoPortalType getSolicitouAcessoPortal() {
        return solicitouAcessoPortal;
    }

    /**
     * Define o valor da propriedade solicitouAcessoPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitouAcessoPortalType }
     *     
     */
    public void setSolicitouAcessoPortal(SolicitouAcessoPortalType value) {
        this.solicitouAcessoPortal = value;
    }

}
