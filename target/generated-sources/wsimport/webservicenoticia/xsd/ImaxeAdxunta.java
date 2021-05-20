
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
 * <p>Clase Java para ImaxeAdxunta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImaxeAdxunta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imaxen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imaxenMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imaxenMini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imaxenSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImaxeAdxunta", propOrder = {
    "autor",
    "imaxen",
    "imaxenMedium",
    "imaxenMini",
    "imaxenSmall",
    "titulo"
})
public class ImaxeAdxunta
    implements Equals, ToString
{

    @XmlElementRef(name = "autor", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autor;
    @XmlElementRef(name = "imaxen", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imaxen;
    @XmlElementRef(name = "imaxenMedium", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imaxenMedium;
    @XmlElementRef(name = "imaxenMini", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imaxenMini;
    @XmlElementRef(name = "imaxenSmall", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imaxenSmall;
    @XmlElementRef(name = "titulo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;

    /**
     * Obtiene el valor de la propiedad autor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutor() {
        return autor;
    }

    /**
     * Define el valor de la propiedad autor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutor(JAXBElement<String> value) {
        this.autor = value;
    }

    /**
     * Obtiene el valor de la propiedad imaxen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImaxen() {
        return imaxen;
    }

    /**
     * Define el valor de la propiedad imaxen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImaxen(JAXBElement<String> value) {
        this.imaxen = value;
    }

    /**
     * Obtiene el valor de la propiedad imaxenMedium.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImaxenMedium() {
        return imaxenMedium;
    }

    /**
     * Define el valor de la propiedad imaxenMedium.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImaxenMedium(JAXBElement<String> value) {
        this.imaxenMedium = value;
    }

    /**
     * Obtiene el valor de la propiedad imaxenMini.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImaxenMini() {
        return imaxenMini;
    }

    /**
     * Define el valor de la propiedad imaxenMini.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImaxenMini(JAXBElement<String> value) {
        this.imaxenMini = value;
    }

    /**
     * Obtiene el valor de la propiedad imaxenSmall.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImaxenSmall() {
        return imaxenSmall;
    }

    /**
     * Define el valor de la propiedad imaxenSmall.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImaxenSmall(JAXBElement<String> value) {
        this.imaxenSmall = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitulo(JAXBElement<String> value) {
        this.titulo = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImaxeAdxunta)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImaxeAdxunta that = ((ImaxeAdxunta) object);
        {
            JAXBElement<String> lhsAutor;
            lhsAutor = this.getAutor();
            JAXBElement<String> rhsAutor;
            rhsAutor = that.getAutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autor", lhsAutor), LocatorUtils.property(thatLocator, "autor", rhsAutor), lhsAutor, rhsAutor)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsImaxen;
            lhsImaxen = this.getImaxen();
            JAXBElement<String> rhsImaxen;
            rhsImaxen = that.getImaxen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxen", lhsImaxen), LocatorUtils.property(thatLocator, "imaxen", rhsImaxen), lhsImaxen, rhsImaxen)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsImaxenMedium;
            lhsImaxenMedium = this.getImaxenMedium();
            JAXBElement<String> rhsImaxenMedium;
            rhsImaxenMedium = that.getImaxenMedium();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxenMedium", lhsImaxenMedium), LocatorUtils.property(thatLocator, "imaxenMedium", rhsImaxenMedium), lhsImaxenMedium, rhsImaxenMedium)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsImaxenMini;
            lhsImaxenMini = this.getImaxenMini();
            JAXBElement<String> rhsImaxenMini;
            rhsImaxenMini = that.getImaxenMini();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxenMini", lhsImaxenMini), LocatorUtils.property(thatLocator, "imaxenMini", rhsImaxenMini), lhsImaxenMini, rhsImaxenMini)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsImaxenSmall;
            lhsImaxenSmall = this.getImaxenSmall();
            JAXBElement<String> rhsImaxenSmall;
            rhsImaxenSmall = that.getImaxenSmall();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxenSmall", lhsImaxenSmall), LocatorUtils.property(thatLocator, "imaxenSmall", rhsImaxenSmall), lhsImaxenSmall, rhsImaxenSmall)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsTitulo;
            lhsTitulo = this.getTitulo();
            JAXBElement<String> rhsTitulo;
            rhsTitulo = that.getTitulo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titulo", lhsTitulo), LocatorUtils.property(thatLocator, "titulo", rhsTitulo), lhsTitulo, rhsTitulo)) {
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
            JAXBElement<String> theAutor;
            theAutor = this.getAutor();
            strategy.appendField(locator, this, "autor", buffer, theAutor);
        }
        {
            JAXBElement<String> theImaxen;
            theImaxen = this.getImaxen();
            strategy.appendField(locator, this, "imaxen", buffer, theImaxen);
        }
        {
            JAXBElement<String> theImaxenMedium;
            theImaxenMedium = this.getImaxenMedium();
            strategy.appendField(locator, this, "imaxenMedium", buffer, theImaxenMedium);
        }
        {
            JAXBElement<String> theImaxenMini;
            theImaxenMini = this.getImaxenMini();
            strategy.appendField(locator, this, "imaxenMini", buffer, theImaxenMini);
        }
        {
            JAXBElement<String> theImaxenSmall;
            theImaxenSmall = this.getImaxenSmall();
            strategy.appendField(locator, this, "imaxenSmall", buffer, theImaxenSmall);
        }
        {
            JAXBElement<String> theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        return buffer;
    }

}
