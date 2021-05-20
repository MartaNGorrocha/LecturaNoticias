
package webservicenoticia.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para Noticia complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Noticia"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://webservicenoticia/xsd}Contido"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="autores" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pesoPortada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
{

    @XmlElement(nillable = true)
    protected List<String> autores;
    @XmlElementRef(name = "pesoPortada", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pesoPortada;

    /**
     * Gets the value of the autores property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the autores property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAutores().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

}
