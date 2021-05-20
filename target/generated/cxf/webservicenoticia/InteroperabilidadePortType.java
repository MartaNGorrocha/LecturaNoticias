package webservicenoticia;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-19T13:26:31.143+02:00
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://webservicenoticia", name = "InteroperabilidadePortType")
@XmlSeeAlso({java.sql.xsd.ObjectFactory.class, ObjectFactory.class, webservicenoticia.xsd.ObjectFactory.class})
public interface InteroperabilidadePortType {

    @WebMethod(action = "urn:getListadoNoticia")
    @Action(input = "urn:getListadoNoticia", output = "urn:getListadoNoticiaResponse", fault = {@FaultAction(className = SQLException_Exception.class, value = "urn:getListadoNoticiaSQLException")})
    @RequestWrapper(localName = "getListadoNoticia", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetListadoNoticia")
    @ResponseWrapper(localName = "getListadoNoticiaResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetListadoNoticiaResponse")
    @WebResult(name = "return", targetNamespace = "http://webservicenoticia")
    public webservicenoticia.xsd.ListaNoticias getListadoNoticia(

        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        java.lang.String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        java.lang.String pass,
        @WebParam(name = "colector", targetNamespace = "http://webservicenoticia")
        java.lang.String colector,
        @WebParam(name = "p", targetNamespace = "http://webservicenoticia")
        java.lang.String p,
        @WebParam(name = "t", targetNamespace = "http://webservicenoticia")
        java.lang.String t,
        @WebParam(name = "d", targetNamespace = "http://webservicenoticia")
        java.lang.String d,
        @WebParam(name = "numPag", targetNamespace = "http://webservicenoticia")
        java.lang.Integer numPag,
        @WebParam(name = "tamPag", targetNamespace = "http://webservicenoticia")
        java.lang.Integer tamPag,
        @WebParam(name = "di", targetNamespace = "http://webservicenoticia")
        java.lang.Integer di,
        @WebParam(name = "mi", targetNamespace = "http://webservicenoticia")
        java.lang.Integer mi,
        @WebParam(name = "ai", targetNamespace = "http://webservicenoticia")
        java.lang.Integer ai,
        @WebParam(name = "df", targetNamespace = "http://webservicenoticia")
        java.lang.Integer df,
        @WebParam(name = "mf", targetNamespace = "http://webservicenoticia")
        java.lang.Integer mf,
        @WebParam(name = "af", targetNamespace = "http://webservicenoticia")
        java.lang.Integer af,
        @WebParam(name = "localeString", targetNamespace = "http://webservicenoticia")
        java.lang.String localeString
    ) throws SQLException_Exception;

    @WebMethod(action = "urn:autenticar")
    @Action(input = "urn:autenticar", output = "urn:autenticarResponse", fault = {@FaultAction(className = SQLException_Exception.class, value = "urn:autenticarSQLException")})
    @RequestWrapper(localName = "autenticar", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.Autenticar")
    @ResponseWrapper(localName = "autenticarResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.AutenticarResponse")
    @WebResult(name = "return", targetNamespace = "http://webservicenoticia")
    public java.lang.Boolean autenticar(

        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        java.lang.String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        java.lang.String pass
    ) throws SQLException_Exception;

    @WebMethod(action = "urn:getListadoNoticias")
    @Action(input = "urn:getListadoNoticias", output = "urn:getListadoNoticiasResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public void getListadoNoticias()
;

    @WebMethod(action = "urn:getNovaEstandarDetalle")
    @Action(input = "urn:getNovaEstandarDetalle", output = "urn:getNovaEstandarDetalleResponse", fault = {@FaultAction(className = SQLException_Exception.class, value = "urn:getNovaEstandarDetalleSQLException")})
    @RequestWrapper(localName = "getNovaEstandarDetalle", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetNovaEstandarDetalle")
    @ResponseWrapper(localName = "getNovaEstandarDetalleResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.GetNovaEstandarDetalleResponse")
    @WebResult(name = "return", targetNamespace = "http://webservicenoticia")
    public webservicenoticia.xsd.Noticia getNovaEstandarDetalle(

        @WebParam(name = "user", targetNamespace = "http://webservicenoticia")
        java.lang.String user,
        @WebParam(name = "pass", targetNamespace = "http://webservicenoticia")
        java.lang.String pass,
        @WebParam(name = "nova", targetNamespace = "http://webservicenoticia")
        java.lang.String nova,
        @WebParam(name = "localeString", targetNamespace = "http://webservicenoticia")
        java.lang.String localeString
    ) throws SQLException_Exception;

    @WebMethod(action = "urn:obtenerResource")
    @Action(input = "urn:obtenerResource", output = "urn:obtenerResourceResponse")
    @RequestWrapper(localName = "obtenerResource", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.ObtenerResource")
    @ResponseWrapper(localName = "obtenerResourceResponse", targetNamespace = "http://webservicenoticia", className = "webservicenoticia.ObtenerResourceResponse")
    @WebResult(name = "return", targetNamespace = "http://webservicenoticia")
    public java.lang.String obtenerResource(

        @WebParam(name = "p", targetNamespace = "http://webservicenoticia")
        java.lang.String p
    );
}