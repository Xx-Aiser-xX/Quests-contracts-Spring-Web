package org.example.questcontracts.viewmodel.admin;

import org.example.questcontracts.form.get.GetBookingForm;
import org.example.questcontracts.viewmodel.BaseViewModel;

import java.util.List;

public record AdminPanelBookingViewModel(
        BaseViewModel base,
        List<GetBookingForm> bookings,
        Integer totalPages
) {
}
