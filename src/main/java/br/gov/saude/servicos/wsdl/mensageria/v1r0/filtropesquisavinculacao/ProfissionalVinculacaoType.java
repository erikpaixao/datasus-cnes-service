package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.NumeroCNSType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r2.cpf.CPFType;

/**
 * <p>
 * Classe Java de ProfissionalVinculacaoType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="ProfissionalVinculacaoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cpf" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPFType"/&gt;
 *         &lt;element name="cns" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}NumeroCNSType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfissionalVinculacaoType", propOrder = {
    "cpf",
    "cns"
})
public class ProfissionalVinculacaoType {

    protected CPFType cpf;
    protected NumeroCNSType cns;

    /**
     * Obtém o valor da propriedade cpf.
     *
     * @return possible object is {@link CPFType }
     *
     */
    public CPFType getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     *
     * @param value allowed object is {@link CPFType }
     *
     */
    public void setCpf(CPFType value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade cns.
     *
     * @return possible object is {@link NumeroCNSType }
     *
     */
    public NumeroCNSType getCns() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     *
     * @param value allowed object is {@link NumeroCNSType }
     *
     */
    public void setCns(NumeroCNSType value) {
        this.cns = value;
    }

}
