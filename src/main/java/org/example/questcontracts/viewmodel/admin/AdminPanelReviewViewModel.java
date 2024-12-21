package org.example.questcontracts.viewmodel.admin;

import org.example.questcontracts.form.get.GetReviewForm;
import org.example.questcontracts.viewmodel.BaseViewModel;

import java.util.List;

public record AdminPanelReviewViewModel(
        BaseViewModel base,
        List<GetReviewForm> reviews,
        Integer totalPages
) {
}
