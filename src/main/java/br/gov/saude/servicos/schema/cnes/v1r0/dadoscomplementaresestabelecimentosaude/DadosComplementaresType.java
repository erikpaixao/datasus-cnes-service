package br.gov.saude.servicos.schema.cnes.v1r0.dadoscomplementaresestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.alvarasanitario.AlvaraSanitarioType;
import br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.cnae.CNAEType;

/**
 * <p>
 * Classe Java de DadosComplementaresType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="DadosComplementaresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnaePrincipal" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnae}CNAEType"/&gt;
 *         &lt;element name="CnaeSecundario" type="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnae}CNAEType"/&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/alvarasanitario}AlvaraSanitario"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosComplementaresType", propOrder = {
    "cnaePrincipal",
    "cnaeSecundario",
    "alvaraSanitario"
})
public class DadosComplementaresType {

    @XmlElement(name = "CnaePrincipal", required = true)
    protected CNAEType cnaePrincipal;
    @XmlElement(name = "CnaeSecundario", required = true)
    protected CNAEType cnaeSecundario;
    @XmlElement(name = "AlvaraSanitario", namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/alvarasanitario", required = true)
    protected AlvaraSanitarioType alvaraSanitario;

    /**
     * Obtém o valor da propriedade cnaePrincipal.
     *
     * @return possible object is {@link CNAEType }
     *
     */
    public CNAEType getCnaePrincipal() {
        return cnaePrincipal;
    }

    /**
     * Define o valor da propriedade cnaePrincipal.
     *
     * @param value allowed object is {@link CNAEType }
     *
     */
    public void setCnaePrincipal(CNAEType value) {
        this.cnaePrincipal = value;
    }

    /**
     * Obtém o valor da propriedade cnaeSecundario.
     *
     * @return possible object is {@link CNAEType }
     *
     */
    public CNAEType getCnaeSecundario() {
        return cnaeSecundario;
    }

    /**
     * Define o valor da propriedade cnaeSecundario.
     *
     * @param value allowed object is {@link CNAEType }
     *
     */
    public void setCnaeSecundario(CNAEType value) {
        this.cnaeSecundario = value;
    }

    /**
     * Alvará Sanitário.
     *
     * @return possible object is {@link AlvaraSanitarioType }
     *
     */
    public AlvaraSanitarioType getAlvaraSanitario() {
        return alvaraSanitario;
    }

    /**
     * Define o valor da propriedade alvaraSanitario.
     *
     * @param value allowed object is {@link AlvaraSanitarioType }
     *
     */
    public void setAlvaraSanitario(AlvaraSanitarioType value) {
        this.alvaraSanitario = value;
    }

}
