
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r1.dadosnacionalidade;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NacionalidadeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NacionalidadeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NacionalidadeType")
@XmlEnum
public enum NacionalidadeType {

    B,
    E,
    P,
    N;

    public String value() {
        return name();
    }

    public static NacionalidadeType fromValue(String v) {
        return valueOf(v);
    }

}
