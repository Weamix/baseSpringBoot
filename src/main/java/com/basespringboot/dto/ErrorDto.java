package com.basespringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ErrorDto {

    private final int status;
    private final String message;
    private final LocalDateTime timestamp;
}
