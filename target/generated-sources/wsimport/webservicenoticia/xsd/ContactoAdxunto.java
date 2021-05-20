
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Clase Java para ContactoAdxunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactoAdxunto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="concello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactoAdxunto", propOrder = {
    "codigoPostal",
    "concello",
    "correo",
    "direccion",
    "nome",
    "provincia"
})
public class ContactoAdxunto
    implements Equals, ToString
{

    @XmlElementRef(name = "codigoPostal", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPostal;
    @XmlElementRef(name = "concello", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> concello;
    @XmlElementRef(name = "correo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correo;
    @XmlElementRef(name = "direccion", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElementRef(name = "nome", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "provincia", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPostal(JAXBElement<String> value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad concello.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConcello() {
        return concello;
    }

    /**
     * Define el valor de la propiedad concello.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConcello(JAXBElement<String> value) {
        this.concello = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreo(JAXBElement<String> value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Define el valor de la propiedad nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactoAdxunto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactoAdxunto that = ((ContactoAdxunto) object);
        {
            JAXBElement<String> lhsCodigoPostal;
            lhsCodigoPostal = this.getCodigoPostal();
            JAXBElement<String> rhsCodigoPostal;
            rhsCodigoPostal = that.getCodigoPostal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codigoPostal", lhsCodigoPostal), LocatorUtils.property(thatLocator, "codigoPostal", rhsCodigoPostal), lhsCodigoPostal, rhsCodigoPostal)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsConcello;
            lhsConcello = this.getConcello();
            JAXBElement<String> rhsConcello;
            rhsConcello = that.getConcello();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concello", lhsConcello), LocatorUtils.property(thatLocator, "concello", rhsConcello), lhsConcello, rhsConcello)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsCorreo;
            lhsCorreo = this.getCorreo();
            JAXBElement<String> rhsCorreo;
            rhsCorreo = that.getCorreo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correo", lhsCorreo), LocatorUtils.property(thatLocator, "correo", rhsCorreo), lhsCorreo, rhsCorreo)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsDireccion;
            lhsDireccion = this.getDireccion();
            JAXBElement<String> rhsDireccion;
            rhsDireccion = that.getDireccion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "direccion", lhsDireccion), LocatorUtils.property(thatLocator, "direccion", rhsDireccion), lhsDireccion, rhsDireccion)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsNome;
            lhsNome = this.getNome();
            JAXBElement<String> rhsNome;
            rhsNome = that.getNome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nome", lhsNome), LocatorUtils.property(thatLocator, "nome", rhsNome), lhsNome, rhsNome)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsProvincia;
            lhsProvincia = this.getProvincia();
            JAXBElement<String> rhsProvincia;
            rhsProvincia = that.getProvincia();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provincia", lhsProvincia), LocatorUtils.property(thatLocator, "provincia", rhsProvincia), lhsProvincia, rhsProvincia)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<String> theCodigoPostal;
            theCodigoPostal = this.getCodigoPostal();
            strategy.appendField(locator, this, "codigoPostal", buffer, theCodigoPostal);
        }
        {
            JAXBElement<String> theConcello;
            theConcello = this.getConcello();
            strategy.appendField(locator, this, "concello", buffer, theConcello);
        }
        {
            JAXBElement<String> theCorreo;
            theCorreo = this.getCorreo();
            strategy.appendField(locator, this, "correo", buffer, theCorreo);
        }
        {
            JAXBElement<String> theDireccion;
            theDireccion = this.getDireccion();
            strategy.appendField(locator, this, "direccion", buffer, theDireccion);
        }
        {
            JAXBElement<String> theNome;
            theNome = this.getNome();
            strategy.appendField(locator, this, "nome", buffer, theNome);
        }
        {
            JAXBElement<String> theProvincia;
            theProvincia = this.getProvincia();
            strategy.appendField(locator, this, "provincia", buffer, theProvincia);
        }
        return buffer;
    }

}
