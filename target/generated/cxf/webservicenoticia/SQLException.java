
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
 *         &amp;lt;element name="SQLException" type="{http://sql.java/xsd}SQLException" minOccurs="0"/&amp;gt;
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
    "sqlException"
})
@XmlRootElement(name = "SQLException")
public class SQLException {

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

}
