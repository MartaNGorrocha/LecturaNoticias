
package webservicenoticia.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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


/**
 * <p>Clase Java para Noticia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Noticia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservicenoticia/xsd}Contido"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autores" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pesoPortada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Noticia", propOrder = {
    "autores",
    "pesoPortada"
})
public class Noticia
    extends Contido
    implements Equals, ToString
{

    @XmlElement(nillable = true)
    protected List<String> autores;
    @XmlElementRef(name = "pesoPortada", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pesoPortada;

    /**
     * Gets the value of the autores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutores() {
        if (autores == null) {
            autores = new ArrayList<String>();
        }
        return this.autores;
    }

    /**
     * Obtiene el valor de la propiedad pesoPortada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPesoPortada() {
        return pesoPortada;
    }

    /**
     * Define el valor de la propiedad pesoPortada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPesoPortada(JAXBElement<String> value) {
        this.pesoPortada = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Noticia)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Noticia that = ((Noticia) object);
        {
            List<String> lhsAutores;
            lhsAutores = (((this.autores!= null)&&(!this.autores.isEmpty()))?this.getAutores():null);
            List<String> rhsAutores;
            rhsAutores = (((that.autores!= null)&&(!that.autores.isEmpty()))?that.getAutores():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autores", lhsAutores), LocatorUtils.property(thatLocator, "autores", rhsAutores), lhsAutores, rhsAutores)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsPesoPortada;
            lhsPesoPortada = this.getPesoPortada();
            JAXBElement<String> rhsPesoPortada;
            rhsPesoPortada = that.getPesoPortada();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pesoPortada", lhsPesoPortada), LocatorUtils.property(thatLocator, "pesoPortada", rhsPesoPortada), lhsPesoPortada, rhsPesoPortada)) {
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
            List<String> theAutores;
            theAutores = (((this.autores!= null)&&(!this.autores.isEmpty()))?this.getAutores():null);
            strategy.appendField(locator, this, "autores", buffer, theAutores);
        }
        {
            JAXBElement<String> thePesoPortada;
            thePesoPortada = this.getPesoPortada();
            strategy.appendField(locator, this, "pesoPortada", buffer, thePesoPortada);
        }
        return buffer;
    }

}
