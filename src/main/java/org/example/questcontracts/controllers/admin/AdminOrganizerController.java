package org.example.questcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.create.OrganizerRegistrationForm;
import org.example.questcontracts.form.update.UpdateOrganizerForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/admin")
public interface AdminOrganizerController extends BaseController {

    @GetMapping("/organizers")
    String pageAdminOrganizers(@ModelAttribute("form") PageSearchForm form,
                               Principal principal, Model model);

    @GetMapping("/create/organizer")
    String pageAdminCreateOrganizer(Principal principal, Model model);

    @PostMapping("/create/organizer")
    String adminCreateOrganizer(@Valid @ModelAttribute("form") OrganizerRegistrationForm form,
                           BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/organizer/{id}")
    String pageAdminEditOrganizer(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/update/organizer/{id}")
    String adminEditOrganizer(@PathVariable int id, @Valid @ModelAttribute("form") UpdateOrganizerForm form,
                BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/deleted/organizer/{id}")
    String adminDeletedOrganizer(@PathVariable int id);
}
