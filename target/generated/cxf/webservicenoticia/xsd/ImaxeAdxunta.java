
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ImaxeAdxunta complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ImaxeAdxunta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxenMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxenMini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxenSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
public class ImaxeAdxunta {

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

}
