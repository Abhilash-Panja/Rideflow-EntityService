package com.rideflow.rideflowentityservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;


@Entity
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

    private LocalTime startTime;

    private LocalTime endTime;

    private long totalDistance;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation startLocation;

    @OneToOne(cascade = CascadeType.ALL)
    private ExactLocation endLocation;

}
