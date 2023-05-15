package com.example.ticketbooking.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "duration", nullable = false)
    private String duration;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "active", nullable = false)
    private boolean isActive;
}
