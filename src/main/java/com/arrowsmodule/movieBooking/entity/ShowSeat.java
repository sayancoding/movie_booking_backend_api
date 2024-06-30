package com.arrowsmodule.movieBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_show_seat")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long showSeatId;
    private String status;
    private long price;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "seat_id",referencedColumnName = "seatId")
    private Seat seat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "show_id",referencedColumnName = "showId")
    private Show show;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumns({
//            @JoinColumn(name="booking_id", referencedColumnName="bookingId"),
//            @JoinColumn(name="show_seat_id", referencedColumnName="showSeatId")
//    })
//    private Booking booking;
}
