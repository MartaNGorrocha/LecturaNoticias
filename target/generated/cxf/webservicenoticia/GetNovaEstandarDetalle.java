
package webservicenoticia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nova" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="localeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
public class GetNovaEstandarDetalle {

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

}
