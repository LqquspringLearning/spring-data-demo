package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String code;

    private String name;
}
