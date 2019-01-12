package com.okta.developer.jugtours.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@javax.persistence.Table(name = "Plan Zajęć")
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Data", nullable = true)
    private Instant date;

    @Column(name = "Tytuł", nullable = false)
    private String title;

    @Column(name = "Opis", nullable = false)
    private String description;
    @ManyToMany
    private Set<User> attendees;
}