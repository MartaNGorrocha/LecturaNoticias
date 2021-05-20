
package java.sql.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java.sql.xsd package. 
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

    private final static QName _SQLExceptionNextException_QNAME = new QName("http://sql.java/xsd", "nextException");
    private final static QName _SQLExceptionSQLState_QNAME = new QName("http://sql.java/xsd", "sQLState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java.sql.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://sql.java/xsd", name = "nextException", scope = SQLException.class)
    public JAXBElement<SQLException> createSQLExceptionNextException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLExceptionNextException_QNAME, SQLException.class, SQLException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://sql.java/xsd", name = "sQLState", scope = SQLException.class)
    public JAXBElement<String> createSQLExceptionSQLState(String value) {
        return new JAXBElement<String>(_SQLExceptionSQLState_QNAME, String.class, SQLException.class, value);
    }

}
