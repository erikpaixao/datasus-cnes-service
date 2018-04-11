
package br.gov.saude.servicos.wsdl.mensageria.v5r0.usuariosusauditoria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus.UsuarioSUSType;


/**
 * <p>Classe Java de UsuarioSUSAuditoriaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UsuarioSUSAuditoriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioSUSAtual" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus}UsuarioSUSType"/&gt;
 *         &lt;element name="UsuarioSUSAntigo" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus}UsuarioSUSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioSUSAuditoriaType", propOrder = {
    "usuarioSUSAtual",
    "usuarioSUSAntigo"
})
public class UsuarioSUSAuditoriaType {

    @XmlElement(name = "UsuarioSUSAtual", required = true)
    protected UsuarioSUSType usuarioSUSAtual;
    @XmlElement(name = "UsuarioSUSAntigo")
    protected UsuarioSUSType usuarioSUSAntigo;

    /**
     * Obtém o valor da propriedade usuarioSUSAtual.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType }
     *     
     */
    public UsuarioSUSType getUsuarioSUSAtual() {
        return usuarioSUSAtual;
    }

    /**
     * Define o valor da propriedade usuarioSUSAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType }
     *     
     */
    public void setUsuarioSUSAtual(UsuarioSUSType value) {
        this.usuarioSUSAtual = value;
    }

    /**
     * Obtém o valor da propriedade usuarioSUSAntigo.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioSUSType }
     *     
     */
    public UsuarioSUSType getUsuarioSUSAntigo() {
        return usuarioSUSAntigo;
    }

    /**
     * Define o valor da propriedade usuarioSUSAntigo.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioSUSType }
     *     
     */
    public void setUsuarioSUSAntigo(UsuarioSUSType value) {
        this.usuarioSUSAntigo = value;
    }

}
