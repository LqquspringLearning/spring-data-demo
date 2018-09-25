package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;


    // method one
    //@OneToMany(mappedBy = "user")
    //private List<Address> addressList;


    //method two
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Address> addressList;
}
