package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_privilege")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int key;
    @Column(unique = true)
    private String code;
    private String name;
}
