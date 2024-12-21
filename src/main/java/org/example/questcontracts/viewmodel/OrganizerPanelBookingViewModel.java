package org.example.questcontracts.viewmodel;

import org.example.questcontracts.form.get.GetBookingForm;

import java.util.List;

public record OrganizerPanelBookingViewModel(
        BaseViewModel base,
        List<GetBookingForm> bookings,
        int questId,
        Integer totalPages
) {
}
