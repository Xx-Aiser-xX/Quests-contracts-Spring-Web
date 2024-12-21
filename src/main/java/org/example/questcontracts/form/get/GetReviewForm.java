package org.example.questcontracts.form.get;

import java.time.LocalDate;

public record GetReviewForm(
        int id,
        int questId,
        String reviewText,
        int rating,
        String name,
        LocalDate reviewDate,
        int bookingId
) {
}
