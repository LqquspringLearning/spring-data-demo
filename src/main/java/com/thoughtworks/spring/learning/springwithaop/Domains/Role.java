package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "t_role_privilege",
    joinColumns = @JoinColumn(name = "role_code",referencedColumnName = "code"),
    inverseJoinColumns = @JoinColumn(name = "privilege_code",referencedColumnName = "code"))
    private List<Privilege> privileges;
}

