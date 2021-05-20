
package webservicenoticia.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Clase Java para Contido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anteTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="audiencia" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactosAdxuntos" type="{http://webservicenoticia/xsd}ContactoAdxunto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="corpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="documentosAdxuntos" type="{http://webservicenoticia/xsd}DocumentoAdxunto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etiquetas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feitoVital" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imaxeAc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imaxes" type="{http://webservicenoticia/xsd}ImaxeAdxunta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="imaxesAdxuntas" type="{http://webservicenoticia/xsd}ImaxeAdxunta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ligazonsAdxuntas" type="{http://webservicenoticia/xsd}LigazonAdxunta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localizacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organizacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pintarPe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sonsAdxuntos" type="{http://webservicenoticia/xsd}SonAdxunto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="textoD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosAdxuntos" type="{http://webservicenoticia/xsd}VideoAdxunto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contido", propOrder = {
    "anteTitulo",
    "audiencia",
    "contactosAdxuntos",
    "corpo",
    "data",
    "documentosAdxuntos",
    "entrada",
    "etiquetas",
    "feitoVital",
    "imaxeAc",
    "imaxes",
    "imaxesAdxuntas",
    "ligazonsAdxuntas",
    "localizacion",
    "organizacion",
    "path",
    "pintarPe",
    "sonsAdxuntos",
    "tema",
    "textoD",
    "titulo",
    "videosAdxuntos"
})
@XmlSeeAlso({
    Noticia.class
})
public class Contido
    implements Equals, ToString
{

    @XmlElementRef(name = "anteTitulo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anteTitulo;
    @XmlElement(nillable = true)
    protected List<String> audiencia;
    @XmlElement(nillable = true)
    protected List<ContactoAdxunto> contactosAdxuntos;
    @XmlElementRef(name = "corpo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpo;
    @XmlElementRef(name = "data", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> data;
    @XmlElement(nillable = true)
    protected List<DocumentoAdxunto> documentosAdxuntos;
    @XmlElementRef(name = "entrada", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entrada;
    @XmlElementRef(name = "etiquetas", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etiquetas;
    @XmlElement(nillable = true)
    protected List<String> feitoVital;
    @XmlElement(nillable = true)
    protected List<String> imaxeAc;
    @XmlElement(nillable = true)
    protected List<ImaxeAdxunta> imaxes;
    @XmlElement(nillable = true)
    protected List<ImaxeAdxunta> imaxesAdxuntas;
    @XmlElement(nillable = true)
    protected List<LigazonAdxunta> ligazonsAdxuntas;
    @XmlElement(nillable = true)
    protected List<String> localizacion;
    @XmlElement(nillable = true)
    protected List<String> organizacion;
    @XmlElementRef(name = "path", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> path;
    @XmlElementRef(name = "pintarPe", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pintarPe;
    @XmlElement(nillable = true)
    protected List<SonAdxunto> sonsAdxuntos;
    @XmlElement(nillable = true)
    protected List<String> tema;
    @XmlElement(nillable = true)
    protected List<String> textoD;
    @XmlElementRef(name = "titulo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;
    @XmlElement(nillable = true)
    protected List<VideoAdxunto> videosAdxuntos;

    /**
     * Obtiene el valor de la propiedad anteTitulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnteTitulo() {
        return anteTitulo;
    }

    /**
     * Define el valor de la propiedad anteTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnteTitulo(JAXBElement<String> value) {
        this.anteTitulo = value;
    }

    /**
     * Gets the value of the audiencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audiencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudiencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudiencia() {
        if (audiencia == null) {
            audiencia = new ArrayList<String>();
        }
        return this.audiencia;
    }

    /**
     * Gets the value of the contactosAdxuntos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactosAdxuntos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactosAdxuntos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactoAdxunto }
     * 
     * 
     */
    public List<ContactoAdxunto> getContactosAdxuntos() {
        if (contactosAdxuntos == null) {
            contactosAdxuntos = new ArrayList<ContactoAdxunto>();
        }
        return this.contactosAdxuntos;
    }

    /**
     * Obtiene el valor de la propiedad corpo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpo() {
        return corpo;
    }

    /**
     * Define el valor de la propiedad corpo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpo(JAXBElement<String> value) {
        this.corpo = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setData(JAXBElement<XMLGregorianCalendar> value) {
        this.data = value;
    }

    /**
     * Gets the value of the documentosAdxuntos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentosAdxuntos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentosAdxuntos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoAdxunto }
     * 
     * 
     */
    public List<DocumentoAdxunto> getDocumentosAdxuntos() {
        if (documentosAdxuntos == null) {
            documentosAdxuntos = new ArrayList<DocumentoAdxunto>();
        }
        return this.documentosAdxuntos;
    }

    /**
     * Obtiene el valor de la propiedad entrada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntrada() {
        return entrada;
    }

    /**
     * Define el valor de la propiedad entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntrada(JAXBElement<String> value) {
        this.entrada = value;
    }

    /**
     * Obtiene el valor de la propiedad etiquetas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtiquetas() {
        return etiquetas;
    }

    /**
     * Define el valor de la propiedad etiquetas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtiquetas(JAXBElement<String> value) {
        this.etiquetas = value;
    }

    /**
     * Gets the value of the feitoVital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feitoVital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeitoVital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeitoVital() {
        if (feitoVital == null) {
            feitoVital = new ArrayList<String>();
        }
        return this.feitoVital;
    }

    /**
     * Gets the value of the imaxeAc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imaxeAc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImaxeAc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImaxeAc() {
        if (imaxeAc == null) {
            imaxeAc = new ArrayList<String>();
        }
        return this.imaxeAc;
    }

    /**
     * Gets the value of the imaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImaxeAdxunta }
     * 
     * 
     */
    public List<ImaxeAdxunta> getImaxes() {
        if (imaxes == null) {
            imaxes = new ArrayList<ImaxeAdxunta>();
        }
        return this.imaxes;
    }

    /**
     * Gets the value of the imaxesAdxuntas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imaxesAdxuntas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImaxesAdxuntas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImaxeAdxunta }
     * 
     * 
     */
    public List<ImaxeAdxunta> getImaxesAdxuntas() {
        if (imaxesAdxuntas == null) {
            imaxesAdxuntas = new ArrayList<ImaxeAdxunta>();
        }
        return this.imaxesAdxuntas;
    }

    /**
     * Gets the value of the ligazonsAdxuntas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ligazonsAdxuntas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLigazonsAdxuntas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LigazonAdxunta }
     * 
     * 
     */
    public List<LigazonAdxunta> getLigazonsAdxuntas() {
        if (ligazonsAdxuntas == null) {
            ligazonsAdxuntas = new ArrayList<LigazonAdxunta>();
        }
        return this.ligazonsAdxuntas;
    }

    /**
     * Gets the value of the localizacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalizacion() {
        if (localizacion == null) {
            localizacion = new ArrayList<String>();
        }
        return this.localizacion;
    }

    /**
     * Gets the value of the organizacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganizacion() {
        if (organizacion == null) {
            organizacion = new ArrayList<String>();
        }
        return this.organizacion;
    }

    /**
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPath(JAXBElement<String> value) {
        this.path = value;
    }

    /**
     * Obtiene el valor de la propiedad pintarPe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPintarPe() {
        return pintarPe;
    }

    /**
     * Define el valor de la propiedad pintarPe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPintarPe(JAXBElement<String> value) {
        this.pintarPe = value;
    }

    /**
     * Gets the value of the sonsAdxuntos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonsAdxuntos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonsAdxuntos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SonAdxunto }
     * 
     * 
     */
    public List<SonAdxunto> getSonsAdxuntos() {
        if (sonsAdxuntos == null) {
            sonsAdxuntos = new ArrayList<SonAdxunto>();
        }
        return this.sonsAdxuntos;
    }

    /**
     * Gets the value of the tema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTema() {
        if (tema == null) {
            tema = new ArrayList<String>();
        }
        return this.tema;
    }

    /**
     * Gets the value of the textoD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textoD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextoD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextoD() {
        if (textoD == null) {
            textoD = new ArrayList<String>();
        }
        return this.textoD;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitulo(JAXBElement<String> value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the videosAdxuntos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videosAdxuntos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideosAdxuntos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoAdxunto }
     * 
     * 
     */
    public List<VideoAdxunto> getVideosAdxuntos() {
        if (videosAdxuntos == null) {
            videosAdxuntos = new ArrayList<VideoAdxunto>();
        }
        return this.videosAdxuntos;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Contido)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Contido that = ((Contido) object);
        {
            JAXBElement<String> lhsAnteTitulo;
            lhsAnteTitulo = this.getAnteTitulo();
            JAXBElement<String> rhsAnteTitulo;
            rhsAnteTitulo = that.getAnteTitulo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteTitulo", lhsAnteTitulo), LocatorUtils.property(thatLocator, "anteTitulo", rhsAnteTitulo), lhsAnteTitulo, rhsAnteTitulo)) {
                return false;
            }
        }
        {
            List<String> lhsAudiencia;
            lhsAudiencia = (((this.audiencia!= null)&&(!this.audiencia.isEmpty()))?this.getAudiencia():null);
            List<String> rhsAudiencia;
            rhsAudiencia = (((that.audiencia!= null)&&(!that.audiencia.isEmpty()))?that.getAudiencia():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "audiencia", lhsAudiencia), LocatorUtils.property(thatLocator, "audiencia", rhsAudiencia), lhsAudiencia, rhsAudiencia)) {
                return false;
            }
        }
        {
            List<ContactoAdxunto> lhsContactosAdxuntos;
            lhsContactosAdxuntos = (((this.contactosAdxuntos!= null)&&(!this.contactosAdxuntos.isEmpty()))?this.getContactosAdxuntos():null);
            List<ContactoAdxunto> rhsContactosAdxuntos;
            rhsContactosAdxuntos = (((that.contactosAdxuntos!= null)&&(!that.contactosAdxuntos.isEmpty()))?that.getContactosAdxuntos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactosAdxuntos", lhsContactosAdxuntos), LocatorUtils.property(thatLocator, "contactosAdxuntos", rhsContactosAdxuntos), lhsContactosAdxuntos, rhsContactosAdxuntos)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsCorpo;
            lhsCorpo = this.getCorpo();
            JAXBElement<String> rhsCorpo;
            rhsCorpo = that.getCorpo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corpo", lhsCorpo), LocatorUtils.property(thatLocator, "corpo", rhsCorpo), lhsCorpo, rhsCorpo)) {
                return false;
            }
        }
        {
            JAXBElement<XMLGregorianCalendar> lhsData;
            lhsData = this.getData();
            JAXBElement<XMLGregorianCalendar> rhsData;
            rhsData = that.getData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
                return false;
            }
        }
        {
            List<DocumentoAdxunto> lhsDocumentosAdxuntos;
            lhsDocumentosAdxuntos = (((this.documentosAdxuntos!= null)&&(!this.documentosAdxuntos.isEmpty()))?this.getDocumentosAdxuntos():null);
            List<DocumentoAdxunto> rhsDocumentosAdxuntos;
            rhsDocumentosAdxuntos = (((that.documentosAdxuntos!= null)&&(!that.documentosAdxuntos.isEmpty()))?that.getDocumentosAdxuntos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentosAdxuntos", lhsDocumentosAdxuntos), LocatorUtils.property(thatLocator, "documentosAdxuntos", rhsDocumentosAdxuntos), lhsDocumentosAdxuntos, rhsDocumentosAdxuntos)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEntrada;
            lhsEntrada = this.getEntrada();
            JAXBElement<String> rhsEntrada;
            rhsEntrada = that.getEntrada();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entrada", lhsEntrada), LocatorUtils.property(thatLocator, "entrada", rhsEntrada), lhsEntrada, rhsEntrada)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEtiquetas;
            lhsEtiquetas = this.getEtiquetas();
            JAXBElement<String> rhsEtiquetas;
            rhsEtiquetas = that.getEtiquetas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etiquetas", lhsEtiquetas), LocatorUtils.property(thatLocator, "etiquetas", rhsEtiquetas), lhsEtiquetas, rhsEtiquetas)) {
                return false;
            }
        }
        {
            List<String> lhsFeitoVital;
            lhsFeitoVital = (((this.feitoVital!= null)&&(!this.feitoVital.isEmpty()))?this.getFeitoVital():null);
            List<String> rhsFeitoVital;
            rhsFeitoVital = (((that.feitoVital!= null)&&(!that.feitoVital.isEmpty()))?that.getFeitoVital():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feitoVital", lhsFeitoVital), LocatorUtils.property(thatLocator, "feitoVital", rhsFeitoVital), lhsFeitoVital, rhsFeitoVital)) {
                return false;
            }
        }
        {
            List<String> lhsImaxeAc;
            lhsImaxeAc = (((this.imaxeAc!= null)&&(!this.imaxeAc.isEmpty()))?this.getImaxeAc():null);
            List<String> rhsImaxeAc;
            rhsImaxeAc = (((that.imaxeAc!= null)&&(!that.imaxeAc.isEmpty()))?that.getImaxeAc():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxeAc", lhsImaxeAc), LocatorUtils.property(thatLocator, "imaxeAc", rhsImaxeAc), lhsImaxeAc, rhsImaxeAc)) {
                return false;
            }
        }
        {
            List<ImaxeAdxunta> lhsImaxes;
            lhsImaxes = (((this.imaxes!= null)&&(!this.imaxes.isEmpty()))?this.getImaxes():null);
            List<ImaxeAdxunta> rhsImaxes;
            rhsImaxes = (((that.imaxes!= null)&&(!that.imaxes.isEmpty()))?that.getImaxes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxes", lhsImaxes), LocatorUtils.property(thatLocator, "imaxes", rhsImaxes), lhsImaxes, rhsImaxes)) {
                return false;
            }
        }
        {
            List<ImaxeAdxunta> lhsImaxesAdxuntas;
            lhsImaxesAdxuntas = (((this.imaxesAdxuntas!= null)&&(!this.imaxesAdxuntas.isEmpty()))?this.getImaxesAdxuntas():null);
            List<ImaxeAdxunta> rhsImaxesAdxuntas;
            rhsImaxesAdxuntas = (((that.imaxesAdxuntas!= null)&&(!that.imaxesAdxuntas.isEmpty()))?that.getImaxesAdxuntas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imaxesAdxuntas", lhsImaxesAdxuntas), LocatorUtils.property(thatLocator, "imaxesAdxuntas", rhsImaxesAdxuntas), lhsImaxesAdxuntas, rhsImaxesAdxuntas)) {
                return false;
            }
        }
        {
            List<LigazonAdxunta> lhsLigazonsAdxuntas;
            lhsLigazonsAdxuntas = (((this.ligazonsAdxuntas!= null)&&(!this.ligazonsAdxuntas.isEmpty()))?this.getLigazonsAdxuntas():null);
            List<LigazonAdxunta> rhsLigazonsAdxuntas;
            rhsLigazonsAdxuntas = (((that.ligazonsAdxuntas!= null)&&(!that.ligazonsAdxuntas.isEmpty()))?that.getLigazonsAdxuntas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ligazonsAdxuntas", lhsLigazonsAdxuntas), LocatorUtils.property(thatLocator, "ligazonsAdxuntas", rhsLigazonsAdxuntas), lhsLigazonsAdxuntas, rhsLigazonsAdxuntas)) {
                return false;
            }
        }
        {
            List<String> lhsLocalizacion;
            lhsLocalizacion = (((this.localizacion!= null)&&(!this.localizacion.isEmpty()))?this.getLocalizacion():null);
            List<String> rhsLocalizacion;
            rhsLocalizacion = (((that.localizacion!= null)&&(!that.localizacion.isEmpty()))?that.getLocalizacion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localizacion", lhsLocalizacion), LocatorUtils.property(thatLocator, "localizacion", rhsLocalizacion), lhsLocalizacion, rhsLocalizacion)) {
                return false;
            }
        }
        {
            List<String> lhsOrganizacion;
            lhsOrganizacion = (((this.organizacion!= null)&&(!this.organizacion.isEmpty()))?this.getOrganizacion():null);
            List<String> rhsOrganizacion;
            rhsOrganizacion = (((that.organizacion!= null)&&(!that.organizacion.isEmpty()))?that.getOrganizacion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizacion", lhsOrganizacion), LocatorUtils.property(thatLocator, "organizacion", rhsOrganizacion), lhsOrganizacion, rhsOrganizacion)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsPath;
            lhsPath = this.getPath();
            JAXBElement<String> rhsPath;
            rhsPath = that.getPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "path", lhsPath), LocatorUtils.property(thatLocator, "path", rhsPath), lhsPath, rhsPath)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsPintarPe;
            lhsPintarPe = this.getPintarPe();
            JAXBElement<String> rhsPintarPe;
            rhsPintarPe = that.getPintarPe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pintarPe", lhsPintarPe), LocatorUtils.property(thatLocator, "pintarPe", rhsPintarPe), lhsPintarPe, rhsPintarPe)) {
                return false;
            }
        }
        {
            List<SonAdxunto> lhsSonsAdxuntos;
            lhsSonsAdxuntos = (((this.sonsAdxuntos!= null)&&(!this.sonsAdxuntos.isEmpty()))?this.getSonsAdxuntos():null);
            List<SonAdxunto> rhsSonsAdxuntos;
            rhsSonsAdxuntos = (((that.sonsAdxuntos!= null)&&(!that.sonsAdxuntos.isEmpty()))?that.getSonsAdxuntos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonsAdxuntos", lhsSonsAdxuntos), LocatorUtils.property(thatLocator, "sonsAdxuntos", rhsSonsAdxuntos), lhsSonsAdxuntos, rhsSonsAdxuntos)) {
                return false;
            }
        }
        {
            List<String> lhsTema;
            lhsTema = (((this.tema!= null)&&(!this.tema.isEmpty()))?this.getTema():null);
            List<String> rhsTema;
            rhsTema = (((that.tema!= null)&&(!that.tema.isEmpty()))?that.getTema():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tema", lhsTema), LocatorUtils.property(thatLocator, "tema", rhsTema), lhsTema, rhsTema)) {
                return false;
            }
        }
        {
            List<String> lhsTextoD;
            lhsTextoD = (((this.textoD!= null)&&(!this.textoD.isEmpty()))?this.getTextoD():null);
            List<String> rhsTextoD;
            rhsTextoD = (((that.textoD!= null)&&(!that.textoD.isEmpty()))?that.getTextoD():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textoD", lhsTextoD), LocatorUtils.property(thatLocator, "textoD", rhsTextoD), lhsTextoD, rhsTextoD)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsTitulo;
            lhsTitulo = this.getTitulo();
            JAXBElement<String> rhsTitulo;
            rhsTitulo = that.getTitulo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titulo", lhsTitulo), LocatorUtils.property(thatLocator, "titulo", rhsTitulo), lhsTitulo, rhsTitulo)) {
                return false;
            }
        }
        {
            List<VideoAdxunto> lhsVideosAdxuntos;
            lhsVideosAdxuntos = (((this.videosAdxuntos!= null)&&(!this.videosAdxuntos.isEmpty()))?this.getVideosAdxuntos():null);
            List<VideoAdxunto> rhsVideosAdxuntos;
            rhsVideosAdxuntos = (((that.videosAdxuntos!= null)&&(!that.videosAdxuntos.isEmpty()))?that.getVideosAdxuntos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videosAdxuntos", lhsVideosAdxuntos), LocatorUtils.property(thatLocator, "videosAdxuntos", rhsVideosAdxuntos), lhsVideosAdxuntos, rhsVideosAdxuntos)) {
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
            JAXBElement<String> theAnteTitulo;
            theAnteTitulo = this.getAnteTitulo();
            strategy.appendField(locator, this, "anteTitulo", buffer, theAnteTitulo);
        }
        {
            List<String> theAudiencia;
            theAudiencia = (((this.audiencia!= null)&&(!this.audiencia.isEmpty()))?this.getAudiencia():null);
            strategy.appendField(locator, this, "audiencia", buffer, theAudiencia);
        }
        {
            List<ContactoAdxunto> theContactosAdxuntos;
            theContactosAdxuntos = (((this.contactosAdxuntos!= null)&&(!this.contactosAdxuntos.isEmpty()))?this.getContactosAdxuntos():null);
            strategy.appendField(locator, this, "contactosAdxuntos", buffer, theContactosAdxuntos);
        }
        {
            JAXBElement<String> theCorpo;
            theCorpo = this.getCorpo();
            strategy.appendField(locator, this, "corpo", buffer, theCorpo);
        }
        {
            JAXBElement<XMLGregorianCalendar> theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        {
            List<DocumentoAdxunto> theDocumentosAdxuntos;
            theDocumentosAdxuntos = (((this.documentosAdxuntos!= null)&&(!this.documentosAdxuntos.isEmpty()))?this.getDocumentosAdxuntos():null);
            strategy.appendField(locator, this, "documentosAdxuntos", buffer, theDocumentosAdxuntos);
        }
        {
            JAXBElement<String> theEntrada;
            theEntrada = this.getEntrada();
            strategy.appendField(locator, this, "entrada", buffer, theEntrada);
        }
        {
            JAXBElement<String> theEtiquetas;
            theEtiquetas = this.getEtiquetas();
            strategy.appendField(locator, this, "etiquetas", buffer, theEtiquetas);
        }
        {
            List<String> theFeitoVital;
            theFeitoVital = (((this.feitoVital!= null)&&(!this.feitoVital.isEmpty()))?this.getFeitoVital():null);
            strategy.appendField(locator, this, "feitoVital", buffer, theFeitoVital);
        }
        {
            List<String> theImaxeAc;
            theImaxeAc = (((this.imaxeAc!= null)&&(!this.imaxeAc.isEmpty()))?this.getImaxeAc():null);
            strategy.appendField(locator, this, "imaxeAc", buffer, theImaxeAc);
        }
        {
            List<ImaxeAdxunta> theImaxes;
            theImaxes = (((this.imaxes!= null)&&(!this.imaxes.isEmpty()))?this.getImaxes():null);
            strategy.appendField(locator, this, "imaxes", buffer, theImaxes);
        }
        {
            List<ImaxeAdxunta> theImaxesAdxuntas;
            theImaxesAdxuntas = (((this.imaxesAdxuntas!= null)&&(!this.imaxesAdxuntas.isEmpty()))?this.getImaxesAdxuntas():null);
            strategy.appendField(locator, this, "imaxesAdxuntas", buffer, theImaxesAdxuntas);
        }
        {
            List<LigazonAdxunta> theLigazonsAdxuntas;
            theLigazonsAdxuntas = (((this.ligazonsAdxuntas!= null)&&(!this.ligazonsAdxuntas.isEmpty()))?this.getLigazonsAdxuntas():null);
            strategy.appendField(locator, this, "ligazonsAdxuntas", buffer, theLigazonsAdxuntas);
        }
        {
            List<String> theLocalizacion;
            theLocalizacion = (((this.localizacion!= null)&&(!this.localizacion.isEmpty()))?this.getLocalizacion():null);
            strategy.appendField(locator, this, "localizacion", buffer, theLocalizacion);
        }
        {
            List<String> theOrganizacion;
            theOrganizacion = (((this.organizacion!= null)&&(!this.organizacion.isEmpty()))?this.getOrganizacion():null);
            strategy.appendField(locator, this, "organizacion", buffer, theOrganizacion);
        }
        {
            JAXBElement<String> thePath;
            thePath = this.getPath();
            strategy.appendField(locator, this, "path", buffer, thePath);
        }
        {
            JAXBElement<String> thePintarPe;
            thePintarPe = this.getPintarPe();
            strategy.appendField(locator, this, "pintarPe", buffer, thePintarPe);
        }
        {
            List<SonAdxunto> theSonsAdxuntos;
            theSonsAdxuntos = (((this.sonsAdxuntos!= null)&&(!this.sonsAdxuntos.isEmpty()))?this.getSonsAdxuntos():null);
            strategy.appendField(locator, this, "sonsAdxuntos", buffer, theSonsAdxuntos);
        }
        {
            List<String> theTema;
            theTema = (((this.tema!= null)&&(!this.tema.isEmpty()))?this.getTema():null);
            strategy.appendField(locator, this, "tema", buffer, theTema);
        }
        {
            List<String> theTextoD;
            theTextoD = (((this.textoD!= null)&&(!this.textoD.isEmpty()))?this.getTextoD():null);
            strategy.appendField(locator, this, "textoD", buffer, theTextoD);
        }
        {
            JAXBElement<String> theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        {
            List<VideoAdxunto> theVideosAdxuntos;
            theVideosAdxuntos = (((this.videosAdxuntos!= null)&&(!this.videosAdxuntos.isEmpty()))?this.getVideosAdxuntos():null);
            strategy.appendField(locator, this, "videosAdxuntos", buffer, theVideosAdxuntos);
        }
        return buffer;
    }

}
