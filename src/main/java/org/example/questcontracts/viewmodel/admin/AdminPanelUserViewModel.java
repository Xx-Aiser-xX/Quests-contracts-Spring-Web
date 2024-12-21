package org.example.questcontracts.viewmodel.admin;

import org.example.questcontracts.form.get.GetUserFrom;
import org.example.questcontracts.viewmodel.BaseViewModel;

import java.util.List;

public record AdminPanelUserViewModel(
        BaseViewModel base,
        List<GetUserFrom> users,
        Integer totalPages
) {
}
