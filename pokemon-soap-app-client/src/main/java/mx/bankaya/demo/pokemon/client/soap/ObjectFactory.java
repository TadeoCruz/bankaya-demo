
package mx.bankaya.demo.pokemon.client.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.bankaya.demo.pokemon.client.soap package. 
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

    private final static QName _PokemonAbilities_QNAME = new QName("http://bankaya.mx/demos/web-service", "abilities");
    private final static QName _PokemonBaseExperience_QNAME = new QName("http://bankaya.mx/demos/web-service", "base_experience");
    private final static QName _PokemonHeldItems_QNAME = new QName("http://bankaya.mx/demos/web-service", "heldItems");
    private final static QName _PokemonId_QNAME = new QName("http://bankaya.mx/demos/web-service", "id");
    private final static QName _PokemonName_QNAME = new QName("http://bankaya.mx/demos/web-service", "name");
    private final static QName _PokemonLocationAreaEncounters_QNAME = new QName("http://bankaya.mx/demos/web-service", "location_area_encounters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.bankaya.demo.pokemon.client.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPokemonRequest }
     * 
     */
    public GetPokemonRequest createGetPokemonRequest() {
        return new GetPokemonRequest();
    }

    /**
     * Create an instance of {@link GetPokemonResponse }
     * 
     */
    public GetPokemonResponse createGetPokemonResponse() {
        return new GetPokemonResponse();
    }

    /**
     * Create an instance of {@link Pokemon }
     * 
     */
    public Pokemon createPokemon() {
        return new Pokemon();
    }

    /**
     * Create an instance of {@link Abilities }
     * 
     */
    public Abilities createAbilities() {
        return new Abilities();
    }

    /**
     * Create an instance of {@link Ability }
     * 
     */
    public Ability createAbility() {
        return new Ability();
    }

    /**
     * Create an instance of {@link HeldItem }
     * 
     */
    public HeldItem createHeldItem() {
        return new HeldItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Abilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Abilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "abilities", scope = Pokemon.class)
    public JAXBElement<Abilities> createPokemonAbilities(Abilities value) {
        return new JAXBElement<Abilities>(_PokemonAbilities_QNAME, Abilities.class, Pokemon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "base_experience", scope = Pokemon.class)
    public JAXBElement<Integer> createPokemonBaseExperience(Integer value) {
        return new JAXBElement<Integer>(_PokemonBaseExperience_QNAME, Integer.class, Pokemon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeldItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeldItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "heldItems", scope = Pokemon.class)
    public JAXBElement<HeldItem> createPokemonHeldItems(HeldItem value) {
        return new JAXBElement<HeldItem>(_PokemonHeldItems_QNAME, HeldItem.class, Pokemon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "id", scope = Pokemon.class)
    public JAXBElement<Integer> createPokemonId(Integer value) {
        return new JAXBElement<Integer>(_PokemonId_QNAME, Integer.class, Pokemon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "name", scope = Pokemon.class)
    public JAXBElement<String> createPokemonName(String value) {
        return new JAXBElement<String>(_PokemonName_QNAME, String.class, Pokemon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://bankaya.mx/demos/web-service", name = "location_area_encounters", scope = Pokemon.class)
    public JAXBElement<String> createPokemonLocationAreaEncounters(String value) {
        return new JAXBElement<String>(_PokemonLocationAreaEncounters_QNAME, String.class, Pokemon.class, value);
    }

}
