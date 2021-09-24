
package mx.bankaya.demo.pokemon.client.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="abilities" type="{http://bankaya.mx/demos/web-service}abilities"/&gt;
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="heldItems" type="{http://bankaya.mx/demos/web-service}heldItem"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemon", propOrder = {
    "abilitiesAndBaseExperienceAndHeldItems"
})
public class Pokemon {

    @XmlElementRefs({
        @XmlElementRef(name = "abilities", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "base_experience", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "heldItems", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location_area_encounters", namespace = "http://bankaya.mx/demos/web-service", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> abilitiesAndBaseExperienceAndHeldItems;

    /**
     * Gets the value of the abilitiesAndBaseExperienceAndHeldItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abilitiesAndBaseExperienceAndHeldItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilitiesAndBaseExperienceAndHeldItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Abilities }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link HeldItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbilitiesAndBaseExperienceAndHeldItems() {
        if (abilitiesAndBaseExperienceAndHeldItems == null) {
            abilitiesAndBaseExperienceAndHeldItems = new ArrayList<JAXBElement<?>>();
        }
        return this.abilitiesAndBaseExperienceAndHeldItems;
    }

}
