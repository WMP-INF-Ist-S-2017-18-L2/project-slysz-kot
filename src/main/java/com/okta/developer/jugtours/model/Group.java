package com.okta.developer.jugtours.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user_group")
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Imię", nullable = false)
    @NonNull
    private String name;

    @Column(name = "Adres", nullable = false)
    private String address;

    @Column(name = "Miasto", nullable = false)
    private String city;

    @Column(name = "Państwo", nullable = false)
    private String country;

    @Column(name = "Kod Pocztowy", nullable = false)
    private String postalCode;
    @ManyToOne(cascade=CascadeType.PERSIST)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Event> events;
}