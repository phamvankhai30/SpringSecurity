package com.kapa.springsecurity.model.dto;

import com.kapa.springsecurity.enums.RoleEnum;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.kapa.springsecurity.model.entity.Role}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto implements Serializable {
    Long roleId;
    RoleEnum name;
}