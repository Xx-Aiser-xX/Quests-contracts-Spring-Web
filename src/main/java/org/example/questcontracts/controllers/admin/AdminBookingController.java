package org.example.questcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.example.questcontracts.controllers.base.BaseController;
import org.example.questcontracts.form.PageSearchForm;
import org.example.questcontracts.form.create.CreateBookingForm;
import org.example.questcontracts.form.update.UpdateBookingForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/admin")
public interface AdminBookingController extends BaseController {

    @GetMapping("/bookings")
    String pageAdminBookings(@ModelAttribute("form") PageSearchForm form,
                             Principal principal, Model model);

    @GetMapping("/create/booking")
    String pageAdminCreateBooking(Principal principal, Model model);

    @PostMapping("/create/booking")
    String adminCreateBooking(@Valid @ModelAttribute("form") CreateBookingForm bookingForm,
                         BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/update/booking/{id}")
    String pageAdminEditBooking(@PathVariable int id, Principal principal, Model model);

    @PostMapping("/update/booking/{id}")
    String adminEditBooking(@PathVariable int id, @Valid @ModelAttribute("form") UpdateBookingForm form,
                BindingResult bindingResult, Principal principal, Model model);

    @PostMapping("/deleted/booking/{id}")
    String adminDeletedBooking(@PathVariable int id);
}
