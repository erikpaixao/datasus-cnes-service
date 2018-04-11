
package br.gov.saude.servicos.schema.corporativo.documento.v1r2.documentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.cnh.CNHType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.ctps.CTPSType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.dnv.DNVType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.identidade.IdentidadeType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.nis.NISType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.passaporte.PassaporteType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.ric.RICType;
import br.gov.saude.servicos.schema.corporativo.documento.v1r1.tituloeleitor.TituloEleitorType;


/**
 * <p>Classe Java de DocumentosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identidade" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/identidade}IdentidadeType" minOccurs="0"/&gt;
 *         &lt;element name="CTPS" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/ctps}CTPSType" minOccurs="0"/&gt;
 *         &lt;element name="CNH" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/cnh}CNHType" minOccurs="0"/&gt;
 *         &lt;element name="TituloEleitor" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/tituloeleitor}TituloEleitorType" minOccurs="0"/&gt;
 *         &lt;element name="NIS" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/nis}NISType" minOccurs="0"/&gt;
 *         &lt;element name="Passaporte" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/passaporte}PassaporteType" minOccurs="0"/&gt;
 *         &lt;element name="RIC" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/ric}RICType" minOccurs="0"/&gt;
 *         &lt;element name="DNV" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/dnv}DNVType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentosType", propOrder = {
    "identidade",
    "ctps",
    "cnh",
    "tituloEleitor",
    "nis",
    "passaporte",
    "ric",
    "dnv"
})
public class DocumentosType {

    @XmlElement(name = "Identidade")
    protected IdentidadeType identidade;
    @XmlElement(name = "CTPS")
    protected CTPSType ctps;
    @XmlElement(name = "CNH")
    protected CNHType cnh;
    @XmlElement(name = "TituloEleitor")
    protected TituloEleitorType tituloEleitor;
    @XmlElement(name = "NIS")
    protected NISType nis;
    @XmlElement(name = "Passaporte")
    protected PassaporteType passaporte;
    @XmlElement(name = "RIC")
    protected RICType ric;
    @XmlElement(name = "DNV")
    protected DNVType dnv;

    /**
     * Obtém o valor da propriedade identidade.
     * 
     * @return
     *     possible object is
     *     {@link IdentidadeType }
     *     
     */
    public IdentidadeType getIdentidade() {
        return identidade;
    }

    /**
     * Define o valor da propriedade identidade.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentidadeType }
     *     
     */
    public void setIdentidade(IdentidadeType value) {
        this.identidade = value;
    }

    /**
     * Obtém o valor da propriedade ctps.
     * 
     * @return
     *     possible object is
     *     {@link CTPSType }
     *     
     */
    public CTPSType getCTPS() {
        return ctps;
    }

    /**
     * Define o valor da propriedade ctps.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPSType }
     *     
     */
    public void setCTPS(CTPSType value) {
        this.ctps = value;
    }

    /**
     * Obtém o valor da propriedade cnh.
     * 
     * @return
     *     possible object is
     *     {@link CNHType }
     *     
     */
    public CNHType getCNH() {
        return cnh;
    }

    /**
     * Define o valor da propriedade cnh.
     * 
     * @param value
     *     allowed object is
     *     {@link CNHType }
     *     
     */
    public void setCNH(CNHType value) {
        this.cnh = value;
    }

    /**
     * Obtém o valor da propriedade tituloEleitor.
     * 
     * @return
     *     possible object is
     *     {@link TituloEleitorType }
     *     
     */
    public TituloEleitorType getTituloEleitor() {
        return tituloEleitor;
    }

    /**
     * Define o valor da propriedade tituloEleitor.
     * 
     * @param value
     *     allowed object is
     *     {@link TituloEleitorType }
     *     
     */
    public void setTituloEleitor(TituloEleitorType value) {
        this.tituloEleitor = value;
    }

    /**
     * Obtém o valor da propriedade nis.
     * 
     * @return
     *     possible object is
     *     {@link NISType }
     *     
     */
    public NISType getNIS() {
        return nis;
    }

    /**
     * Define o valor da propriedade nis.
     * 
     * @param value
     *     allowed object is
     *     {@link NISType }
     *     
     */
    public void setNIS(NISType value) {
        this.nis = value;
    }

    /**
     * Obtém o valor da propriedade passaporte.
     * 
     * @return
     *     possible object is
     *     {@link PassaporteType }
     *     
     */
    public PassaporteType getPassaporte() {
        return passaporte;
    }

    /**
     * Define o valor da propriedade passaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link PassaporteType }
     *     
     */
    public void setPassaporte(PassaporteType value) {
        this.passaporte = value;
    }

    /**
     * Obtém o valor da propriedade ric.
     * 
     * @return
     *     possible object is
     *     {@link RICType }
     *     
     */
    public RICType getRIC() {
        return ric;
    }

    /**
     * Define o valor da propriedade ric.
     * 
     * @param value
     *     allowed object is
     *     {@link RICType }
     *     
     */
    public void setRIC(RICType value) {
        this.ric = value;
    }

    /**
     * Obtém o valor da propriedade dnv.
     * 
     * @return
     *     possible object is
     *     {@link DNVType }
     *     
     */
    public DNVType getDNV() {
        return dnv;
    }

    /**
     * Define o valor da propriedade dnv.
     * 
     * @param value
     *     allowed object is
     *     {@link DNVType }
     *     
     */
    public void setDNV(DNVType value) {
        this.dnv = value;
    }

}
