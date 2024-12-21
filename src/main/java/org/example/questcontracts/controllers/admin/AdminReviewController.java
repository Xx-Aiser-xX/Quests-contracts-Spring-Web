package org.example.questcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.create.CreateAdminReviewForm;
import org.example.questcontracts.form.update.UpdateReviewForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/admin")
public interface AdminReviewController extends BaseController {

    @GetMapping("/reviews")
    String pageAdminReviews(@ModelAttribute("form") PageSearchForm form,
                            Principal principal, Model model);

    @GetMapping("/create/review")
    String pageAdminCreateReview(Principal principal, Model model);

    @PostMapping("/create/review")
    String adminCreateReview(@Valid @ModelAttribute("form") CreateAdminReviewForm reviewForm,
                           BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/review/{id}")
    String pageAdminEditReview(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/update/review/{id}")
    String adminEditReview(@PathVariable int id, @Valid @ModelAttribute("form") UpdateReviewForm form,
                BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/deleted/review/{id}")
    String adminDeletedReview(@PathVariable int id);
}
