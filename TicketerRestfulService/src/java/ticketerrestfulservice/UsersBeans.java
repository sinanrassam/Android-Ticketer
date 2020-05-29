/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketerrestfulservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author sinan
 */
@Singleton
public class UsersBeans {

    private List<User> users;

    @PostConstruct
    public void initialisePetCollection() {
        // convenience list to avoid using any database
        users = new ArrayList<>();
        addUser("Sinan", "Rassam", "sinan", "sinan@sinan.com", "sinan");
        addUser("Christian", "Te Maari", "temaari", "christian@christian.com", "christian");
        addUser("Bob", "Bobby", "bob", "bob@bobby.com", "bob");
        addUser("Mike", "Mikey", "mike", "mike@mikey.com", "mike");
    }

    public void addUser(String firstName, String lastName, String username, String email, String password) {
        users.add(new User(firstName, lastName, username, email, password));
    }

    public Collection<User> getUsers() {
        return users;
    }
}
