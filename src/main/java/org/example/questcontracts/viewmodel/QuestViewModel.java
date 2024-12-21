package org.example.questcontracts.viewmodel;

import org.example.questcontracts.viewmodel.cards.QuestScheduleCardViewModel;
import org.example.questcontracts.viewmodel.cards.ReviewCardViewModel;

import java.util.List;

public record QuestViewModel(
        BaseViewModel base,
        int id,
        String photoUrl,
        String name,
        double rating,
        int ageRestriction,
        int time,
        String genre,
        String organizerName,
        int organizerId,
        String description,
        List<QuestScheduleCardViewModel> questScheduleCardViewModel,
        List<ReviewCardViewModel> reviews,
        Integer bookingTotalPages,
        Integer reviewTotalPages
) {
}
