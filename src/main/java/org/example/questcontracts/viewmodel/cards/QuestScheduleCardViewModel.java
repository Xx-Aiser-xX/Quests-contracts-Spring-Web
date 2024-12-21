package org.example.questcontracts.viewmodel.cards;

import java.time.LocalDate;
import java.time.LocalTime;

public record QuestScheduleCardViewModel(
        int id,
        LocalDate date,
        LocalTime time,
        String status
) {
}
