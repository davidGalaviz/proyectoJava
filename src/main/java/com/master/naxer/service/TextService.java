package com.master.naxer.service;

import com.master.naxer.repository.TextRepository;
import com.master.naxer.repository.Usuario;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service()
public class TextService {
    public final TextRepository textRepository;

    TextService(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    public String getText() {
        return "Hello World!";
    }

    public String getTextById(Long id) {
        int currentHour = Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));

        String saludo;

        if(currentHour < 12) {
            saludo = "Buenos días";
        } else if (currentHour < 19) {
            saludo = "Buenas tardes";
        }else {
            saludo = "Buenas noches";
        }

        Usuario usuario = this.textRepository.findById(id).orElseThrow();
        String nombreUsuario = usuario.getNombre();

        return saludo + ", " + nombreUsuario;
    }

    public String getGoodbyeText() throws Exception {
        throw new Exception("ERROR: Operación no permitida.");
    }
}
