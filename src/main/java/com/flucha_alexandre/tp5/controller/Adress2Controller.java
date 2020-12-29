package com.flucha_alexandre.tp5.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Adress2 {
    @GetMapping("/adresse2")
    public string requestForm(Model model){
        return "adress2"
    }
}