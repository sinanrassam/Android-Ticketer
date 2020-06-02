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

    public void addTicket(String title, String description, User user) {
        tickets.add(new Ticket(title, description, user));
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }
}