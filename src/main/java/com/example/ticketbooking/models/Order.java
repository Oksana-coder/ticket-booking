package com.example.ticketbooking.models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private Long id;

    private LocalDateTime createdDate;

    private float totalPrice;

//    @ManyToOne
//    private User user;
//
//    @OneToMany
//    private List<Reservation> reservations;
}
