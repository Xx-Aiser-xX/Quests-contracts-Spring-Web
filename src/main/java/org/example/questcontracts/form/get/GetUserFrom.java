package org.example.questcontracts.form.get;

public record GetUserFrom(
        int id,
        String name,
        String phone,
        int completedQuests,
        String photoUrl
) {
}
