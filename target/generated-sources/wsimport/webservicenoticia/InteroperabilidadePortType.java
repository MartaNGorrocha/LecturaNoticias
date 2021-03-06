
package webservicenoticia;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import webservicenoticia.xsd.ListaNoticias;
import webservicenoticia.xsd.Noticia;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InteroperabilidadePortType", targetNamespace = "http://webservicenoticia")
@XmlSeeAlso({
    java.sql.xsd.ObjectFactory.class,
    webservicenoticia.ObjectFactory.class,
    webservicenoticia.xsd.ObjectFactory.class
})
public interface InteroperabilidadePortType {


    /**
     * 
     * @param df
     * @param d
     * @param pass
     * @param di
     * @param af
     * @param colector
     * @param numPag
     * @param ai
     * @param tamPag
     * @param p
     * @param t
     * @param localeString
     * @param mf
     * @param mi
     * @param user
     * @return
     *     returns webservicenoticia.xsd.ListaNoticias
     * @throws SQLException_Exception
     */
    @WebMethod(action = "urn:getListadoNoticia")
    @WebResult(targetNamespace = "http://webservicenoticia")
    @RequestWrapper(localName = "getListadoNoticia", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetListadoNoticia")
    @ResponseWrapper(localName = "getListadoNoticiaResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetListadoNoticiaResponse")
    public ListaNoticias getListadoNoticia(
        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        String pass,
        @WebParam(name = "colector", targetNamespace = "http://webservicenoticia")
        String colector,
        @WebParam(name = "p", targetNamespace = "http://webservicenoticia")
        String p,
        @WebParam(name = "t", targetNamespace = "http://webservicenoticia")
        String t,
        @WebParam(name = "d", targetNamespace = "http://webservicenoticia")
        String d,
        @WebParam(name = "numPag", targetNamespace = "http://webservicenoticia")
        Integer numPag,
        @WebParam(name = "tamPag", targetNamespace = "http://webservicenoticia")
        Integer tamPag,
        @WebParam(name = "di", targetNamespace = "http://webservicenoticia")
        Integer di,
        @WebParam(name = "mi", targetNamespace = "http://webservicenoticia")
        Integer mi,
        @WebParam(name = "ai", targetNamespace = "http://webservicenoticia")
        Integer ai,
        @WebParam(name = "df", targetNamespace = "http://webservicenoticia")
        Integer df,
        @WebParam(name = "mf", targetNamespace = "http://webservicenoticia")
        Integer mf,
        @WebParam(name = "af", targetNamespace = "http://webservicenoticia")
        Integer af,
        @WebParam(name = "localeString", targetNamespace = "http://webservicenoticia")
        String localeString)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns java.lang.Boolean
     * @throws SQLException_Exception
     */
    @WebMethod(action = "urn:autenticar")
    @WebResult(targetNamespace = "http://webservicenoticia")
    @RequestWrapper(localName = "autenticar", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.Autenticar")
    @ResponseWrapper(localName = "autenticarResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.AutenticarResponse")
    public Boolean autenticar(
        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        String pass)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param pass
     * @param localeString
     * @param user
     * @param nova
     * @return
     *     returns webservicenoticia.xsd.Noticia
     * @throws SQLException_Exception
     */
    @WebMethod(action = "urn:getNovaEstandarDetalle")
    @WebResult(targetNamespace = "http://webservicenoticia")
    @RequestWrapper(localName = "getNovaEstandarDetalle", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetNovaEstandarDetalle")
    @ResponseWrapper(localName = "getNovaEstandarDetalleResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetNovaEstandarDetalleResponse")
    public Noticia getNovaEstandarDetalle(
        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        String pass,
        @WebParam(name = "nova", targetNamespace = "http://webservicenoticia")
        String nova,
        @WebParam(name = "localeString", targetNamespace = "http://webservicenoticia")
        String localeString)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param p
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:obtenerResource")
    @WebResult(targetNamespace = "http://webservicenoticia")
    @RequestWrapper(localName = "obtenerResource", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.ObtenerResource")
    @ResponseWrapper(localName = "obtenerResourceResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.ObtenerResourceResponse")
    public String obtenerResource(
        @WebParam(name = "p", targetNamespace = "http://webservicenoticia")
        String p);

    /**
     * 
     */
    @WebMethod(action = "urn:getListadoNoticias")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void getListadoNoticias();

}
