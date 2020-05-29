/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketerrestfulservice;

/**
 *
 * @author sinan
 */
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;

    public User() {

    }

    public User(String firstName, String lastName, String username, String email, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setUsername(username);
        setEmail(email);
        setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getXMLString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<user>");
        buffer.append("<firstName>").append(getFirstName()).append("</firstName>");
        buffer.append("<lastName>").append(getLastName()).append("</lastName>");
        buffer.append("<username>").append(getUsername()).append("</username>");
        buffer.append("<email>").append(getEmail()).append("</email>");
        buffer.append("<password>").append(getPassword()).append("</password>");
        buffer.append("</user>");
        return buffer.toString();
    }
}
