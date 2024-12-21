package org.example.questcontracts.controllers;

import jakarta.validation.Valid;
import org.example.questcontracts.form.create.OrganizerRegistrationForm;
import org.example.questcontracts.form.create.UserRegistrationForm;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface AuthController  {

    @GetMapping("/register")
    String register(@ModelAttribute("form") UserRegistrationForm form, Model model);

    @PostMapping("/register")
    String doRegister(@Valid @ModelAttribute("form") UserRegistrationForm form,
                             BindingResult bindingResult,
                             Model model);

    @GetMapping("/register/organizer")
    String registerOrganizer(@ModelAttribute("form") UserRegistrationForm form, Model model);

    @PostMapping("/register/organizer")
    String doRegisterOrganizer(@Valid @ModelAttribute("form") OrganizerRegistrationForm form,
                                      BindingResult bindingResult, Model model);

    @GetMapping("/login")
    String login();

    @PostMapping("/login-error")
    String onFailedLogin(
            @ModelAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY) String username,
            RedirectAttributes redirectAttributes);
}
