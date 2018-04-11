
package br.gov.saude.servicos.wsdl.cadsus.auditoria.v5r0.tipotransacao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoTransacaoType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTransacaoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADICIONADO"/&gt;
 *     &lt;enumeration value="ATIVO"/&gt;
 *     &lt;enumeration value="DESATIVO"/&gt;
 *     &lt;enumeration value="UNIDO"/&gt;
 *     &lt;enumeration value="DESUNIDO"/&gt;
 *     &lt;enumeration value="ATUALIZADO"/&gt;
 *     &lt;enumeration value="MANUTENCAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTransacaoType", namespace = "http://servicos.saude.gov.br/wsdl/cadsus/auditoria/v5r0/tipotransacao")
@XmlEnum
public enum TipoTransacaoType {

    ADICIONADO,
    ATIVO,
    DESATIVO,
    UNIDO,
    DESUNIDO,
    ATUALIZADO,
    MANUTENCAO;

    public String value() {
        return name();
    }

    public static TipoTransacaoType fromValue(String v) {
        return valueOf(v);
    }

}
