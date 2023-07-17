package com.kapa.springsecurity.model.entity;

import com.kapa.springsecurity.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private Long roleId;
    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private RoleEnum name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

}
