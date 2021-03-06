
package gr.codehub.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyServiceImplService", targetNamespace = "http://model.codehub.gr/", wsdlLocation = "http://localhost:8080/currencyservice?wsdl")
public class CurrencyServiceImplService
    extends Service
{

    private final static URL CURRENCYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CURRENCYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CURRENCYSERVICEIMPLSERVICE_QNAME = new QName("http://model.codehub.gr/", "CurrencyServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/currencyservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CURRENCYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CurrencyServiceImplService() {
        super(__getWsdlLocation(), CURRENCYSERVICEIMPLSERVICE_QNAME);
    }

    public CurrencyServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CurrencyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYSERVICEIMPLSERVICE_QNAME);
    }

    public CurrencyServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CurrencyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyService
     */
    @WebEndpoint(name = "CurrencyServiceImplPort")
    public CurrencyService getCurrencyServiceImplPort() {
        return super.getPort(new QName("http://model.codehub.gr/", "CurrencyServiceImplPort"), CurrencyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyService
     */
    @WebEndpoint(name = "CurrencyServiceImplPort")
    public CurrencyService getCurrencyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://model.codehub.gr/", "CurrencyServiceImplPort"), CurrencyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CURRENCYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CURRENCYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
