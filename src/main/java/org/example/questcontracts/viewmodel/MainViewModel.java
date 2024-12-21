package org.example.questcontracts.viewmodel;

import org.example.questcontracts.viewmodel.cards.QuestCardViewModel;

import java.util.List;

public record MainViewModel(
        BaseViewModel base,
        List<QuestCardViewModel> quests,
        Integer totalPages
) {
}
