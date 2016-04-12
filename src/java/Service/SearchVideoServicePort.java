/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author JoanMarc
 */
@Path("searchvideoserviceport")
public class SearchVideoServicePort {

    private Service_client.SearchVideoService port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SearchVideoServicePort
     */
    public SearchVideoServicePort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method searchVideoWithCreationYear
     * @param year resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Service_client.SearchVideoWithCreationYearResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("searchvideowithcreationyear/")
    public JAXBElement<Service_client.SearchVideoWithCreationYearResponse> getSearchVideoWithCreationYear(@QueryParam("year")
            @DefaultValue("0") int year) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<Service_client.Video> result = port.searchVideoWithCreationYear(year);

                class SearchVideoWithCreationYearResponse_1 extends Service_client.SearchVideoWithCreationYearResponse {

                    SearchVideoWithCreationYearResponse_1(java.util.List<Service_client.Video> _return) {
                        this._return = _return;
                    }
                }
                Service_client.SearchVideoWithCreationYearResponse response = new SearchVideoWithCreationYearResponse_1(result);
                return new Service_client.ObjectFactory().createSearchVideoWithCreationYearResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method searchWithVideoTitle
     * @param title resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Service_client.SearchWithVideoTitleResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("searchwithvideotitle/")
    public JAXBElement<Service_client.SearchWithVideoTitleResponse> getSearchWithVideoTitle(@QueryParam("title") String title) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<Service_client.Video> result = port.searchWithVideoTitle(title);

                class SearchWithVideoTitleResponse_1 extends Service_client.SearchWithVideoTitleResponse {

                    SearchWithVideoTitleResponse_1(java.util.List<Service_client.Video> _return) {
                        this._return = _return;
                    }
                }
                Service_client.SearchWithVideoTitleResponse response = new SearchWithVideoTitleResponse_1(result);
                return new Service_client.ObjectFactory().createSearchWithVideoTitleResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method searchVideoWithAuthor
     * @param author resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Service_client.SearchVideoWithAuthorResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("searchvideowithauthor/")
    public JAXBElement<Service_client.SearchVideoWithAuthorResponse> getSearchVideoWithAuthor(@QueryParam("author") String author) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<Service_client.Video> result = port.searchVideoWithAuthor(author);

                class SearchVideoWithAuthorResponse_1 extends Service_client.SearchVideoWithAuthorResponse {

                    SearchVideoWithAuthorResponse_1(java.util.List<Service_client.Video> _return) {
                        this._return = _return;
                    }
                }
                Service_client.SearchVideoWithAuthorResponse response = new SearchVideoWithAuthorResponse_1(result);
                return new Service_client.ObjectFactory().createSearchVideoWithAuthorResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private Service_client.SearchVideoService getPort() {
        try {
            // Call Web Service Operation
            Service_client.SearchVideoService_Service service = new Service_client.SearchVideoService_Service();
            Service_client.SearchVideoService p = service.getSearchVideoServicePort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
