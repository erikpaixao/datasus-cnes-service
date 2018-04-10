
package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.vinculacao.VinculacaosType;
import br.gov.saude.servicos.wsdl.mensageria.v1.paginacao.PaginacaoType;


/**
 * <p>Classe Java de ResponseVinculacaos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseVinculacaos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao}Vinculacaos" minOccurs="0"/&gt;
 *         &lt;element name="Paginacao" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1/paginacao}PaginacaoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseVinculacaos", propOrder = {
    "vinculacaos",
    "paginacao"
})
public class ResponseVinculacaos {

    @XmlElement(name = "Vinculacaos", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao")
    protected VinculacaosType vinculacaos;
    @XmlElement(name = "Paginacao", namespace = "", required = true)
    protected PaginacaoType paginacao;

    /**
     * Obtém o valor da propriedade vinculacaos.
     * 
     * @return
     *     possible object is
     *     {@link VinculacaosType }
     *     
     */
    public VinculacaosType getVinculacaos() {
        return vinculacaos;
    }

    /**
     * Define o valor da propriedade vinculacaos.
     * 
     * @param value
     *     allowed object is
     *     {@link VinculacaosType }
     *     
     */
    public void setVinculacaos(VinculacaosType value) {
        this.vinculacaos = value;
    }

    /**
     * Obtém o valor da propriedade paginacao.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoType }
     *     
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Define o valor da propriedade paginacao.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoType }
     *     
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}
