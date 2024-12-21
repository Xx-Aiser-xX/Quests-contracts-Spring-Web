package org.example.questcontracts.viewmodel;

import org.example.questcontracts.viewmodel.cards.QuestCardViewModel;

import java.util.List;

public record OrganizerViewModel(
        BaseViewModel base,
        int id,
        String photoUrl,
        String name,
        double rating,
        String description,
        String phone,
        List<QuestCardViewModel> questCardViewModel,
        Integer totalPages
) {
}
