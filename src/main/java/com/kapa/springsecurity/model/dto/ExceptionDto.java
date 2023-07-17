package com.kapa.springsecurity.model.dto;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Component
public class ExceptionDto {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
