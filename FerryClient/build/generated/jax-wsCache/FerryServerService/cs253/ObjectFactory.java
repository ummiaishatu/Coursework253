
package cs253;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cs253 package. 
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

    private final static QName _GetPortList_QNAME = new QName("http://cs253/", "getPortList");
    private final static QName _GetFerryListResponse_QNAME = new QName("http://cs253/", "getFerryListResponse");
    private final static QName _GetCompany_QNAME = new QName("http://cs253/", "getCompany");
    private final static QName _GetPort_QNAME = new QName("http://cs253/", "getPort");
    private final static QName _GetPortListResponse_QNAME = new QName("http://cs253/", "getPortListResponse");
    private final static QName _DeleteFerryRouteResponse_QNAME = new QName("http://cs253/", "deleteFerryRouteResponse");
    private final static QName _GetPortResponse_QNAME = new QName("http://cs253/", "getPortResponse");
    private final static QName _GetFerryList_QNAME = new QName("http://cs253/", "getFerryList");
    private final static QName _DeletePort_QNAME = new QName("http://cs253/", "deletePort");
    private final static QName _DeleteFerryRoute_QNAME = new QName("http://cs253/", "deleteFerryRoute");
    private final static QName _GetCompanyResponse_QNAME = new QName("http://cs253/", "getCompanyResponse");
    private final static QName _AddFerryRoute_QNAME = new QName("http://cs253/", "addFerryRoute");
    private final static QName _DeletePortResponse_QNAME = new QName("http://cs253/", "deletePortResponse");
    private final static QName _GetIDResponse_QNAME = new QName("http://cs253/", "getIDResponse");
    private final static QName _AddFerryRouteResponse_QNAME = new QName("http://cs253/", "addFerryRouteResponse");
    private final static QName _AddPort_QNAME = new QName("http://cs253/", "addPort");
    private final static QName _AddPortResponse_QNAME = new QName("http://cs253/", "addPortResponse");
    private final static QName _GetID_QNAME = new QName("http://cs253/", "getID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cs253
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteFerryRoute }
     * 
     */
    public DeleteFerryRoute createDeleteFerryRoute() {
        return new DeleteFerryRoute();
    }

    /**
     * Create an instance of {@link GetCompanyResponse }
     * 
     */
    public GetCompanyResponse createGetCompanyResponse() {
        return new GetCompanyResponse();
    }

    /**
     * Create an instance of {@link AddFerryRoute }
     * 
     */
    public AddFerryRoute createAddFerryRoute() {
        return new AddFerryRoute();
    }

    /**
     * Create an instance of {@link GetPortResponse }
     * 
     */
    public GetPortResponse createGetPortResponse() {
        return new GetPortResponse();
    }

    /**
     * Create an instance of {@link GetFerryList }
     * 
     */
    public GetFerryList createGetFerryList() {
        return new GetFerryList();
    }

    /**
     * Create an instance of {@link DeletePort }
     * 
     */
    public DeletePort createDeletePort() {
        return new DeletePort();
    }

    /**
     * Create an instance of {@link AddPort }
     * 
     */
    public AddPort createAddPort() {
        return new AddPort();
    }

    /**
     * Create an instance of {@link AddPortResponse }
     * 
     */
    public AddPortResponse createAddPortResponse() {
        return new AddPortResponse();
    }

    /**
     * Create an instance of {@link GetID }
     * 
     */
    public GetID createGetID() {
        return new GetID();
    }

    /**
     * Create an instance of {@link DeletePortResponse }
     * 
     */
    public DeletePortResponse createDeletePortResponse() {
        return new DeletePortResponse();
    }

    /**
     * Create an instance of {@link GetIDResponse }
     * 
     */
    public GetIDResponse createGetIDResponse() {
        return new GetIDResponse();
    }

    /**
     * Create an instance of {@link AddFerryRouteResponse }
     * 
     */
    public AddFerryRouteResponse createAddFerryRouteResponse() {
        return new AddFerryRouteResponse();
    }

    /**
     * Create an instance of {@link GetFerryListResponse }
     * 
     */
    public GetFerryListResponse createGetFerryListResponse() {
        return new GetFerryListResponse();
    }

    /**
     * Create an instance of {@link GetCompany }
     * 
     */
    public GetCompany createGetCompany() {
        return new GetCompany();
    }

    /**
     * Create an instance of {@link GetPort }
     * 
     */
    public GetPort createGetPort() {
        return new GetPort();
    }

    /**
     * Create an instance of {@link GetPortList }
     * 
     */
    public GetPortList createGetPortList() {
        return new GetPortList();
    }

    /**
     * Create an instance of {@link DeleteFerryRouteResponse }
     * 
     */
    public DeleteFerryRouteResponse createDeleteFerryRouteResponse() {
        return new DeleteFerryRouteResponse();
    }

    /**
     * Create an instance of {@link GetPortListResponse }
     * 
     */
    public GetPortListResponse createGetPortListResponse() {
        return new GetPortListResponse();
    }

    /**
     * Create an instance of {@link Ferries }
     * 
     */
    public Ferries createFerries() {
        return new Ferries();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getPortList")
    public JAXBElement<GetPortList> createGetPortList(GetPortList value) {
        return new JAXBElement<GetPortList>(_GetPortList_QNAME, GetPortList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getFerryListResponse")
    public JAXBElement<GetFerryListResponse> createGetFerryListResponse(GetFerryListResponse value) {
        return new JAXBElement<GetFerryListResponse>(_GetFerryListResponse_QNAME, GetFerryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getCompany")
    public JAXBElement<GetCompany> createGetCompany(GetCompany value) {
        return new JAXBElement<GetCompany>(_GetCompany_QNAME, GetCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getPort")
    public JAXBElement<GetPort> createGetPort(GetPort value) {
        return new JAXBElement<GetPort>(_GetPort_QNAME, GetPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getPortListResponse")
    public JAXBElement<GetPortListResponse> createGetPortListResponse(GetPortListResponse value) {
        return new JAXBElement<GetPortListResponse>(_GetPortListResponse_QNAME, GetPortListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFerryRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "deleteFerryRouteResponse")
    public JAXBElement<DeleteFerryRouteResponse> createDeleteFerryRouteResponse(DeleteFerryRouteResponse value) {
        return new JAXBElement<DeleteFerryRouteResponse>(_DeleteFerryRouteResponse_QNAME, DeleteFerryRouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getPortResponse")
    public JAXBElement<GetPortResponse> createGetPortResponse(GetPortResponse value) {
        return new JAXBElement<GetPortResponse>(_GetPortResponse_QNAME, GetPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getFerryList")
    public JAXBElement<GetFerryList> createGetFerryList(GetFerryList value) {
        return new JAXBElement<GetFerryList>(_GetFerryList_QNAME, GetFerryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "deletePort")
    public JAXBElement<DeletePort> createDeletePort(DeletePort value) {
        return new JAXBElement<DeletePort>(_DeletePort_QNAME, DeletePort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFerryRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "deleteFerryRoute")
    public JAXBElement<DeleteFerryRoute> createDeleteFerryRoute(DeleteFerryRoute value) {
        return new JAXBElement<DeleteFerryRoute>(_DeleteFerryRoute_QNAME, DeleteFerryRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getCompanyResponse")
    public JAXBElement<GetCompanyResponse> createGetCompanyResponse(GetCompanyResponse value) {
        return new JAXBElement<GetCompanyResponse>(_GetCompanyResponse_QNAME, GetCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerryRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "addFerryRoute")
    public JAXBElement<AddFerryRoute> createAddFerryRoute(AddFerryRoute value) {
        return new JAXBElement<AddFerryRoute>(_AddFerryRoute_QNAME, AddFerryRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "deletePortResponse")
    public JAXBElement<DeletePortResponse> createDeletePortResponse(DeletePortResponse value) {
        return new JAXBElement<DeletePortResponse>(_DeletePortResponse_QNAME, DeletePortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getIDResponse")
    public JAXBElement<GetIDResponse> createGetIDResponse(GetIDResponse value) {
        return new JAXBElement<GetIDResponse>(_GetIDResponse_QNAME, GetIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerryRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "addFerryRouteResponse")
    public JAXBElement<AddFerryRouteResponse> createAddFerryRouteResponse(AddFerryRouteResponse value) {
        return new JAXBElement<AddFerryRouteResponse>(_AddFerryRouteResponse_QNAME, AddFerryRouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "addPort")
    public JAXBElement<AddPort> createAddPort(AddPort value) {
        return new JAXBElement<AddPort>(_AddPort_QNAME, AddPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "addPortResponse")
    public JAXBElement<AddPortResponse> createAddPortResponse(AddPortResponse value) {
        return new JAXBElement<AddPortResponse>(_AddPortResponse_QNAME, AddPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs253/", name = "getID")
    public JAXBElement<GetID> createGetID(GetID value) {
        return new JAXBElement<GetID>(_GetID_QNAME, GetID.class, null, value);
    }

}
