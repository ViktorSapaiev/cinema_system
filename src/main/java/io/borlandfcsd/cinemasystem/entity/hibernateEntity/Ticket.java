package io.borlandfcsd.cinemasystem.entity.hibernateEntity;


import io.borlandfcsd.cinemasystem.entity.PlaceStatus;
import io.borlandfcsd.cinemasystem.entity.hibernateEntity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tickets")
@Data
public class Ticket implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    @JoinColumn(name = "user_email", referencedColumnName = "email", nullable = false)
    private User email;
    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private MovieSession movieSession;
    @Column(nullable = false)
    private int row;
    @Column(nullable = false)
    private int place;
    @Column(nullable = false)
    private PlaceStatus placeStatus;
    @Column
    private double price;

}
