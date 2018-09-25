package com.thoughtworks.spring.learning.springwithaop.Domains;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "t_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String detail;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
