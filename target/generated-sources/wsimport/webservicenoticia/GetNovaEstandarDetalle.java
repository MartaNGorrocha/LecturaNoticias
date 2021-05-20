
package webservicenoticia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nova" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "pass",
    "nova",
    "localeString"
})
@XmlRootElement(name = "getNovaEstandarDetalle")
public class GetNovaEstandarDetalle
    implements Equals, ToString
{

    @XmlElementRef(name = "user", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> user;
    @XmlElementRef(name = "pass", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pass;
    @XmlElementRef(name = "nova", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nova;
    @XmlElementRef(name = "localeString", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localeString;

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUser(JAXBElement<String> value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad pass.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPass() {
        return pass;
    }

    /**
     * Define el valor de la propiedad pass.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPass(JAXBElement<String> value) {
        this.pass = value;
    }

    /**
     * Obtiene el valor de la propiedad nova.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNova() {
        return nova;
    }

    /**
     * Define el valor de la propiedad nova.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNova(JAXBElement<String> value) {
        this.nova = value;
    }

    /**
     * Obtiene el valor de la propiedad localeString.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocaleString() {
        return localeString;
    }

    /**
     * Define el valor de la propiedad localeString.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocaleString(JAXBElement<String> value) {
        this.localeString = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetNovaEstandarDetalle)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetNovaEstandarDetalle that = ((GetNovaEstandarDetalle) object);
        {
            JAXBElement<String> lhsUser;
            lhsUser = this.getUser();
            JAXBElement<String> rhsUser;
            rhsUser = that.getUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "user", lhsUser), LocatorUtils.property(thatLocator, "user", rhsUser), lhsUser, rhsUser)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsPass;
            lhsPass = this.getPass();
            JAXBElement<String> rhsPass;
            rhsPass = that.getPass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pass", lhsPass), LocatorUtils.property(thatLocator, "pass", rhsPass), lhsPass, rhsPass)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsNova;
            lhsNova = this.getNova();
            JAXBElement<String> rhsNova;
            rhsNova = that.getNova();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nova", lhsNova), LocatorUtils.property(thatLocator, "nova", rhsNova), lhsNova, rhsNova)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsLocaleString;
            lhsLocaleString = this.getLocaleString();
            JAXBElement<String> rhsLocaleString;
            rhsLocaleString = that.getLocaleString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localeString", lhsLocaleString), LocatorUtils.property(thatLocator, "localeString", rhsLocaleString), lhsLocaleString, rhsLocaleString)) {
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
            JAXBElement<String> theUser;
            theUser = this.getUser();
            strategy.appendField(locator, this, "user", buffer, theUser);
        }
        {
            JAXBElement<String> thePass;
            thePass = this.getPass();
            strategy.appendField(locator, this, "pass", buffer, thePass);
        }
        {
            JAXBElement<String> theNova;
            theNova = this.getNova();
            strategy.appendField(locator, this, "nova", buffer, theNova);
        }
        {
            JAXBElement<String> theLocaleString;
            theLocaleString = this.getLocaleString();
            strategy.appendField(locator, this, "localeString", buffer, theLocaleString);
        }
        return buffer;
    }

}
