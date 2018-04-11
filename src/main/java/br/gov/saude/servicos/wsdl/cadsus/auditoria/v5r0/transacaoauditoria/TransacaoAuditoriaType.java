
package br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.transacaoauditoria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.tipotransacao.TipoTransacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;


/**
 * <p>Classe Java de TransacaoAuditoriaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransacaoAuditoriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataHoraTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="identificadorTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario}CNESUsuario"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/tipotransacao}TipoTransacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransacaoAuditoriaType", propOrder = {
    "dataHoraTransacao",
    "identificadorTransacao",
    "cnesUsuario",
    "tipoTransacao"
})
public class TransacaoAuditoriaType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraTransacao;
    @XmlElement(required = true)
    protected String identificadorTransacao;
    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlElement(name = "TipoTransacao", namespace = "http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/tipotransacao")
    @XmlSchemaType(name = "string")
    protected TipoTransacaoType tipoTransacao;

    /**
     * Obtém o valor da propriedade dataHoraTransacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    /**
     * Define o valor da propriedade dataHoraTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraTransacao(XMLGregorianCalendar value) {
        this.dataHoraTransacao = value;
    }

    /**
     * Obtém o valor da propriedade identificadorTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorTransacao() {
        return identificadorTransacao;
    }

    /**
     * Define o valor da propriedade identificadorTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorTransacao(String value) {
        this.identificadorTransacao = value;
    }

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
     * Obtém o valor da propriedade tipoTransacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoTransacaoType }
     *     
     */
    public TipoTransacaoType getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * Define o valor da propriedade tipoTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTransacaoType }
     *     
     */
    public void setTipoTransacao(TipoTransacaoType value) {
        this.tipoTransacao = value;
    }

}
