
package java.sql.xsd;

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
import webservicenoticia.Exception;


/**
 * <p>Clase Java para SQLException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SQLException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservicenoticia}Exception"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nextException" type="{http://sql.java/xsd}SQLException" minOccurs="0"/&gt;
 *         &lt;element name="sQLState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SQLException", propOrder = {
    "errorCode",
    "nextException",
    "sqlState"
})
public class SQLException
    extends Exception
    implements Equals, ToString
{

    protected Integer errorCode;
    @XmlElementRef(name = "nextException", namespace = "http://sql.java/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SQLException> nextException;
    @XmlElementRef(name = "sQLState", namespace = "http://sql.java/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sqlState;

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad nextException.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     *     
     */
    public JAXBElement<SQLException> getNextException() {
        return nextException;
    }

    /**
     * Define el valor de la propiedad nextException.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     *     
     */
    public void setNextException(JAXBElement<SQLException> value) {
        this.nextException = value;
    }

    /**
     * Obtiene el valor de la propiedad sqlState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSQLState() {
        return sqlState;
    }

    /**
     * Define el valor de la propiedad sqlState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSQLState(JAXBElement<String> value) {
        this.sqlState = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SQLException)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SQLException that = ((SQLException) object);
        {
            Integer lhsErrorCode;
            lhsErrorCode = this.getErrorCode();
            Integer rhsErrorCode;
            rhsErrorCode = that.getErrorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorCode", lhsErrorCode), LocatorUtils.property(thatLocator, "errorCode", rhsErrorCode), lhsErrorCode, rhsErrorCode)) {
                return false;
            }
        }
        {
            JAXBElement<SQLException> lhsNextException;
            lhsNextException = this.getNextException();
            JAXBElement<SQLException> rhsNextException;
            rhsNextException = that.getNextException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextException", lhsNextException), LocatorUtils.property(thatLocator, "nextException", rhsNextException), lhsNextException, rhsNextException)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsSQLState;
            lhsSQLState = this.getSQLState();
            JAXBElement<String> rhsSQLState;
            rhsSQLState = that.getSQLState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqlState", lhsSQLState), LocatorUtils.property(thatLocator, "sqlState", rhsSQLState), lhsSQLState, rhsSQLState)) {
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
        super.appendFields(locator, buffer, strategy);
        {
            Integer theErrorCode;
            theErrorCode = this.getErrorCode();
            strategy.appendField(locator, this, "errorCode", buffer, theErrorCode);
        }
        {
            JAXBElement<SQLException> theNextException;
            theNextException = this.getNextException();
            strategy.appendField(locator, this, "nextException", buffer, theNextException);
        }
        {
            JAXBElement<String> theSQLState;
            theSQLState = this.getSQLState();
            strategy.appendField(locator, this, "sqlState", buffer, theSQLState);
        }
        return buffer;
    }

}
