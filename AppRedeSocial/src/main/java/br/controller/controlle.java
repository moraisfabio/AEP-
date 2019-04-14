package br.controller.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlle {

    @GetMapping("/controller/pagina")
    public String controlle(){
        return "exemplo";
    }
}
