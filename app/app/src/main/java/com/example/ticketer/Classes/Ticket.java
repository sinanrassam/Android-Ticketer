package com.example.ticketer.Classes;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Ticket {
    private String title;
    private String description;
    private String username;
    private LocalDateTime creationDate;

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

    public String getUsername() {
        return this.username;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getCreationDateString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String creationDateString = dtf.format(this.creationDate);
        return creationDateString;
    }
}
