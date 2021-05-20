
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
 *         &lt;element name="colector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tamPag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="di" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ai" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="df" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="af" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
public class GetListadoNoticia
    implements Equals, ToString
{

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetListadoNoticia)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GetListadoNoticia that = ((GetListadoNoticia) object);
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
            JAXBElement<String> lhsColector;
            lhsColector = this.getColector();
            JAXBElement<String> rhsColector;
            rhsColector = that.getColector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colector", lhsColector), LocatorUtils.property(thatLocator, "colector", rhsColector), lhsColector, rhsColector)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsP;
            lhsP = this.getP();
            JAXBElement<String> rhsP;
            rhsP = that.getP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "p", lhsP), LocatorUtils.property(thatLocator, "p", rhsP), lhsP, rhsP)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsT;
            lhsT = this.getT();
            JAXBElement<String> rhsT;
            rhsT = that.getT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "t", lhsT), LocatorUtils.property(thatLocator, "t", rhsT), lhsT, rhsT)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsD;
            lhsD = this.getD();
            JAXBElement<String> rhsD;
            rhsD = that.getD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "d", lhsD), LocatorUtils.property(thatLocator, "d", rhsD), lhsD, rhsD)) {
                return false;
            }
        }
        {
            Integer lhsNumPag;
            lhsNumPag = this.getNumPag();
            Integer rhsNumPag;
            rhsNumPag = that.getNumPag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numPag", lhsNumPag), LocatorUtils.property(thatLocator, "numPag", rhsNumPag), lhsNumPag, rhsNumPag)) {
                return false;
            }
        }
        {
            Integer lhsTamPag;
            lhsTamPag = this.getTamPag();
            Integer rhsTamPag;
            rhsTamPag = that.getTamPag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tamPag", lhsTamPag), LocatorUtils.property(thatLocator, "tamPag", rhsTamPag), lhsTamPag, rhsTamPag)) {
                return false;
            }
        }
        {
            Integer lhsDi;
            lhsDi = this.getDi();
            Integer rhsDi;
            rhsDi = that.getDi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "di", lhsDi), LocatorUtils.property(thatLocator, "di", rhsDi), lhsDi, rhsDi)) {
                return false;
            }
        }
        {
            Integer lhsMi;
            lhsMi = this.getMi();
            Integer rhsMi;
            rhsMi = that.getMi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mi", lhsMi), LocatorUtils.property(thatLocator, "mi", rhsMi), lhsMi, rhsMi)) {
                return false;
            }
        }
        {
            Integer lhsAi;
            lhsAi = this.getAi();
            Integer rhsAi;
            rhsAi = that.getAi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ai", lhsAi), LocatorUtils.property(thatLocator, "ai", rhsAi), lhsAi, rhsAi)) {
                return false;
            }
        }
        {
            Integer lhsDf;
            lhsDf = this.getDf();
            Integer rhsDf;
            rhsDf = that.getDf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "df", lhsDf), LocatorUtils.property(thatLocator, "df", rhsDf), lhsDf, rhsDf)) {
                return false;
            }
        }
        {
            Integer lhsMf;
            lhsMf = this.getMf();
            Integer rhsMf;
            rhsMf = that.getMf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mf", lhsMf), LocatorUtils.property(thatLocator, "mf", rhsMf), lhsMf, rhsMf)) {
                return false;
            }
        }
        {
            Integer lhsAf;
            lhsAf = this.getAf();
            Integer rhsAf;
            rhsAf = that.getAf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "af", lhsAf), LocatorUtils.property(thatLocator, "af", rhsAf), lhsAf, rhsAf)) {
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
            JAXBElement<String> theColector;
            theColector = this.getColector();
            strategy.appendField(locator, this, "colector", buffer, theColector);
        }
        {
            JAXBElement<String> theP;
            theP = this.getP();
            strategy.appendField(locator, this, "p", buffer, theP);
        }
        {
            JAXBElement<String> theT;
            theT = this.getT();
            strategy.appendField(locator, this, "t", buffer, theT);
        }
        {
            JAXBElement<String> theD;
            theD = this.getD();
            strategy.appendField(locator, this, "d", buffer, theD);
        }
        {
            Integer theNumPag;
            theNumPag = this.getNumPag();
            strategy.appendField(locator, this, "numPag", buffer, theNumPag);
        }
        {
            Integer theTamPag;
            theTamPag = this.getTamPag();
            strategy.appendField(locator, this, "tamPag", buffer, theTamPag);
        }
        {
            Integer theDi;
            theDi = this.getDi();
            strategy.appendField(locator, this, "di", buffer, theDi);
        }
        {
            Integer theMi;
            theMi = this.getMi();
            strategy.appendField(locator, this, "mi", buffer, theMi);
        }
        {
            Integer theAi;
            theAi = this.getAi();
            strategy.appendField(locator, this, "ai", buffer, theAi);
        }
        {
            Integer theDf;
            theDf = this.getDf();
            strategy.appendField(locator, this, "df", buffer, theDf);
        }
        {
            Integer theMf;
            theMf = this.getMf();
            strategy.appendField(locator, this, "mf", buffer, theMf);
        }
        {
            Integer theAf;
            theAf = this.getAf();
            strategy.appendField(locator, this, "af", buffer, theAf);
        }
        {
            JAXBElement<String> theLocaleString;
            theLocaleString = this.getLocaleString();
            strategy.appendField(locator, this, "localeString", buffer, theLocaleString);
        }
        return buffer;
    }

}
