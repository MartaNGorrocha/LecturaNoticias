
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Clase Java para SonAdxunto complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SonAdxunto"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ligazon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="son" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="thumbSon" type="{http://webservicenoticia/xsd}ImaxeAdxunta" minOccurs="0"/&amp;gt;
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
@XmlType(name = "SonAdxunto", propOrder = {
    "autor",
    "data",
    "entrada",
    "ligazon",
    "son",
    "thumbSon",
    "titulo"
})
public class SonAdxunto {

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

}
