package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.v1r2.municipio.MunicipioType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}Municipio"/&gt;
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
    "municipio"
})
@XmlRootElement(name = "requestConsultarEstabelecimentoSaudePorMunicipio")
public class RequestConsultarEstabelecimentoSaudePorMunicipio {

    @XmlElement(name = "Municipio", namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", required = true)
    protected MunicipioType municipio;

    /**
     * Obtém o valor da propriedade municipio.
     *
     * @return possible object is {@link MunicipioType }
     *
     */
    public MunicipioType getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     *
     * @param value allowed object is {@link MunicipioType }
     *
     */
    public void setMunicipio(MunicipioType value) {
        this.municipio = value;
    }

}
