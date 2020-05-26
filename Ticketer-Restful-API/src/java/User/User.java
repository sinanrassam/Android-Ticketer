/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author sinan
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public User() {

    }

    public User(String firstName, String lastName, String email, String username, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUsername(username);
        setPassword(password);
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getEmail() {
        return email;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private String getUsername() {
        return username;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getXMLString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<user>");
        buffer.append("<firstName>").append(getFirstName()).append("</firstName>");
        buffer.append("<lastName>").append(getLastName()).append("</lastName>");
        buffer.append("<email>").append(getEmail()).append("</email>");
        buffer.append("<username>").append(getUsername()).append("</username>");
        buffer.append("</user>");
        return buffer.toString();
    }
}
