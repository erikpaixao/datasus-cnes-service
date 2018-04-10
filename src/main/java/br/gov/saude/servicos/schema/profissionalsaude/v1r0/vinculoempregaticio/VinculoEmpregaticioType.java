
package br.gov.saude.servicos.schema.profissionalsaude.v1r0.vinculoempregaticio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.profissionalsaude.v1r0.tipovinculoempregaticio.TipoVinculoEmpregaticioType;


/**
 * <p>Classe Java de VinculoEmpregaticioType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VinculoEmpregaticioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoVinculacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoVinculacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/tipovinculoempregaticio}tipoVinculoEmpregaticio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculoEmpregaticioType", propOrder = {
    "codigoVinculacao",
    "descricaoVinculacao",
    "tipoVinculoEmpregaticio"
})
public class VinculoEmpregaticioType {

    @XmlElement(required = true)
    protected String codigoVinculacao;
    @XmlElement(required = true)
    protected String descricaoVinculacao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/tipovinculoempregaticio", required = true)
    protected TipoVinculoEmpregaticioType tipoVinculoEmpregaticio;

    /**
     * Obtém o valor da propriedade codigoVinculacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVinculacao() {
        return codigoVinculacao;
    }

    /**
     * Define o valor da propriedade codigoVinculacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVinculacao(String value) {
        this.codigoVinculacao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoVinculacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoVinculacao() {
        return descricaoVinculacao;
    }

    /**
     * Define o valor da propriedade descricaoVinculacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoVinculacao(String value) {
        this.descricaoVinculacao = value;
    }

    /**
     * Tipo do Vínculo Empregatício.
     * 
     * @return
     *     possible object is
     *     {@link TipoVinculoEmpregaticioType }
     *     
     */
    public TipoVinculoEmpregaticioType getTipoVinculoEmpregaticio() {
        return tipoVinculoEmpregaticio;
    }

    /**
     * Define o valor da propriedade tipoVinculoEmpregaticio.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVinculoEmpregaticioType }
     *     
     */
    public void setTipoVinculoEmpregaticio(TipoVinculoEmpregaticioType value) {
        this.tipoVinculoEmpregaticio = value;
    }

}
