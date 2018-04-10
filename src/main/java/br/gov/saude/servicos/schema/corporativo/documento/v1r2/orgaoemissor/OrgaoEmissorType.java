package br.gov.saude.servicos.schema.corporativo.documento.v1r2.orgaoemissor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de OrgaoEmissorType complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="OrgaoEmissorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoOrgaoEmissor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nomeOrgaoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siglaOrgaoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgaoEmissorType", propOrder = {
    "codigoOrgaoEmissor",
    "nomeOrgaoEmissor",
    "siglaOrgaoEmissor"
})
public class OrgaoEmissorType {

    @XmlElement(required = true)
    protected String codigoOrgaoEmissor;
    protected String nomeOrgaoEmissor;
    protected String siglaOrgaoEmissor;

    /**
     * Obtém o valor da propriedade codigoOrgaoEmissor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoOrgaoEmissor() {
        return codigoOrgaoEmissor;
    }

    /**
     * Define o valor da propriedade codigoOrgaoEmissor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoOrgaoEmissor(String value) {
        this.codigoOrgaoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade nomeOrgaoEmissor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNomeOrgaoEmissor() {
        return nomeOrgaoEmissor;
    }

    /**
     * Define o valor da propriedade nomeOrgaoEmissor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNomeOrgaoEmissor(String value) {
        this.nomeOrgaoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade siglaOrgaoEmissor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSiglaOrgaoEmissor() {
        return siglaOrgaoEmissor;
    }

    /**
     * Define o valor da propriedade siglaOrgaoEmissor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSiglaOrgaoEmissor(String value) {
        this.siglaOrgaoEmissor = value;
    }

}
