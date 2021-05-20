
package webservicenoticia.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para ListaNoticias complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ListaNoticias"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="listaNoticias" type="{http://webservicenoticia/xsd}Noticia" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numNoticias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaNoticias", propOrder = {
    "listaNoticias",
    "numNoticias"
})
public class ListaNoticias {

    @XmlElement(nillable = true)
    protected List<Noticia> listaNoticias;
    protected Integer numNoticias;

    /**
     * Gets the value of the listaNoticias property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the listaNoticias property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getListaNoticias().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

}
