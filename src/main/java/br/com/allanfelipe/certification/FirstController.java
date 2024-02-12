package br.com.allanfelipe.certification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiracontroller")
public class FirstController {
    @GetMapping("/retornarPrimeiraController")
    public Usuario returnFirstController() {
        var usuario = new Usuario("Allan", 20);
        return usuario;
    }

    record Usuario(String nome, int idade) {

    }
}
