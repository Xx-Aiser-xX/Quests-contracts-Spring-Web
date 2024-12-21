package org.example.questcontracts.viewmodel.cards;

public record QuestCardViewModel(
        String photoUrl,
        String name,
        double rating,
        String location,
        int maxParticipants,
        double price,
        int questId
) {
}
