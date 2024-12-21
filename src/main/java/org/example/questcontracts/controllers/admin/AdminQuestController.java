package org.example.questcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.create.CreateQuestForm;
import org.example.questcontracts.form.update.UpdateQuestForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/admin")
public interface AdminQuestController extends BaseController {

    @GetMapping("/quests")
    String pageAdminQuests(@ModelAttribute("form") PageSearchForm form,
                           Principal principal, Model model);

    @GetMapping("/create/quest")
    String pageAdminCreateQuest(Principal principal, Model model);

    @PostMapping("/create/quest")
    String adminCreateQuest(@Valid @ModelAttribute("form") CreateQuestForm questForm,
                       BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/quest/{id}")
    String pageAdminEditQuest(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/update/quest/{id}")
    String adminEditQuest(@PathVariable int id, @Valid @ModelAttribute("form") UpdateQuestForm form,
                BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/deleted/quest/{id}")
    String adminDeletedQuest(@PathVariable int id);
}
