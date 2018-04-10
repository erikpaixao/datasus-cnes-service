package br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.nomejuridico.NomeJuridicoType;

/**
 * <p>
 * Classe Java de DadosBasicosEstabelecimentoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="DadosBasicosEstabelecimentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES"/&gt;
 *         &lt;element name="NomeFantasia" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico}NomeJuridicoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosBasicosEstabelecimentoType", propOrder = {
    "codigoCNES",
    "nomeFantasia"
})
public class DadosBasicosEstabelecimentoType {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes", required = true)
    protected CodigoCNESType codigoCNES;
    @XmlElement(name = "NomeFantasia")
    protected NomeJuridicoType nomeFantasia;

    /**
     * Código do Estabelecimento de Saúde..
     *
     * @return possible object is {@link CodigoCNESType }
     *
     */
    public CodigoCNESType getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     *
     * @param value allowed object is {@link CodigoCNESType }
     *
     */
    public void setCodigoCNES(CodigoCNESType value) {
        this.codigoCNES = value;
    }

    /**
     * Obtém o valor da propriedade nomeFantasia.
     *
     * @return possible object is {@link NomeJuridicoType }
     *
     */
    public NomeJuridicoType getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     *
     * @param value allowed object is {@link NomeJuridicoType }
     *
     */
    public void setNomeFantasia(NomeJuridicoType value) {
        this.nomeFantasia = value;
    }

}
