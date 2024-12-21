package org.example.questcontracts.controllers;

import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@RequestMapping("/honorBoards")
public interface HonorBoardController extends BaseController {

    @GetMapping
    String pageHonorBoardUser(@ModelAttribute("form") PageSearchForm form,
                              Principal principal, Model model);
}
