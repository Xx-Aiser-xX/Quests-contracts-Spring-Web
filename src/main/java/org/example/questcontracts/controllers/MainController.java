package org.example.questcontracts.controllers;

import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.QuestSearchForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@RequestMapping("/main")
public interface MainController extends BaseController {

    @GetMapping()
    String pageMain(@ModelAttribute("form") QuestSearchForm form,
                    @RequestParam(required = false, defaultValue = "no") String filter,
                    @RequestParam(required = false) String search,
                    Principal principal, Model model);

}
