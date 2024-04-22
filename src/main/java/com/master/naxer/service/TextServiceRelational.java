package com.master.naxer.service;

import com.master.naxer.entity.relational.Text_T;
import com.master.naxer.repository.relational.TextRepositoryRelational;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class TextServiceRelational {
    public final TextRepositoryRelational textRepository;

    TextServiceRelational(TextRepositoryRelational textRepository) {
        this.textRepository = textRepository;
    }

    public String getString(final Long id) {
        final Optional<Text_T> text_t = this.textRepository.findById(id);
        return text_t.isPresent() ? text_t.get().getTextValue() : "Text not found!";
    }

    public Optional<Text_T> getText(final Long id) {
        return this.textRepository.findById(id);
    }

    public String getGoodbyeText() throws Exception {
        throw new Exception("ERROR: Operación no permitida.");
    }
}
