
package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario}CNESUsuario"/&gt;
 *         &lt;element name="identificadorTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cnesUsuario",
    "identificadorTransacao"
})
@XmlRootElement(name = "requestObterCamposAlteradosPorTransacao")
public class RequestObterCamposAlteradosPorTransacao {

    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlElement(required = true)
    protected String identificadorTransacao;

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

}
