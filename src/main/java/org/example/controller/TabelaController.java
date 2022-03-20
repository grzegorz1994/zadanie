package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.repository.entity.Tabela;
import org.example.service.TabelaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TabelaController {

    private final TabelaService tabelaService;

    @GetMapping
    public String wiew(){
        return "gui";
    }

    @GetMapping("/display")
    public String getAllTables(Model model){
        List<Tabela> tabelaList = tabelaService.getAllTables();
        model.addAttribute("allTableTest", tabelaList);
        return "gui";
    }

    @GetMapping("/displayAll")
    public String findColumn(Model model){
        List<Tabela> tabelaList = tabelaService.findColumn();
        model.addAttribute("allTableTest", tabelaList);
        return "gui";
    }
}
