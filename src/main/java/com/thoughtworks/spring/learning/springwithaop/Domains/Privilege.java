package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    @ManyToMany
    @JoinTable(name = "t_role_privilege",
            joinColumns = @JoinColumn(name = "privilege_code", referencedColumnName = "code"),
            inverseJoinColumns = @JoinColumn(name = "role_code", referencedColumnName = "code"))
    private List<Role> roles;
}
