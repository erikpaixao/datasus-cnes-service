
package br.gov.saude.servicos.cadsus.v5r0.cadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus.UsuarioSUSType;
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
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus}UsuarioSUS"/&gt;
 *         &lt;element name="higienizar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "usuarioSUS",
    "higienizar"
})
@XmlRootElement(name = "requestIncluir")
public class RequestIncluir {

    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlElement(name = "UsuarioSUS", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus", required = true)
    protected UsuarioSUSType usuarioSUS;
    protected Boolean higienizar;

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
     * Obtém o valor da propriedade usuarioSUS.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType }
     *     
     */
    public UsuarioSUSType getUsuarioSUS() {
        return usuarioSUS;
    }

    /**
     * Define o valor da propriedade usuarioSUS.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType }
     *     
     */
    public void setUsuarioSUS(UsuarioSUSType value) {
        this.usuarioSUS = value;
    }

    /**
     * Obtém o valor da propriedade higienizar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHigienizar() {
        return higienizar;
    }

    /**
     * Define o valor da propriedade higienizar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHigienizar(Boolean value) {
        this.higienizar = value;
    }

}
