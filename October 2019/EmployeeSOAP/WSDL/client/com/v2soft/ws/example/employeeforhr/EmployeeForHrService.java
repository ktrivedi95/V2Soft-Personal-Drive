package com.v2soft.ws.example.employeeforhr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-09-04T16:38:12.855+05:30
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "EmployeeForHrService",
                  wsdlLocation = "file:/C:/Bari/Training/EmployeeSOAP/WSDL/employee_for_hr.wsdl",
                  targetNamespace = "http://localhost:8080")
public class EmployeeForHrService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://localhost:8080", "EmployeeForHrService");
    public final static QName EmployeeForHrPort = new QName("http://localhost:8080", "EmployeeForHrPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Bari/Training/EmployeeSOAP/WSDL/employee_for_hr.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EmployeeForHrService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Bari/Training/EmployeeSOAP/WSDL/employee_for_hr.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeeForHrService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeeForHrService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeForHrService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmployeeForHrService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmployeeForHrService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmployeeForHrService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EmployeeForHr
     */
    @WebEndpoint(name = "EmployeeForHrPort")
    public EmployeeForHr getEmployeeForHrPort() {
        return super.getPort(EmployeeForHrPort, EmployeeForHr.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeForHr
     */
    @WebEndpoint(name = "EmployeeForHrPort")
    public EmployeeForHr getEmployeeForHrPort(WebServiceFeature... features) {
        return super.getPort(EmployeeForHrPort, EmployeeForHr.class, features);
    }

}
