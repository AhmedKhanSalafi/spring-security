package com.Role.Based.Authentication.Role.Based.Authentication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
    @Table(name = "roles")
    public class Role {
        @Id
        @Column(name = "role_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String name;
        public Integer getId() {
            return id;
        }

        // remaining getters and setters

}
