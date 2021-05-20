
package webservicenoticia.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicenoticia.xsd package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VideoAdxuntoAutor_QNAME = new QName("http://webservicenoticia/xsd", "autor");
    private final static QName _VideoAdxuntoData_QNAME = new QName("http://webservicenoticia/xsd", "data");
    private final static QName _VideoAdxuntoEntrada_QNAME = new QName("http://webservicenoticia/xsd", "entrada");
    private final static QName _VideoAdxuntoThumbVid_QNAME = new QName("http://webservicenoticia/xsd", "thumbVid");
    private final static QName _VideoAdxuntoTitulo_QNAME = new QName("http://webservicenoticia/xsd", "titulo");
    private final static QName _VideoAdxuntoVideo_QNAME = new QName("http://webservicenoticia/xsd", "video");
    private final static QName _VideoAdxuntoVideoFS_QNAME = new QName("http://webservicenoticia/xsd", "videoFS");
    private final static QName _VideoAdxuntoVideoFSHD_QNAME = new QName("http://webservicenoticia/xsd", "videoFSHD");
    private final static QName _SonAdxuntoLigazon_QNAME = new QName("http://webservicenoticia/xsd", "ligazon");
    private final static QName _SonAdxuntoSon_QNAME = new QName("http://webservicenoticia/xsd", "son");
    private final static QName _SonAdxuntoThumbSon_QNAME = new QName("http://webservicenoticia/xsd", "thumbSon");
    private final static QName _LigazonAdxuntaDescriptor_QNAME = new QName("http://webservicenoticia/xsd", "descriptor");
    private final static QName _LigazonAdxuntaSigla_QNAME = new QName("http://webservicenoticia/xsd", "sigla");
    private final static QName _LigazonAdxuntaUrl_QNAME = new QName("http://webservicenoticia/xsd", "url");
    private final static QName _LigazonAdxuntaVenta_QNAME = new QName("http://webservicenoticia/xsd", "venta");
    private final static QName _ImaxeAdxuntaImaxen_QNAME = new QName("http://webservicenoticia/xsd", "imaxen");
    private final static QName _ImaxeAdxuntaImaxenMedium_QNAME = new QName("http://webservicenoticia/xsd", "imaxenMedium");
    private final static QName _ImaxeAdxuntaImaxenMini_QNAME = new QName("http://webservicenoticia/xsd", "imaxenMini");
    private final static QName _ImaxeAdxuntaImaxenSmall_QNAME = new QName("http://webservicenoticia/xsd", "imaxenSmall");
    private final static QName _DocumentoAdxuntoDocumento_QNAME = new QName("http://webservicenoticia/xsd", "documento");
    private final static QName _DocumentoAdxuntoVersion_QNAME = new QName("http://webservicenoticia/xsd", "version");
    private final static QName _ContactoAdxuntoCodigoPostal_QNAME = new QName("http://webservicenoticia/xsd", "codigoPostal");
    private final static QName _ContactoAdxuntoConcello_QNAME = new QName("http://webservicenoticia/xsd", "concello");
    private final static QName _ContactoAdxuntoCorreo_QNAME = new QName("http://webservicenoticia/xsd", "correo");
    private final static QName _ContactoAdxuntoDireccion_QNAME = new QName("http://webservicenoticia/xsd", "direccion");
    private final static QName _ContactoAdxuntoNome_QNAME = new QName("http://webservicenoticia/xsd", "nome");
    private final static QName _ContactoAdxuntoProvincia_QNAME = new QName("http://webservicenoticia/xsd", "provincia");
    private final static QName _ContidoAnteTitulo_QNAME = new QName("http://webservicenoticia/xsd", "anteTitulo");
    private final static QName _ContidoCorpo_QNAME = new QName("http://webservicenoticia/xsd", "corpo");
    private final static QName _ContidoEtiquetas_QNAME = new QName("http://webservicenoticia/xsd", "etiquetas");
    private final static QName _ContidoPath_QNAME = new QName("http://webservicenoticia/xsd", "path");
    private final static QName _ContidoPintarPe_QNAME = new QName("http://webservicenoticia/xsd", "pintarPe");
    private final static QName _NoticiaPesoPortada_QNAME = new QName("http://webservicenoticia/xsd", "pesoPortada");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicenoticia.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaNoticias }
     * 
     */
    public ListaNoticias createListaNoticias() {
        return new ListaNoticias();
    }

    /**
     * Create an instance of {@link Noticia }
     * 
     */
    public Noticia createNoticia() {
        return new Noticia();
    }

    /**
     * Create an instance of {@link Contido }
     * 
     */
    public Contido createContido() {
        return new Contido();
    }

    /**
     * Create an instance of {@link ContactoAdxunto }
     * 
     */
    public ContactoAdxunto createContactoAdxunto() {
        return new ContactoAdxunto();
    }

    /**
     * Create an instance of {@link DocumentoAdxunto }
     * 
     */
    public DocumentoAdxunto createDocumentoAdxunto() {
        return new DocumentoAdxunto();
    }

    /**
     * Create an instance of {@link ImaxeAdxunta }
     * 
     */
    public ImaxeAdxunta createImaxeAdxunta() {
        return new ImaxeAdxunta();
    }

    /**
     * Create an instance of {@link LigazonAdxunta }
     * 
     */
    public LigazonAdxunta createLigazonAdxunta() {
        return new LigazonAdxunta();
    }

    /**
     * Create an instance of {@link SonAdxunto }
     * 
     */
    public SonAdxunto createSonAdxunto() {
        return new SonAdxunto();
    }

    /**
     * Create an instance of {@link VideoAdxunto }
     * 
     */
    public VideoAdxunto createVideoAdxunto() {
        return new VideoAdxunto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "autor", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoAutor(String value) {
        return new JAXBElement<String>(_VideoAdxuntoAutor_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "data", scope = VideoAdxunto.class)
    public JAXBElement<XMLGregorianCalendar> createVideoAdxuntoData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoAdxuntoData_QNAME, XMLGregorianCalendar.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "entrada", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoEntrada(String value) {
        return new JAXBElement<String>(_VideoAdxuntoEntrada_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "thumbVid", scope = VideoAdxunto.class)
    public JAXBElement<ImaxeAdxunta> createVideoAdxuntoThumbVid(ImaxeAdxunta value) {
        return new JAXBElement<ImaxeAdxunta>(_VideoAdxuntoThumbVid_QNAME, ImaxeAdxunta.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "video", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoVideo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoVideo_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "videoFS", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoVideoFS(String value) {
        return new JAXBElement<String>(_VideoAdxuntoVideoFS_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "videoFSHD", scope = VideoAdxunto.class)
    public JAXBElement<String> createVideoAdxuntoVideoFSHD(String value) {
        return new JAXBElement<String>(_VideoAdxuntoVideoFSHD_QNAME, String.class, VideoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "autor", scope = SonAdxunto.class)
    public JAXBElement<String> createSonAdxuntoAutor(String value) {
        return new JAXBElement<String>(_VideoAdxuntoAutor_QNAME, String.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "data", scope = SonAdxunto.class)
    public JAXBElement<XMLGregorianCalendar> createSonAdxuntoData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoAdxuntoData_QNAME, XMLGregorianCalendar.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "entrada", scope = SonAdxunto.class)
    public JAXBElement<String> createSonAdxuntoEntrada(String value) {
        return new JAXBElement<String>(_VideoAdxuntoEntrada_QNAME, String.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "ligazon", scope = SonAdxunto.class)
    public JAXBElement<String> createSonAdxuntoLigazon(String value) {
        return new JAXBElement<String>(_SonAdxuntoLigazon_QNAME, String.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "son", scope = SonAdxunto.class)
    public JAXBElement<String> createSonAdxuntoSon(String value) {
        return new JAXBElement<String>(_SonAdxuntoSon_QNAME, String.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImaxeAdxunta }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "thumbSon", scope = SonAdxunto.class)
    public JAXBElement<ImaxeAdxunta> createSonAdxuntoThumbSon(ImaxeAdxunta value) {
        return new JAXBElement<ImaxeAdxunta>(_SonAdxuntoThumbSon_QNAME, ImaxeAdxunta.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = SonAdxunto.class)
    public JAXBElement<String> createSonAdxuntoTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, SonAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "descriptor", scope = LigazonAdxunta.class)
    public JAXBElement<String> createLigazonAdxuntaDescriptor(String value) {
        return new JAXBElement<String>(_LigazonAdxuntaDescriptor_QNAME, String.class, LigazonAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "sigla", scope = LigazonAdxunta.class)
    public JAXBElement<String> createLigazonAdxuntaSigla(String value) {
        return new JAXBElement<String>(_LigazonAdxuntaSigla_QNAME, String.class, LigazonAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = LigazonAdxunta.class)
    public JAXBElement<String> createLigazonAdxuntaTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, LigazonAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "url", scope = LigazonAdxunta.class)
    public JAXBElement<String> createLigazonAdxuntaUrl(String value) {
        return new JAXBElement<String>(_LigazonAdxuntaUrl_QNAME, String.class, LigazonAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "venta", scope = LigazonAdxunta.class)
    public JAXBElement<String> createLigazonAdxuntaVenta(String value) {
        return new JAXBElement<String>(_LigazonAdxuntaVenta_QNAME, String.class, LigazonAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "autor", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaAutor(String value) {
        return new JAXBElement<String>(_VideoAdxuntoAutor_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "imaxen", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaImaxen(String value) {
        return new JAXBElement<String>(_ImaxeAdxuntaImaxen_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "imaxenMedium", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaImaxenMedium(String value) {
        return new JAXBElement<String>(_ImaxeAdxuntaImaxenMedium_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "imaxenMini", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaImaxenMini(String value) {
        return new JAXBElement<String>(_ImaxeAdxuntaImaxenMini_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "imaxenSmall", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaImaxenSmall(String value) {
        return new JAXBElement<String>(_ImaxeAdxuntaImaxenSmall_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = ImaxeAdxunta.class)
    public JAXBElement<String> createImaxeAdxuntaTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, ImaxeAdxunta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "autor", scope = DocumentoAdxunto.class)
    public JAXBElement<String> createDocumentoAdxuntoAutor(String value) {
        return new JAXBElement<String>(_VideoAdxuntoAutor_QNAME, String.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "data", scope = DocumentoAdxunto.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentoAdxuntoData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoAdxuntoData_QNAME, XMLGregorianCalendar.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "documento", scope = DocumentoAdxunto.class)
    public JAXBElement<String> createDocumentoAdxuntoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoAdxuntoDocumento_QNAME, String.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "entrada", scope = DocumentoAdxunto.class)
    public JAXBElement<String> createDocumentoAdxuntoEntrada(String value) {
        return new JAXBElement<String>(_VideoAdxuntoEntrada_QNAME, String.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = DocumentoAdxunto.class)
    public JAXBElement<String> createDocumentoAdxuntoTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "version", scope = DocumentoAdxunto.class)
    public JAXBElement<String> createDocumentoAdxuntoVersion(String value) {
        return new JAXBElement<String>(_DocumentoAdxuntoVersion_QNAME, String.class, DocumentoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "codigoPostal", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoCodigoPostal(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoCodigoPostal_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "concello", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoConcello(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoConcello_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "correo", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoCorreo(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoCorreo_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "direccion", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoDireccion(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoDireccion_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "nome", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoNome(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoNome_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "provincia", scope = ContactoAdxunto.class)
    public JAXBElement<String> createContactoAdxuntoProvincia(String value) {
        return new JAXBElement<String>(_ContactoAdxuntoProvincia_QNAME, String.class, ContactoAdxunto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "anteTitulo", scope = Contido.class)
    public JAXBElement<String> createContidoAnteTitulo(String value) {
        return new JAXBElement<String>(_ContidoAnteTitulo_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "corpo", scope = Contido.class)
    public JAXBElement<String> createContidoCorpo(String value) {
        return new JAXBElement<String>(_ContidoCorpo_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "data", scope = Contido.class)
    public JAXBElement<XMLGregorianCalendar> createContidoData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_VideoAdxuntoData_QNAME, XMLGregorianCalendar.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "entrada", scope = Contido.class)
    public JAXBElement<String> createContidoEntrada(String value) {
        return new JAXBElement<String>(_VideoAdxuntoEntrada_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "etiquetas", scope = Contido.class)
    public JAXBElement<String> createContidoEtiquetas(String value) {
        return new JAXBElement<String>(_ContidoEtiquetas_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "path", scope = Contido.class)
    public JAXBElement<String> createContidoPath(String value) {
        return new JAXBElement<String>(_ContidoPath_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "pintarPe", scope = Contido.class)
    public JAXBElement<String> createContidoPintarPe(String value) {
        return new JAXBElement<String>(_ContidoPintarPe_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "titulo", scope = Contido.class)
    public JAXBElement<String> createContidoTitulo(String value) {
        return new JAXBElement<String>(_VideoAdxuntoTitulo_QNAME, String.class, Contido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia/xsd", name = "pesoPortada", scope = Noticia.class)
    public JAXBElement<String> createNoticiaPesoPortada(String value) {
        return new JAXBElement<String>(_NoticiaPesoPortada_QNAME, String.class, Noticia.class, value);
    }

}
