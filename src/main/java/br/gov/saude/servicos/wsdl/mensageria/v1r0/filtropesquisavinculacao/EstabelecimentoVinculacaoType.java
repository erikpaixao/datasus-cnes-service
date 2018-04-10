package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnpj.CNPJType;

/**
 * <p>
 * Classe Java de EstabelecimentoVinculacaoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="EstabelecimentoVinculacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cnes" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNESType"/&gt;
 *         &lt;element name="cnpj" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj}CNPJType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstabelecimentoVinculacaoType", propOrder = {
    "cnes",
    "cnpj"
})
public class EstabelecimentoVinculacaoType {

    protected CodigoCNESType cnes;
    protected CNPJType cnpj;

    /**
     * Obtém o valor da propriedade cnes.
     *
     * @return possible object is {@link CodigoCNESType }
     *
     */
    public CodigoCNESType getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     *
     * @param value allowed object is {@link CodigoCNESType }
     *
     */
    public void setCnes(CodigoCNESType value) {
        this.cnes = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     *
     * @return possible object is {@link CNPJType }
     *
     */
    public CNPJType getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     *
     * @param value allowed object is {@link CNPJType }
     *
     */
    public void setCnpj(CNPJType value) {
        this.cnpj = value;
    }

}
