package br.gov.saude.servicos.schema.cnes.v1r0.vinculacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de VinculacaoServiceType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="VinculacaoServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vinculacaos" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao}VinculacaosType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculacaoServiceType", propOrder = {
    "vinculacaos"
})
public class VinculacaoServiceType {

    @XmlElement(name = "Vinculacaos")
    protected VinculacaosType vinculacaos;

    /**
     * Obtém o valor da propriedade vinculacaos.
     *
     * @return possible object is {@link VinculacaosType }
     *
     */
    public VinculacaosType getVinculacaos() {
        return vinculacaos;
    }

    /**
     * Define o valor da propriedade vinculacaos.
     *
     * @param value allowed object is {@link VinculacaosType }
     *
     */
    public void setVinculacaos(VinculacaosType value) {
        this.vinculacaos = value;
    }

}
