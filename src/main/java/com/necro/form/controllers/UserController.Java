package com.necro.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/adduser")
    public String getMethodName(@RequestBody Usuario usuario, Model model) {
        service.saveUsuario(usuario);
        model.addAttribute("message", "Usuario " + usuario.getUsername + " Agregado con exito");
        return "redirect:/showPopup";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/showPopup")
    public String showPopup(Model model) {
        return "addUserPopUp";
    }

}
