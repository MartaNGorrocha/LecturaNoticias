
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Clase Java para VideoAdxunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VideoAdxunto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="entrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thumbVid" type="{http://webservicenoticia/xsd}ImaxeAdxunta" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="video" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videoFSHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdxunto", propOrder = {
    "autor",
    "data",
    "entrada",
    "thumbVid",
    "titulo",
    "video",
    "videoFS",
    "videoFSHD"
})
public class VideoAdxunto
    implements Equals, ToString
{

    @XmlElementRef(name = "autor", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autor;
    @XmlElementRef(name = "data", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> data;
    @XmlElementRef(name = "entrada", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entrada;
    @XmlElementRef(name = "thumbVid", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ImaxeAdxunta> thumbVid;
    @XmlElementRef(name = "titulo", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;
    @XmlElementRef(name = "video", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> video;
    @XmlElementRef(name = "videoFS", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoFS;
    @XmlElementRef(name = "videoFSHD", namespace = "http://webservicenoticia/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoFSHD;

    /**
     * Obtiene el valor de la propiedad autor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutor() {
        return autor;
    }

    /**
     * Define el valor de la propiedad autor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutor(JAXBElement<String> value) {
        this.autor = value;
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
     * Obtiene el valor de la propiedad thumbVid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     *     
     */
    public JAXBElement<ImaxeAdxunta> getThumbVid() {
        return thumbVid;
    }

    /**
     * Define el valor de la propiedad thumbVid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     *     
     */
    public void setThumbVid(JAXBElement<ImaxeAdxunta> value) {
        this.thumbVid = value;
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
     * Obtiene el valor de la propiedad video.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideo() {
        return video;
    }

    /**
     * Define el valor de la propiedad video.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideo(JAXBElement<String> value) {
        this.video = value;
    }

    /**
     * Obtiene el valor de la propiedad videoFS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoFS() {
        return videoFS;
    }

    /**
     * Define el valor de la propiedad videoFS.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoFS(JAXBElement<String> value) {
        this.videoFS = value;
    }

    /**
     * Obtiene el valor de la propiedad videoFSHD.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoFSHD() {
        return videoFSHD;
    }

    /**
     * Define el valor de la propiedad videoFSHD.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoFSHD(JAXBElement<String> value) {
        this.videoFSHD = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VideoAdxunto)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoAdxunto that = ((VideoAdxunto) object);
        {
            JAXBElement<String> lhsAutor;
            lhsAutor = this.getAutor();
            JAXBElement<String> rhsAutor;
            rhsAutor = that.getAutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autor", lhsAutor), LocatorUtils.property(thatLocator, "autor", rhsAutor), lhsAutor, rhsAutor)) {
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
            JAXBElement<String> lhsEntrada;
            lhsEntrada = this.getEntrada();
            JAXBElement<String> rhsEntrada;
            rhsEntrada = that.getEntrada();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entrada", lhsEntrada), LocatorUtils.property(thatLocator, "entrada", rhsEntrada), lhsEntrada, rhsEntrada)) {
                return false;
            }
        }
        {
            JAXBElement<ImaxeAdxunta> lhsThumbVid;
            lhsThumbVid = this.getThumbVid();
            JAXBElement<ImaxeAdxunta> rhsThumbVid;
            rhsThumbVid = that.getThumbVid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thumbVid", lhsThumbVid), LocatorUtils.property(thatLocator, "thumbVid", rhsThumbVid), lhsThumbVid, rhsThumbVid)) {
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
            JAXBElement<String> lhsVideo;
            lhsVideo = this.getVideo();
            JAXBElement<String> rhsVideo;
            rhsVideo = that.getVideo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "video", lhsVideo), LocatorUtils.property(thatLocator, "video", rhsVideo), lhsVideo, rhsVideo)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsVideoFS;
            lhsVideoFS = this.getVideoFS();
            JAXBElement<String> rhsVideoFS;
            rhsVideoFS = that.getVideoFS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoFS", lhsVideoFS), LocatorUtils.property(thatLocator, "videoFS", rhsVideoFS), lhsVideoFS, rhsVideoFS)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsVideoFSHD;
            lhsVideoFSHD = this.getVideoFSHD();
            JAXBElement<String> rhsVideoFSHD;
            rhsVideoFSHD = that.getVideoFSHD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoFSHD", lhsVideoFSHD), LocatorUtils.property(thatLocator, "videoFSHD", rhsVideoFSHD), lhsVideoFSHD, rhsVideoFSHD)) {
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
            JAXBElement<String> theAutor;
            theAutor = this.getAutor();
            strategy.appendField(locator, this, "autor", buffer, theAutor);
        }
        {
            JAXBElement<XMLGregorianCalendar> theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        {
            JAXBElement<String> theEntrada;
            theEntrada = this.getEntrada();
            strategy.appendField(locator, this, "entrada", buffer, theEntrada);
        }
        {
            JAXBElement<ImaxeAdxunta> theThumbVid;
            theThumbVid = this.getThumbVid();
            strategy.appendField(locator, this, "thumbVid", buffer, theThumbVid);
        }
        {
            JAXBElement<String> theTitulo;
            theTitulo = this.getTitulo();
            strategy.appendField(locator, this, "titulo", buffer, theTitulo);
        }
        {
            JAXBElement<String> theVideo;
            theVideo = this.getVideo();
            strategy.appendField(locator, this, "video", buffer, theVideo);
        }
        {
            JAXBElement<String> theVideoFS;
            theVideoFS = this.getVideoFS();
            strategy.appendField(locator, this, "videoFS", buffer, theVideoFS);
        }
        {
            JAXBElement<String> theVideoFSHD;
            theVideoFSHD = this.getVideoFSHD();
            strategy.appendField(locator, this, "videoFSHD", buffer, theVideoFSHD);
        }
        return buffer;
    }

}
