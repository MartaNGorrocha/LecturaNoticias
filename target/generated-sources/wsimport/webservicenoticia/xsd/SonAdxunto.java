
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Clase Java para SonAdxunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SonAdxunto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ligazon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="son" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbSon" type="{http://webservicenoticia/xsd}ImaxeAdxunta" minOccurs="0"/&gt;
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
@XmlType(name = "SonAdxunto", propOrder = {
    "autor",
    "data",
    "entrada",
    "ligazon",
    "son",
    "thumbSon",
    "titulo"
})
public class SonAdxunto
    implements Equals, ToString
{

    @XmlElementRef(name = "autor", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autor;
    @XmlElementRef(name = "data", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> data;
    @XmlElementRef(name = "entrada", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entrada;
    @XmlElementRef(name = "ligazon", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ligazon;
    @XmlElementRef(name = "son", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> son;
    @XmlElementRef(name = "thumbSon", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ImaxeAdxunta> thumbSon;
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
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setData(JAXBElement<XMLGregorianCalendar> value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad entrada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntrada() {
        return entrada;
    }

    /**
     * Define el valor de la propiedad entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntrada(JAXBElement<String> value) {
        this.entrada = value;
    }

    /**
     * Obtiene el valor de la propiedad ligazon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLigazon() {
        return ligazon;
    }

    /**
     * Define el valor de la propiedad ligazon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLigazon(JAXBElement<String> value) {
        this.ligazon = value;
    }

    /**
     * Obtiene el valor de la propiedad son.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSon() {
        return son;
    }

    /**
     * Define el valor de la propiedad son.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSon(JAXBElement<String> value) {
        this.son = value;
    }

    /**
     * Obtiene el valor de la propiedad thumbSon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     *     
     */
    public JAXBElement<ImaxeAdxunta> getThumbSon() {
        return thumbSon;
    }

    /**
     * Define el valor de la propiedad thumbSon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     *     
     */
    public void setThumbSon(JAXBElement<ImaxeAdxunta> value) {
        this.thumbSon = value;
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
        if (!(object instanceof SonAdxunto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SonAdxunto that = ((SonAdxunto) object);
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
            JAXBElement<XMLGregorianCalendar> lhsData;
            lhsData = this.getData();
            JAXBElement<XMLGregorianCalendar> rhsData;
            rhsData = that.getData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEntrada;
            lhsEntrada = this.getEntrada();
            JAXBElement<String> rhsEntrada;
            rhsEntrada = that.getEntrada();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entrada", lhsEntrada), LocatorUtils.property(thatLocator, "entrada", rhsEntrada), lhsEntrada, rhsEntrada)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsLigazon;
            lhsLigazon = this.getLigazon();
            JAXBElement<String> rhsLigazon;
            rhsLigazon = that.getLigazon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ligazon", lhsLigazon), LocatorUtils.property(thatLocator, "ligazon", rhsLigazon), lhsLigazon, rhsLigazon)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsSon;
            lhsSon = this.getSon();
            JAXBElement<String> rhsSon;
            rhsSon = that.getSon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "son", lhsSon), LocatorUtils.property(thatLocator, "son", rhsSon), lhsSon, rhsSon)) {
                return false;
            }
        }
        {
            JAXBElement<ImaxeAdxunta> lhsThumbSon;
            lhsThumbSon = this.getThumbSon();
            JAXBElement<ImaxeAdxunta> rhsThumbSon;
            rhsThumbSon = that.getThumbSon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thumbSon", lhsThumbSon), LocatorUtils.property(thatLocator, "thumbSon", rhsThumbSon), lhsThumbSon, rhsThumbSon)) {
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
            JAXBElement<XMLGregorianCalendar> theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        {
            JAXBElement<String> theEntrada;
            theEntrada = this.getEntrada();
            strategy.appendField(locator, this, "entrada", buffer, theEntrada);
        }
        {
            JAXBElement<String> theLigazon;
            theLigazon = this.getLigazon();
            strategy.appendField(locator, this, "ligazon", buffer, theLigazon);
        }
        {
            JAXBElement<String> theSon;
            theSon = this.getSon();
            strategy.appendField(locator, this, "son", buffer, theSon);
        }
        {
            JAXBElement<ImaxeAdxunta> theThumbSon;
            theThumbSon = this.getThumbSon();
            strategy.appendField(locator, this, "thumbSon", buffer, theThumbSon);
        }
        {
            JAXBElement<String> theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        return buffer;
    }

}
