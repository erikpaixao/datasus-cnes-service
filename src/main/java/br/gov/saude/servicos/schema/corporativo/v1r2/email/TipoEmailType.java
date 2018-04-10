package br.gov.saude.servicos.schema.corporativo.v1r2.email;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de TipoEmailType.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="TipoEmailType"&gt; &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"&gt; &lt;enumeration
 * value="P"/&gt; &lt;enumeration value="A"/&gt; &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "TipoEmailType")
@XmlEnum
public enum TipoEmailType {

    P,
    A;

    public String value() {
        return name();
    }

    public static TipoEmailType fromValue(String v) {
        return valueOf(v);
    }

}
