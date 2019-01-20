package com.okta.developer.jugtours.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Builder
@Entity
@Table(name = "Wydażenia")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "data")
    private Instant date;
    @Column(name = "Tytuł")
    private String title;
    @Column(name = "opis")
    private String description;
    @ManyToMany
    private Set<User> attendees;

    public Event(Long id, Instant date, String title, String description, Set<User> attendees) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.description = description;
        this.attendees = attendees;
    }

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
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

    public Set<User> getAttendees() {
        return attendees;
    }

    public void setAttendees(Set<User> attendees) {
        this.attendees = attendees;
    }
}