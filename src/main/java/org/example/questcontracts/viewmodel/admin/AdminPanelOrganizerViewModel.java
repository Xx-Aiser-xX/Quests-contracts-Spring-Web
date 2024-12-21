package org.example.questcontracts.viewmodel.admin;

import org.example.questcontracts.form.get.GetOrganizerForm;
import org.example.questcontracts.viewmodel.BaseViewModel;

import java.util.List;

public record AdminPanelOrganizerViewModel(
        BaseViewModel base,
        List<GetOrganizerForm> organizers,
        Integer totalPages
) {
}
