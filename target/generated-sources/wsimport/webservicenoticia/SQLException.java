
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
 *         &lt;element name="SQLException" type="{http://sql.java/xsd}SQLException" minOccurs="0"/&gt;
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
    "sqlException"
})
@XmlRootElement(name = "SQLException")
public class SQLException
    implements Equals, ToString
{

    @XmlElementRef(name = "SQLException", namespace = "http://webservicenoticia", type = JAXBElement.class, required = false)
    protected JAXBElement<java.sql.xsd.SQLException> sqlException;

    /**
     * Obtiene el valor de la propiedad sqlException.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.sql.xsd.SQLException }{@code >}
     *     
     */
    public JAXBElement<java.sql.xsd.SQLException> getSQLException() {
        return sqlException;
    }

    /**
     * Define el valor de la propiedad sqlException.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.sql.xsd.SQLException }{@code >}
     *     
     */
    public void setSQLException(JAXBElement<java.sql.xsd.SQLException> value) {
        this.sqlException = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SQLException)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SQLException that = ((SQLException) object);
        {
            JAXBElement<java.sql.xsd.SQLException> lhsSQLException;
            lhsSQLException = this.getSQLException();
            JAXBElement<java.sql.xsd.SQLException> rhsSQLException;
            rhsSQLException = that.getSQLException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqlException", lhsSQLException), LocatorUtils.property(thatLocator, "sqlException", rhsSQLException), lhsSQLException, rhsSQLException)) {
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
            JAXBElement<java.sql.xsd.SQLException> theSQLException;
            theSQLException = this.getSQLException();
            strategy.appendField(locator, this, "sqlException", buffer, theSQLException);
        }
        return buffer;
    }

}
