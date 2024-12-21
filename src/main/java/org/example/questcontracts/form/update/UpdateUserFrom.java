package org.example.questcontracts.form.update;

import jakarta.validation.constraints.*;

public record UpdateUserFrom(
        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "Минимальное значение 1")
        int id,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 100, message = "длина строки должна быть 2-30 символов")
        String name,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 11, max = 11, message = "Формат номера: 89167890123")
        String phone,

        @Min(value = 0, message = "значение должно быть не менее 0")
        int completedQuests,

        @Size(min = 2, max = 200, message = "длина строки должна быть 2-200 символов")
        String photoUrl
) {
}
