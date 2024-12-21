package org.example.questcontracts.form.get;


public record GetOrganizerForm(
        int id,
        String name,
        String phone,
        String city,
        String description,
        double rating,
        String photoUrl
) {
}
