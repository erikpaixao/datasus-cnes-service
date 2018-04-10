
package br.gov.saude.servicos.schema.cnes.v1r0.complementoesferaadministrativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.esferaadministrativa.EsferaAdministrativaType;
import br.gov.saude.servicos.schema.cnes.v1r0.tipogestao.TipoGestaoType;


/**
 * <p>Classe Java de ComplementoEsferaAdministrativaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplementoEsferaAdministrativaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa}esferaAdministrativa"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao}tipoGestao"/&gt;
 *         &lt;element name="quantidadeEstabelecimentos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementoEsferaAdministrativaType", propOrder = {
    "esferaAdministrativa",
    "tipoGestao",
    "quantidadeEstabelecimentos"
})
public class ComplementoEsferaAdministrativaType {

    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa", required = true)
    protected EsferaAdministrativaType esferaAdministrativa;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao", required = true)
    protected TipoGestaoType tipoGestao;
    protected int quantidadeEstabelecimentos;

    /**
     * Obtém o valor da propriedade esferaAdministrativa.
     * 
     * @return
     *     possible object is
     *     {@link EsferaAdministrativaType }
     *     
     */
    public EsferaAdministrativaType getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    /**
     * Define o valor da propriedade esferaAdministrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link EsferaAdministrativaType }
     *     
     */
    public void setEsferaAdministrativa(EsferaAdministrativaType value) {
        this.esferaAdministrativa = value;
    }

    /**
     * Obtém o valor da propriedade tipoGestao.
     * 
     * @return
     *     possible object is
     *     {@link TipoGestaoType }
     *     
     */
    public TipoGestaoType getTipoGestao() {
        return tipoGestao;
    }

    /**
     * Define o valor da propriedade tipoGestao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoGestaoType }
     *     
     */
    public void setTipoGestao(TipoGestaoType value) {
        this.tipoGestao = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeEstabelecimentos.
     * 
     */
    public int getQuantidadeEstabelecimentos() {
        return quantidadeEstabelecimentos;
    }

    /**
     * Define o valor da propriedade quantidadeEstabelecimentos.
     * 
     */
    public void setQuantidadeEstabelecimentos(int value) {
        this.quantidadeEstabelecimentos = value;
    }

}
