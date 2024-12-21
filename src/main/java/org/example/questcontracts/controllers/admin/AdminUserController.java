package org.example.questcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.create.UserRegistrationForm;
import org.example.questcontracts.form.update.UpdateUserFrom;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/admin")
public interface AdminUserController extends BaseController {

    @GetMapping("/users")
    String pageAdminUsers(@ModelAttribute("form") PageSearchForm form,
                          Principal principal, Model model);

    @GetMapping("/create/user")
    String pageAdminCreateUser(Principal principal, Model model);

    @PostMapping("/create/user")
    String adminCreateUser(@Valid @ModelAttribute("form") UserRegistrationForm userForm,
                      BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/user/{id}")
    String pageAdminEditUser(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/update/user/{id}")
    String adminEditUser(@PathVariable int id, @Valid @ModelAttribute("form") UpdateUserFrom form,
                BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/deleted/user/{id}")
    String adminDeletedQuest(@PathVariable int id);
}
