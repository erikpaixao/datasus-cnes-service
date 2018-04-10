package br.gov.saude.servicos.schema.corporativo.v1r2.municipio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.v1r1.uf.UFType;

/**
 * <p>
 * Classe Java de MunicipioType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="MunicipioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoMunicipio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nomeMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UF" type="{http://servicos.saude.gov.br/schema/corporativo/v1r1/uf}UFType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipioType", propOrder = {
    "codigoMunicipio",
    "nomeMunicipio",
    "uf"
})
public class MunicipioType {

    protected String codigoMunicipio;
    protected String nomeMunicipio;
    @XmlElement(name = "UF")
    protected UFType uf;

    /**
     * Obtém o valor da propriedade codigoMunicipio.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define o valor da propriedade codigoMunicipio.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoMunicipio(String value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade nomeMunicipio.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    /**
     * Define o valor da propriedade nomeMunicipio.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNomeMunicipio(String value) {
        this.nomeMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     *
     * @return possible object is {@link UFType }
     *
     */
    public UFType getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     *
     * @param value allowed object is {@link UFType }
     *
     */
    public void setUF(UFType value) {
        this.uf = value;
    }

}
