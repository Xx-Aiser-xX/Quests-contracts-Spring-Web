package org.example.questcontracts.form.get;

public record GetQuestForm(
        int id,
        String photoUrl,
        int ageRestriction,
        String genre,
        int organizerId,
        String name,
        String description,
        String location,
        int duration,
        int maxParticipants,
        double price,
        int difficulty,
        double rating
) {
}
