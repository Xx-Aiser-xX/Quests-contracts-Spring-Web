package org.example.questcontracts.controllers;

import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.BookingSearchForm;
import org.example.questcontracts.form.ReviewSearchForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/quests")
public interface QuestController extends BaseController {

    @GetMapping("/{id}")
    String pageQuest(@ModelAttribute("bookingForm") BookingSearchForm bookingForm,
                     @ModelAttribute("reviewForm") ReviewSearchForm reviewForm,
                     @PathVariable int id, Principal principal, Model model);

    @PostMapping("/reserve")
    String userBookingQuest(Principal principal, @RequestParam int bookingId);
}
