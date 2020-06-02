package ticketerrestfulservice;

import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class TicketBean {
    private List<Ticket> tickets;

    @PostConstruct
    public void  initialiseTickets() {

    }

    public void addTicket(String title, String description, String username) {
        tickets.add(new Ticket(title, description, username));
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }
}