package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.wsdl.mensageria.v1.paginacao.PaginacaoType;
import br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos.FiltroPesquisaVinculacaosType;

/**
 * <p>
 * Classe Java de RequestVinculacaos complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="RequestVinculacaos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacaos}FiltroPesquisaVinculacaos" minOccurs="0"/&gt;
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
@XmlType(name = "RequestVinculacaos", propOrder = {
    "filtroPesquisaVinculacaos",
    "paginacao"
})
public class RequestVinculacaos {

    @XmlElement(name = "FiltroPesquisaVinculacaos", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacaos")
    protected FiltroPesquisaVinculacaosType filtroPesquisaVinculacaos;
    @XmlElement(name = "Paginacao", namespace = "", required = true)
    protected PaginacaoType paginacao;

    /**
     * Obtém o valor da propriedade filtroPesquisaVinculacaos.
     *
     * @return possible object is {@link FiltroPesquisaVinculacaosType }
     *
     */
    public FiltroPesquisaVinculacaosType getFiltroPesquisaVinculacaos() {
        return filtroPesquisaVinculacaos;
    }

    /**
     * Define o valor da propriedade filtroPesquisaVinculacaos.
     *
     * @param value allowed object is {@link FiltroPesquisaVinculacaosType }
     *
     */
    public void setFiltroPesquisaVinculacaos(FiltroPesquisaVinculacaosType value) {
        this.filtroPesquisaVinculacaos = value;
    }

    /**
     * Obtém o valor da propriedade paginacao.
     *
     * @return possible object is {@link PaginacaoType }
     *
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Define o valor da propriedade paginacao.
     *
     * @param value allowed object is {@link PaginacaoType }
     *
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}
