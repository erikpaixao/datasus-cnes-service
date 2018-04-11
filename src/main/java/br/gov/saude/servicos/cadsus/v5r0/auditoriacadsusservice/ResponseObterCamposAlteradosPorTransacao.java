
package br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.usuariosusauditoria.UsuarioSUSAuditoriaType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/usuariosusauditoria}UsuarioSUSAuditoria"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario}CNESUsuario"/&gt;
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
    "usuarioSUSAuditoria",
    "cnesUsuario"
})
@XmlRootElement(name = "responseObterCamposAlteradosPorTransacao")
public class ResponseObterCamposAlteradosPorTransacao {

    @XmlElement(name = "UsuarioSUSAuditoria", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/usuariosusauditoria", required = true)
    protected UsuarioSUSAuditoriaType usuarioSUSAuditoria;
    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;

    /**
     * Obtém o valor da propriedade usuarioSUSAuditoria.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSAuditoriaType }
     *     
     */
    public UsuarioSUSAuditoriaType getUsuarioSUSAuditoria() {
        return usuarioSUSAuditoria;
    }

    /**
     * Define o valor da propriedade usuarioSUSAuditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSAuditoriaType }
     *     
     */
    public void setUsuarioSUSAuditoria(UsuarioSUSAuditoriaType value) {
        this.usuarioSUSAuditoria = value;
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

}
