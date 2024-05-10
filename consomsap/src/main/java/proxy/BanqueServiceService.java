
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanqueServiceService", targetNamespace = "http://ws.example.org/", wsdlLocation = "http://localhost:8081/?wsdl")
public class BanqueServiceService
    extends Service
{

    private static final URL BANQUESERVICESERVICE_WSDL_LOCATION;
    private static final WebServiceException BANQUESERVICESERVICE_EXCEPTION;
    private static final QName BANQUESERVICESERVICE_QNAME = new QName("http://ws.example.org/", "BanqueServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUESERVICESERVICE_WSDL_LOCATION = url;
        BANQUESERVICESERVICE_EXCEPTION = e;
    }

    public BanqueServiceService() {
        super(__getWsdlLocation(), BANQUESERVICESERVICE_QNAME);
    }

    public BanqueServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUESERVICESERVICE_QNAME, features);
    }

    public BanqueServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANQUESERVICESERVICE_QNAME);
    }

    public BanqueServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUESERVICESERVICE_QNAME, features);
    }

    public BanqueServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueWS
     */
    @WebEndpoint(name = "BanqueWSPort")
    public BanqueWS getBanqueWSPort() {
        return super.getPort(new QName("http://ws.example.org/", "BanqueWSPort"), BanqueWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueWS
     */
    @WebEndpoint(name = "BanqueWSPort")
    public BanqueWS getBanqueWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.example.org/", "BanqueWSPort"), BanqueWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUESERVICESERVICE_EXCEPTION!= null) {
            throw BANQUESERVICESERVICE_EXCEPTION;
        }
        return BANQUESERVICESERVICE_WSDL_LOCATION;
    }

}
