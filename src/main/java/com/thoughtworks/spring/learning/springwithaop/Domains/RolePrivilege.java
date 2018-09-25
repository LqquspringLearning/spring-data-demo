package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_role_privilege")
public class RolePrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String roleCode;
    private String privilegeCode;
}
