package org.example.questcontracts.viewmodel.admin;

import org.example.questcontracts.form.get.GetQuestForm;
import org.example.questcontracts.viewmodel.BaseViewModel;

import java.util.List;

public record AdminPanelQuestViewModel(
        BaseViewModel base,
        List<GetQuestForm> quests,
        Integer totalPages
) {
}
