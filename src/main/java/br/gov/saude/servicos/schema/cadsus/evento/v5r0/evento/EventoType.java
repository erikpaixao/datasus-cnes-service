
package br.gov.saude.servicos.schema.cadsus.evento.v5r0.evento;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.schema.cadsus.evento.v1r1.funcionalidade.FuncionalidadeType;
import br.gov.saude.servicos.schema.cadsus.evento.v5r0.operacao.OperacaoType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;


/**
 * <p>Classe Java de EventoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EventoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNESUsuario" type="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario}CNESUsuarioType"/&gt;
 *         &lt;element name="identificadorEvento" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Funcionalidade" type="{http://servicos.saude.gov.br/schema/cadsus/evento/v1r1/funcionalidade}FuncionalidadeType"/&gt;
 *         &lt;element name="Operacao" type="{http://servicos.saude.gov.br/schema/cadsus/evento/v5r0/operacao}OperacaoType" minOccurs="0"/&gt;
 *         &lt;element name="CNS" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNSType" minOccurs="0"/&gt;
 *         &lt;element name="dataEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventoType", propOrder = {
    "cnesUsuario",
    "identificadorEvento",
    "funcionalidade",
    "operacao",
    "cns",
    "dataEvento"
})
public class EventoType {

    @XmlElement(name = "CNESUsuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificadorEvento;
    @XmlElement(name = "Funcionalidade", required = true)
    protected FuncionalidadeType funcionalidade;
    @XmlElement(name = "Operacao")
    protected OperacaoType operacao;
    @XmlElement(name = "CNS")
    protected CNSType cns;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEvento;

    /**
     * Obtém o valor da propriedade cnesUsuario.
     * 
     * @return
     *     possible object is
     *     {@link CNESUsuarioType }
     *     
     */
    public CNESUsuarioType getCNESUsuario() {
        return cnesUsuario;
    }

    /**
     * Define o valor da propriedade cnesUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link CNESUsuarioType }
     *     
     */
    public void setCNESUsuario(CNESUsuarioType value) {
        this.cnesUsuario = value;
    }

    /**
     * Obtém o valor da propriedade identificadorEvento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificadorEvento() {
        return identificadorEvento;
    }

    /**
     * Define o valor da propriedade identificadorEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificadorEvento(BigInteger value) {
        this.identificadorEvento = value;
    }

    /**
     * Obtém o valor da propriedade funcionalidade.
     * 
     * @return
     *     possible object is
     *     {@link FuncionalidadeType }
     *     
     */
    public FuncionalidadeType getFuncionalidade() {
        return funcionalidade;
    }

    /**
     * Define o valor da propriedade funcionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionalidadeType }
     *     
     */
    public void setFuncionalidade(FuncionalidadeType value) {
        this.funcionalidade = value;
    }

    /**
     * Obtém o valor da propriedade operacao.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoType }
     *     
     */
    public OperacaoType getOperacao() {
        return operacao;
    }

    /**
     * Define o valor da propriedade operacao.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoType }
     *     
     */
    public void setOperacao(OperacaoType value) {
        this.operacao = value;
    }

    /**
     * Obtém o valor da propriedade cns.
     * 
     * @return
     *     possible object is
     *     {@link CNSType }
     *     
     */
    public CNSType getCNS() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     * 
     * @param value
     *     allowed object is
     *     {@link CNSType }
     *     
     */
    public void setCNS(CNSType value) {
        this.cns = value;
    }

    /**
     * Obtém o valor da propriedade dataEvento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvento() {
        return dataEvento;
    }

    /**
     * Define o valor da propriedade dataEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvento(XMLGregorianCalendar value) {
        this.dataEvento = value;
    }

}
