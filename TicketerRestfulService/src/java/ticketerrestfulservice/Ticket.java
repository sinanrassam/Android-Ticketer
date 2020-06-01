package ticketerrestfulservice;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

public class Ticket {
    private String title;
    private String description;
    private User user;
    private LocalDateTime creationDate;

    public Ticket(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.creationDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return this.user.getUsername();
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getCreationDateString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String creationDateString = dtf.format(this.creationDate);
        return creationDateString;
    }

}