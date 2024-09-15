package com.Role.Based.Authentication.Role.Based.Authentication.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @Column(name = "user_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String password;
        private boolean enabled;

        @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id")
        )
        private Set<Role> roles = new HashSet<>();

        public Long getId() {
            return id;
        }

        // remaining getters and setters are not shown for brevity
    }
