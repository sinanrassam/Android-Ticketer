package ticketerrestfulservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class TicketBean {
    private List<Ticket> tickets;

    @PostConstruct
    public void  initialiseTickets() {
        tickets = new ArrayList<>();
        addTicket("Internet issue", "there is an internet problem", "username1");
        addTicket("Hardware issue", "My laptop seem's to be broken", "chris");
        addTicket("Cooling Issue", "is it hot in here?", "Bobby");
        addTicket("User Issue", "It's not working", "Jimz");
    }

    public void addTicket(String title, String description, String username) {
        tickets.add(new Ticket(title, description, username));
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }
}