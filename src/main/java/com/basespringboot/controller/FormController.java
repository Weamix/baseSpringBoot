package com.basespringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.basespringboot.service.FormService;
import com.basespringboot.dto.FormRequest;
import com.basespringboot.dto.FormResponse;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequestMapping ("/forms")
@RestController 
@RequiredArgsConstructor 

public class FormController {
    private final FormService formService;

    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    public FormResponse createForm(@Valid @RequestBody FormRequest formRequest) {
        return formService.createForm(formRequest);
    }
}
