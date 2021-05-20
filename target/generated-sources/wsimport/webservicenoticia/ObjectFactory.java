
package webservicenoticia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import webservicenoticia.xsd.ListaNoticias;
import webservicenoticia.xsd.Noticia;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicenoticia package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _SQLExceptionSQLException_QNAME = new QName("http://webservicenoticia", "SQLException");
    private final static QName _AutenticarUser_QNAME = new QName("http://webservicenoticia", "user");
    private final static QName _AutenticarPass_QNAME = new QName("http://webservicenoticia", "pass");
    private final static QName _ObtenerResourceP_QNAME = new QName("http://webservicenoticia", "p");
    private final static QName _ObtenerResourceResponseReturn_QNAME = new QName("http://webservicenoticia", "return");
    private final static QName _GetListadoNoticiaColector_QNAME = new QName("http://webservicenoticia", "colector");
    private final static QName _GetListadoNoticiaT_QNAME = new QName("http://webservicenoticia", "t");
    private final static QName _GetListadoNoticiaD_QNAME = new QName("http://webservicenoticia", "d");
    private final static QName _GetListadoNoticiaLocaleString_QNAME = new QName("http://webservicenoticia", "localeString");
    private final static QName _GetNovaEstandarDetalleNova_QNAME = new QName("http://webservicenoticia", "nova");
    private final static QName _ExceptionException_QNAME = new QName("http://webservicenoticia", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicenoticia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link webservicenoticia.SQLException }
     * 
     */
    public webservicenoticia.SQLException createSQLException() {
        return new webservicenoticia.SQLException();
    }

    /**
     * Create an instance of {@link Autenticar }
     * 
     */
    public Autenticar createAutenticar() {
        return new Autenticar();
    }

    /**
     * Create an instance of {@link AutenticarResponse }
     * 
     */
    public AutenticarResponse createAutenticarResponse() {
        return new AutenticarResponse();
    }

    /**
     * Create an instance of {@link ObtenerResource }
     * 
     */
    public ObtenerResource createObtenerResource() {
        return new ObtenerResource();
    }

    /**
     * Create an instance of {@link ObtenerResourceResponse }
     * 
     */
    public ObtenerResourceResponse createObtenerResourceResponse() {
        return new ObtenerResourceResponse();
    }

    /**
     * Create an instance of {@link GetListadoNoticia }
     * 
     */
    public GetListadoNoticia createGetListadoNoticia() {
        return new GetListadoNoticia();
    }

    /**
     * Create an instance of {@link GetListadoNoticiaResponse }
     * 
     */
    public GetListadoNoticiaResponse createGetListadoNoticiaResponse() {
        return new GetListadoNoticiaResponse();
    }

    /**
     * Create an instance of {@link GetNovaEstandarDetalle }
     * 
     */
    public GetNovaEstandarDetalle createGetNovaEstandarDetalle() {
        return new GetNovaEstandarDetalle();
    }

    /**
     * Create an instance of {@link GetNovaEstandarDetalleResponse }
     * 
     */
    public GetNovaEstandarDetalleResponse createGetNovaEstandarDetalleResponse() {
        return new GetNovaEstandarDetalleResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.sql.xsd.SQLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.sql.xsd.SQLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "SQLException", scope = webservicenoticia.SQLException.class)
    public JAXBElement<java.sql.xsd.SQLException> createSQLExceptionSQLException(java.sql.xsd.SQLException value) {
        return new JAXBElement<java.sql.xsd.SQLException>(_SQLExceptionSQLException_QNAME, java.sql.xsd.SQLException.class, webservicenoticia.SQLException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "user", scope = Autenticar.class)
    public JAXBElement<String> createAutenticarUser(String value) {
        return new JAXBElement<String>(_AutenticarUser_QNAME, String.class, Autenticar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "pass", scope = Autenticar.class)
    public JAXBElement<String> createAutenticarPass(String value) {
        return new JAXBElement<String>(_AutenticarPass_QNAME, String.class, Autenticar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "p", scope = ObtenerResource.class)
    public JAXBElement<String> createObtenerResourceP(String value) {
        return new JAXBElement<String>(_ObtenerResourceP_QNAME, String.class, ObtenerResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "return", scope = ObtenerResourceResponse.class)
    public JAXBElement<String> createObtenerResourceResponseReturn(String value) {
        return new JAXBElement<String>(_ObtenerResourceResponseReturn_QNAME, String.class, ObtenerResourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "user", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaUser(String value) {
        return new JAXBElement<String>(_AutenticarUser_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "pass", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaPass(String value) {
        return new JAXBElement<String>(_AutenticarPass_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "colector", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaColector(String value) {
        return new JAXBElement<String>(_GetListadoNoticiaColector_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "p", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaP(String value) {
        return new JAXBElement<String>(_ObtenerResourceP_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "t", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaT(String value) {
        return new JAXBElement<String>(_GetListadoNoticiaT_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "d", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaD(String value) {
        return new JAXBElement<String>(_GetListadoNoticiaD_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "localeString", scope = GetListadoNoticia.class)
    public JAXBElement<String> createGetListadoNoticiaLocaleString(String value) {
        return new JAXBElement<String>(_GetListadoNoticiaLocaleString_QNAME, String.class, GetListadoNoticia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaNoticias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaNoticias }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "return", scope = GetListadoNoticiaResponse.class)
    public JAXBElement<ListaNoticias> createGetListadoNoticiaResponseReturn(ListaNoticias value) {
        return new JAXBElement<ListaNoticias>(_ObtenerResourceResponseReturn_QNAME, ListaNoticias.class, GetListadoNoticiaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "user", scope = GetNovaEstandarDetalle.class)
    public JAXBElement<String> createGetNovaEstandarDetalleUser(String value) {
        return new JAXBElement<String>(_AutenticarUser_QNAME, String.class, GetNovaEstandarDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "pass", scope = GetNovaEstandarDetalle.class)
    public JAXBElement<String> createGetNovaEstandarDetallePass(String value) {
        return new JAXBElement<String>(_AutenticarPass_QNAME, String.class, GetNovaEstandarDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "nova", scope = GetNovaEstandarDetalle.class)
    public JAXBElement<String> createGetNovaEstandarDetalleNova(String value) {
        return new JAXBElement<String>(_GetNovaEstandarDetalleNova_QNAME, String.class, GetNovaEstandarDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "localeString", scope = GetNovaEstandarDetalle.class)
    public JAXBElement<String> createGetNovaEstandarDetalleLocaleString(String value) {
        return new JAXBElement<String>(_GetListadoNoticiaLocaleString_QNAME, String.class, GetNovaEstandarDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Noticia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Noticia }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "return", scope = GetNovaEstandarDetalleResponse.class)
    public JAXBElement<Noticia> createGetNovaEstandarDetalleResponseReturn(Noticia value) {
        return new JAXBElement<Noticia>(_ObtenerResourceResponseReturn_QNAME, Noticia.class, GetNovaEstandarDetalleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservicenoticia", name = "Exception", scope = Exception.class)
    public JAXBElement<Object> createExceptionException(Object value) {
        return new JAXBElement<Object>(_ExceptionException_QNAME, Object.class, Exception.class, value);
    }

}
