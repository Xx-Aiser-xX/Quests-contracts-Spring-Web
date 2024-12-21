package org.example.questcontracts.viewmodel.cards;

import java.time.LocalDate;
import java.time.LocalTime;

public record UserBookingsCardViewModel(
        QuestCardViewModel questCardViewModel,
        int id,
        LocalDate date,
        LocalTime time,
        int participants
) {
}
