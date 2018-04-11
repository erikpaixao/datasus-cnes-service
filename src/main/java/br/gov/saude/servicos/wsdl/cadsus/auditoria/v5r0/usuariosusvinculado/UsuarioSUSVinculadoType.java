
package br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.usuariosusvinculado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus.UsuarioSUSType;


/**
 * <p>Classe Java de UsuarioSUSVinculadoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UsuarioSUSVinculadoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorTransacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus}UsuarioSUS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioSUSVinculadoType", propOrder = {
    "identificadorTransacao",
    "usuarioSUS"
})
public class UsuarioSUSVinculadoType {

    @XmlElement(required = true)
    protected String identificadorTransacao;
    @XmlElement(name = "UsuarioSUS", namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus", required = true)
    protected UsuarioSUSType usuarioSUS;

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

}
