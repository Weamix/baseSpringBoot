package com.basespringboot.service;
import com.basespringboot.entity.Form;

import org.springframework.stereotype.Service;

import com.basespringboot.dto.FormRequest;
import com.basespringboot.dto.FormResponse;
import com.basespringboot.repository.FormRepository;

@Service 
public class FormServiceImpl implements FormService {

    private final FormRepository formRepository;

    public FormServiceImpl(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public FormResponse createForm(FormRequest formRequest) {
        Form form = new Form();
        form.setTitle(formRequest.getTitle());
        Form savedForm = formRepository.save(form);
        return new FormResponse(savedForm.getId(), savedForm.getTitle());
    }
    
}
