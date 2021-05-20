
package java.sql.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import webservicenoticia.Exception;


/**
 * &lt;p&gt;Clase Java para SQLException complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SQLException"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://webservicenoticia}Exception"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nextException" type="{http://sql.java/xsd}SQLException" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sQLState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

}
