package org.example.questcontracts.controllers;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.UserSearchForm;
import org.example.questcontracts.form.create.CreateReviewForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@RequestMapping("/users")
public interface UserController extends BaseController {

    @GetMapping("/{id}")
    String pageUser(@ModelAttribute("userForm") UserSearchForm userForm,
                    Principal principal, Model model);

    String userCreateReview(@Valid @ModelAttribute CreateReviewForm reviewForm,
                      @RequestParam int bookingId,
                      RedirectAttributes redirectAttributes);

}
