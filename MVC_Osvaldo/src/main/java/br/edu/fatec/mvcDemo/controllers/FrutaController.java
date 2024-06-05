package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Frutas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/frutas")
public class FrutaController {
 private static final List<Frutas>
         fruta = new ArrayList<Frutas>();

    public FrutaController() {
        fruta.add(new Frutas("Banana","Amarelo",10.00f));
        fruta.add(new Frutas("Uva","Verde",13.00f));
        fruta.add(new Frutas("Morango","Vermelho",9.00f));
    }

    @GetMapping
    public String getFruta(Model model)
    {
        model.addAttribute("frutas", fruta);
        return "frutas";
    }
}
