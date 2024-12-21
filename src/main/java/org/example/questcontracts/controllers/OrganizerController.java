package org.example.questcontracts.controllers;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.QuestSearchForm;
import org.example.questcontracts.form.create.CreateBookingForm;
import org.example.questcontracts.form.create.OrganizerCreateQuestForm;
import org.example.questcontracts.form.create.OrganizerUpdateQuestForm;
import org.example.questcontracts.form.update.UpdateBookingForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/organizers")
public interface OrganizerController extends BaseController {

    @GetMapping("/{id}")
    String pageOrganizer(@PathVariable int id,
                         @ModelAttribute("form") QuestSearchForm form,
                         Principal principal, Model model);

    String pageOrganizerQuests(@ModelAttribute("form") PageSearchForm form,
                               Principal principal, Model model);

    String pageOrganizerCreateQuest(Principal principal, Model model);

    String organizerCreateQuest(@Valid @ModelAttribute("form") OrganizerCreateQuestForm form,
                       BindingResult bindingResult, Principal principal, Model model);

    String organizerEditQuest(@PathVariable int id, Principal principal, Model model);

    String organizerEditQuest(@PathVariable int id, @Valid @ModelAttribute("form") OrganizerUpdateQuestForm form,
                BindingResult bindingResult, Principal principal, Model model);

    String organizerDeletedQuest(@PathVariable int id);



    String pageOrganizerBookings(@ModelAttribute("form") PageSearchForm form,
                                 @RequestParam int questId,
                                 Principal principal, Model model);

    @GetMapping("/create/booking/{questId}")
    String pageOrganizerCreateBooking(Principal principal,
                                    @PathVariable int questId,
                                    Model model);

    @PostMapping("/create/booking/{questId}")
    String organizerCreateBooking(@Valid @ModelAttribute("form") CreateBookingForm bookingForm,
                         @PathVariable int questId,
                         BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/update/booking/{id}")
    String organizerEditBooking(@PathVariable int id,
                       @RequestParam int questId,
                       @Valid @ModelAttribute("form") UpdateBookingForm form,
                       BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/booking/{id}")
    String organizerEditBookingForm(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/deleted/booking/{id}")
    String organizerDeletedBooking(@PathVariable int id,
                                   @RequestParam int questId,
                                   Principal principal) ;
}
