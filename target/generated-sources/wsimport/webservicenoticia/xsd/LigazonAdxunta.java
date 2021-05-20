
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
 * <p>Clase Java para LigazonAdxunta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LigazonAdxunta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LigazonAdxunta", propOrder = {
    "descriptor",
    "sigla",
    "titulo",
    "url",
    "venta"
})
public class LigazonAdxunta
    implements Equals, ToString
{

    @XmlElementRef(name = "descriptor", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptor;
    @XmlElementRef(name = "sigla", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sigla;
    @XmlElementRef(name = "titulo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;
    @XmlElementRef(name = "url", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "venta", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> venta;

    /**
     * Obtiene el valor de la propiedad descriptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptor() {
        return descriptor;
    }

    /**
     * Define el valor de la propiedad descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptor(JAXBElement<String> value) {
        this.descriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad sigla.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSigla() {
        return sigla;
    }

    /**
     * Define el valor de la propiedad sigla.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSigla(JAXBElement<String> value) {
        this.sigla = value;
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

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad venta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVenta() {
        return venta;
    }

    /**
     * Define el valor de la propiedad venta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVenta(JAXBElement<String> value) {
        this.venta = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LigazonAdxunta)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LigazonAdxunta that = ((LigazonAdxunta) object);
        {
            JAXBElement<String> lhsDescriptor;
            lhsDescriptor = this.getDescriptor();
            JAXBElement<String> rhsDescriptor;
            rhsDescriptor = that.getDescriptor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptor", lhsDescriptor), LocatorUtils.property(thatLocator, "descriptor", rhsDescriptor), lhsDescriptor, rhsDescriptor)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsSigla;
            lhsSigla = this.getSigla();
            JAXBElement<String> rhsSigla;
            rhsSigla = that.getSigla();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sigla", lhsSigla), LocatorUtils.property(thatLocator, "sigla", rhsSigla), lhsSigla, rhsSigla)) {
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
        {
            JAXBElement<String> lhsUrl;
            lhsUrl = this.getUrl();
            JAXBElement<String> rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsVenta;
            lhsVenta = this.getVenta();
            JAXBElement<String> rhsVenta;
            rhsVenta = that.getVenta();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "venta", lhsVenta), LocatorUtils.property(thatLocator, "venta", rhsVenta), lhsVenta, rhsVenta)) {
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
            JAXBElement<String> theDescriptor;
            theDescriptor = this.getDescriptor();
            strategy.appendField(locator, this, "descriptor", buffer, theDescriptor);
        }
        {
            JAXBElement<String> theSigla;
            theSigla = this.getSigla();
            strategy.appendField(locator, this, "sigla", buffer, theSigla);
        }
        {
            JAXBElement<String> theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        {
            JAXBElement<String> theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            JAXBElement<String> theVenta;
            theVenta = this.getVenta();
            strategy.appendField(locator, this, "venta", buffer, theVenta);
        }
        return buffer;
    }

}
