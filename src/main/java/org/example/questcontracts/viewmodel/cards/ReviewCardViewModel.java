package org.example.questcontracts.viewmodel.cards;

import java.time.LocalDate;

public record ReviewCardViewModel(
        LocalDate reviewDate,
        String reviewText,
        int rating,
        String name
) {
}
