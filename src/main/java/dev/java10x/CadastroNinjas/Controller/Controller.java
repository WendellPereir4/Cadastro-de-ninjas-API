package dev.java10x.CadastroNinjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controlador para API Rest
@RequestMapping // mapeamento de rotas.
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "essa é minha primeira mensagem";
    }
}
