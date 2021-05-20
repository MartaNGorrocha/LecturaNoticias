
package webservicenoticia.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Clase Java para ListaNoticias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaNoticias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaNoticias" type="{http://webservicenoticia/xsd}Noticia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numNoticias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaNoticias", propOrder = {
    "listaNoticias",
    "numNoticias"
})
public class ListaNoticias
    implements Equals, ToString
{

    @XmlElement(nillable = true)
    protected List<Noticia> listaNoticias;
    protected Integer numNoticias;

    /**
     * Gets the value of the listaNoticias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNoticias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNoticias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Noticia }
     * 
     * 
     */
    public List<Noticia> getListaNoticias() {
        if (listaNoticias == null) {
            listaNoticias = new ArrayList<Noticia>();
        }
        return this.listaNoticias;
    }

    /**
     * Obtiene el valor de la propiedad numNoticias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNoticias() {
        return numNoticias;
    }

    /**
     * Define el valor de la propiedad numNoticias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNoticias(Integer value) {
        this.numNoticias = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ListaNoticias)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ListaNoticias that = ((ListaNoticias) object);
        {
            List<Noticia> lhsListaNoticias;
            lhsListaNoticias = (((this.listaNoticias!= null)&&(!this.listaNoticias.isEmpty()))?this.getListaNoticias():null);
            List<Noticia> rhsListaNoticias;
            rhsListaNoticias = (((that.listaNoticias!= null)&&(!that.listaNoticias.isEmpty()))?that.getListaNoticias():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listaNoticias", lhsListaNoticias), LocatorUtils.property(thatLocator, "listaNoticias", rhsListaNoticias), lhsListaNoticias, rhsListaNoticias)) {
                return false;
            }
        }
        {
            Integer lhsNumNoticias;
            lhsNumNoticias = this.getNumNoticias();
            Integer rhsNumNoticias;
            rhsNumNoticias = that.getNumNoticias();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numNoticias", lhsNumNoticias), LocatorUtils.property(thatLocator, "numNoticias", rhsNumNoticias), lhsNumNoticias, rhsNumNoticias)) {
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
            List<Noticia> theListaNoticias;
            theListaNoticias = (((this.listaNoticias!= null)&&(!this.listaNoticias.isEmpty()))?this.getListaNoticias():null);
            strategy.appendField(locator, this, "listaNoticias", buffer, theListaNoticias);
        }
        {
            Integer theNumNoticias;
            theNumNoticias = this.getNumNoticias();
            strategy.appendField(locator, this, "numNoticias", buffer, theNumNoticias);
        }
        return buffer;
    }

}
