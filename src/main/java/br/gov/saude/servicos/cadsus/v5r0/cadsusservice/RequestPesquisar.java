
package br.gov.saude.servicos.cadsus.v5r0.cadsusservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.filtropesquisa.FiltroPesquisa;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v5r0/filtropesquisa}FiltroPesquisa"/&gt;
 *         &lt;element name="higienizar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "filtroPesquisa",
    "higienizar"
})
@XmlRootElement(name = "requestPesquisar")
public class RequestPesquisar {

    @XmlElement(name = "CNESUsuario", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", required = true)
    protected CNESUsuarioType cnesUsuario;
    @XmlElement(name = "FiltroPesquisa", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/filtropesquisa", required = true)
    protected FiltroPesquisa filtroPesquisa;
    protected boolean higienizar;

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
     * Obtém o valor da propriedade filtroPesquisa.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisa }
     *     
     */
    public FiltroPesquisa getFiltroPesquisa() {
        return filtroPesquisa;
    }

    /**
     * Define o valor da propriedade filtroPesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisa }
     *     
     */
    public void setFiltroPesquisa(FiltroPesquisa value) {
        this.filtroPesquisa = value;
    }

    /**
     * Obtém o valor da propriedade higienizar.
     * 
     */
    public boolean isHigienizar() {
        return higienizar;
    }

    /**
     * Define o valor da propriedade higienizar.
     * 
     */
    public void setHigienizar(boolean value) {
        this.higienizar = value;
    }

}