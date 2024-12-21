package org.example.questcontracts.form.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateBookingForm(
        @Min(value = 1, message = "Количество участников: 1")
        int participants,

        @NotNull(message = "Неободимо заполнить дату")
        String date,

        @NotNull(message = "Неободимо заполнить время")
        String time,

        @NotBlank(message = "Строка не может быть пустой")
        @Size(min = 2, max = 15, message = "Длина строки должна составлять 2-15 символов")
        String status,

        @NotNull(message = "Строка не может быть пустой")
        @Min(value = 1, message="Минимальное значение 1")
        int questId,

        int userId
) {
}
