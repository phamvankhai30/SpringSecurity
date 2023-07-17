package com.kapa.springsecurity.model.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.kapa.springsecurity.model.entity.User}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    String firstName;
    String lastName;
    String email;
    String password;
    Set<String> roles;
}