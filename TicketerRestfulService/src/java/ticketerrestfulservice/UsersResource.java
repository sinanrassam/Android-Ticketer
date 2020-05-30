/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketerrestfulservice;

import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author sinan
 */
@Named // so that dependency injection can be used for the EJB
@Path("/users")
public class UsersResource {

    @EJB
    private UsersBean usersBean;
    @Context
    private UriInfo context;
    private static final char QUOTE = '\"';

    public UsersResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getAllUsers() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buffer.append("<users uri=").append(QUOTE).append(
                context.getAbsolutePath()).append(QUOTE).append(">");
        Collection<User> allUsers = usersBean.getUsers();
        for (User user : allUsers) {
            buffer.append(user.getXMLString());
        }
        buffer.append("</users>");
        return buffer.toString();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addNewUser(MultivaluedMap<String, String> formParams) {
        String firstName = formParams.getFirst("firstName");
        String lastName = formParams.getFirst("lastName");
        String email = formParams.getFirst("email");
        String username = formParams.getFirst("username");
        String password = formParams.getFirst("password");
        usersBean.addUser(firstName, lastName, email, username, password);
    }
}
