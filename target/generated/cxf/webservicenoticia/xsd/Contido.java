
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


/**
 * &lt;p&gt;Clase Java para Contido complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Contido"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="anteTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="audiencia" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactosAdxuntos" type="{http://webservicenoticia/xsd}ContactoAdxunto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="corpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="documentosAdxuntos" type="{http://webservicenoticia/xsd}DocumentoAdxunto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="etiquetas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="feitoVital" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxeAc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxes" type="{http://webservicenoticia/xsd}ImaxeAdxunta" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="imaxesAdxuntas" type="{http://webservicenoticia/xsd}ImaxeAdxunta" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ligazonsAdxuntas" type="{http://webservicenoticia/xsd}LigazonAdxunta" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="localizacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="organizacion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pintarPe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sonsAdxuntos" type="{http://webservicenoticia/xsd}SonAdxunto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="textoD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="videosAdxuntos" type="{http://webservicenoticia/xsd}VideoAdxunto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
public class Contido {

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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the audiencia property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAudiencia().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contactosAdxuntos property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContactosAdxuntos().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the documentosAdxuntos property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDocumentosAdxuntos().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the feitoVital property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFeitoVital().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the imaxeAc property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getImaxeAc().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the imaxes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getImaxes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the imaxesAdxuntas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getImaxesAdxuntas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ligazonsAdxuntas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLigazonsAdxuntas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the localizacion property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLocalizacion().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the organizacion property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrganizacion().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sonsAdxuntos property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSonsAdxuntos().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tema property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTema().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the textoD property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTextoD().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the videosAdxuntos property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getVideosAdxuntos().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

}
