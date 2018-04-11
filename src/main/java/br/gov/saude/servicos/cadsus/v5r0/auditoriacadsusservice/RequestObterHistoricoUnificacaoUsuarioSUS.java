
package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo.IdentificadorCorporativoType;
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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo}IdentificadorCorporativo"/&gt;
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
    "identificadorCorporativo"
})
@XmlRootElement(name = "requestObterHistoricoUnificacaoUsuarioSUS")
public class RequestObterHistoricoUnificacaoUsuarioSUS {

    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlElement(name = "IdentificadorCorporativo", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo", required = true)
    protected IdentificadorCorporativoType identificadorCorporativo;

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
     * Obtém o valor da propriedade identificadorCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorCorporativoType }
     *     
     */
    public IdentificadorCorporativoType getIdentificadorCorporativo() {
        return identificadorCorporativo;
    }

    /**
     * Define o valor da propriedade identificadorCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorCorporativoType }
     *     
     */
    public void setIdentificadorCorporativo(IdentificadorCorporativoType value) {
        this.identificadorCorporativo = value;
    }

}
