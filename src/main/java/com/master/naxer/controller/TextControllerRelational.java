package com.master.naxer.controller;

import com.master.naxer.entity.relational.Text_T;
import com.master.naxer.service.TextServiceRelational;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/relational")
public class TextControllerRelational {
    private final TextServiceRelational textService;

    public TextControllerRelational(TextServiceRelational textService){
        this.textService = textService;
    }

    @GetMapping("/printString/{id}")
    public String printString(@PathVariable final Long id) {
        return this.textService.getString(id);
    }

    // Microactividad 6
    @GetMapping("/getText/{id}")
    public Optional<Text_T> getText(@PathVariable final Long id){
        return this.textService.getText(id);
    }
}
