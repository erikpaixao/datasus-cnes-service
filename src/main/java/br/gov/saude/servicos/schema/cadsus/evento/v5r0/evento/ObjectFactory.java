
package br.gov.saude.servicos.schema.cadsus.evento.v5r0.evento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.evento.v5r0.evento package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Evento_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/evento/v5r0/evento", "Evento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.evento.v5r0.evento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventoType }
     * 
     */
    public EventoType createEventoType() {
        return new EventoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/evento/v5r0/evento", name = "Evento")
    public JAXBElement<EventoType> createEvento(EventoType value) {
        return new JAXBElement<EventoType>(_Evento_QNAME, EventoType.class, null, value);
    }

}
