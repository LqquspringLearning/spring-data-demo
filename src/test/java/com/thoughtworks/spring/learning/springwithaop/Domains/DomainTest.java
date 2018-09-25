package com.thoughtworks.spring.learning.springwithaop.Domains;

import lombok.var;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class DomainTest {

    @Test
    void should_create_a_user() {
        User user = new User();
        assertThat(user.getId()).isZero();
    }

    @Test
    void should_create_a_role() {
        Role role = new Role();
        assertThat(role.getId()).isZero();
    }

    @Test
    void should_create_a_privilege() {
        Privilege privilege = new Privilege();
        assertThat(privilege.getKey()).isZero();
    }

    @Test
    void should_cretate_a_role_privilege() {
        RolePrivilege rolePrivilege = new RolePrivilege();
        assertThat(rolePrivilege.getId()).isZero();
    }

    @Test
    void should_create_a_address() {
        Address addr = new Address();
        assertThat(addr.getId()).isZero();
    }
}
