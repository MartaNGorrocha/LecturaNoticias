
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
 *         &amp;lt;element name="colector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numPag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tamPag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="di" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ai" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="df" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="mf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="af" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
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
    "colector",
    "p",
    "t",
    "d",
    "numPag",
    "tamPag",
    "di",
    "mi",
    "ai",
    "df",
    "mf",
    "af",
    "localeString"
})
@XmlRootElement(name = "getListadoNoticia")
public class GetListadoNoticia {

    @XmlElementRef(name = "user", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> user;
    @XmlElementRef(name = "pass", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pass;
    @XmlElementRef(name = "colector", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> colector;
    @XmlElementRef(name = "p", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> p;
    @XmlElementRef(name = "t", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> t;
    @XmlElementRef(name = "d", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> d;
    protected Integer numPag;
    protected Integer tamPag;
    protected Integer di;
    protected Integer mi;
    protected Integer ai;
    protected Integer df;
    protected Integer mf;
    protected Integer af;
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
     * Obtiene el valor de la propiedad colector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColector() {
        return colector;
    }

    /**
     * Define el valor de la propiedad colector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColector(JAXBElement<String> value) {
        this.colector = value;
    }

    /**
     * Obtiene el valor de la propiedad p.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getP() {
        return p;
    }

    /**
     * Define el valor de la propiedad p.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setP(JAXBElement<String> value) {
        this.p = value;
    }

    /**
     * Obtiene el valor de la propiedad t.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setT(JAXBElement<String> value) {
        this.t = value;
    }

    /**
     * Obtiene el valor de la propiedad d.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getD() {
        return d;
    }

    /**
     * Define el valor de la propiedad d.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setD(JAXBElement<String> value) {
        this.d = value;
    }

    /**
     * Obtiene el valor de la propiedad numPag.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPag() {
        return numPag;
    }

    /**
     * Define el valor de la propiedad numPag.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPag(Integer value) {
        this.numPag = value;
    }

    /**
     * Obtiene el valor de la propiedad tamPag.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTamPag() {
        return tamPag;
    }

    /**
     * Define el valor de la propiedad tamPag.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTamPag(Integer value) {
        this.tamPag = value;
    }

    /**
     * Obtiene el valor de la propiedad di.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDi() {
        return di;
    }

    /**
     * Define el valor de la propiedad di.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDi(Integer value) {
        this.di = value;
    }

    /**
     * Obtiene el valor de la propiedad mi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMi() {
        return mi;
    }

    /**
     * Define el valor de la propiedad mi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMi(Integer value) {
        this.mi = value;
    }

    /**
     * Obtiene el valor de la propiedad ai.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAi() {
        return ai;
    }

    /**
     * Define el valor de la propiedad ai.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAi(Integer value) {
        this.ai = value;
    }

    /**
     * Obtiene el valor de la propiedad df.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDf() {
        return df;
    }

    /**
     * Define el valor de la propiedad df.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDf(Integer value) {
        this.df = value;
    }

    /**
     * Obtiene el valor de la propiedad mf.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMf() {
        return mf;
    }

    /**
     * Define el valor de la propiedad mf.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMf(Integer value) {
        this.mf = value;
    }

    /**
     * Obtiene el valor de la propiedad af.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAf() {
        return af;
    }

    /**
     * Define el valor de la propiedad af.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAf(Integer value) {
        this.af = value;
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
