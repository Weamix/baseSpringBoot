package com.basespringboot.service;
import com.basespringboot.dto.FormRequest;
import com.basespringboot.dto.FormResponse;

public interface FormService {
    FormResponse createForm(FormRequest formRequest);
    
}
