package com.master.naxer.controller;

import com.master.naxer.service.TextService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    private final TextService textService;

    public TextController(TextService textService){
        this.textService = textService;
    }

    public void printText() throws Exception {
        String text = this.textService.getText();

        System.out.println(text);
        try{
            String goodbyeText = this.textService.getGoodbyeText();
            System.out.println(goodbyeText);
        }catch (Exception e) {
            System.out.println("No goodbye text available.");
        }

    }

    @GetMapping("/printString")
    String printString() {
        return this.textService.getText();
    }

    // Microactividad 6
    @GetMapping("/getString/{id}")
    String getString(@PathVariable Long id){
        return this.textService.getTextById(id);
    }
}
