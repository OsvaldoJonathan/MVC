package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Frutas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/frutas")
public class DadosController {
    private static final List<Frutas>
            fruta = new ArrayList<Frutas>();

    public DadosController() {
        fruta.add(new Frutas("Banana","Amarelo",10.00f));
        fruta.add(new Frutas("Uva","Verde",13.00f));
        fruta.add(new Frutas("Morango","Vermelho",9.00f));
    }

    @GetMapping
    public List<Frutas> getFruta()
    {
        return fruta;
    }
}
