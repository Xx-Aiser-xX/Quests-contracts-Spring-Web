package org.example.questcontracts.form.get;

import java.time.LocalDate;
import java.time.LocalTime;

public record GetBookingForm(
        int id,
        int participants,
        LocalDate date,
        LocalTime time,
        String status,
        int questId,
        int userId
) {
}
