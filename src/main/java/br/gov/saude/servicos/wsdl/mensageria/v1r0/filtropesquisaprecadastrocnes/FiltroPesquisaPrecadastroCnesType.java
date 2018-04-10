package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisaprecadastrocnes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.cnes.v1r0.codigocnes.CodigoCNESType;

/**
 * <p>
 * Classe Java de FiltroPesquisaPrecadastroCnesType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="FiltroPesquisaPrecadastroCnesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES" minOccurs="0"/&gt;
 *         &lt;element name="situacao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroPesquisaPrecadastroCnesType", propOrder = {
    "codigoCNES",
    "situacao"
})
public class FiltroPesquisaPrecadastroCnesType {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes")
    protected CodigoCNESType codigoCNES;
    @XmlElementRef(name = "situacao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> situacao;

    /**
     * Código do CNES.
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
     * Obtém o valor da propriedade situacao.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     *
     * @param value allowed object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSituacao(JAXBElement<String> value) {
        this.situacao = value;
    }

}
