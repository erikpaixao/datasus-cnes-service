
package br.gov.saude.servicos.wsdl.mensageria.v5r0.filtropesquisa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoPesquisaType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPesquisaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDENTICA"/&gt;
 *     &lt;enumeration value="APROXIMADA"/&gt;
 *     &lt;enumeration value="FONETICA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoPesquisaType")
@XmlEnum
public enum TipoPesquisaType {

    IDENTICA,
    APROXIMADA,
    FONETICA;

    public String value() {
        return name();
    }

    public static TipoPesquisaType fromValue(String v) {
        return valueOf(v);
    }

}
