package org.example.questcontracts.form.update;

import jakarta.validation.constraints.*;

public record UpdateOrganizerForm(
        @Min(value = 1, message = "Минимальное значение 1")
        @NotNull(message = "Неободимо заполнить поле")
        int id,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 100, message = "Имя должно составлять 2-100 символов")
        String name,

        @NotBlank
        @Size(min = 11, max = 11, message = "Формат номера: 89167890123")
        String phone,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 40, message = "длина строки должна составлять 2-40 символов")
        String city,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 20, message = "длина строки должна быть не менее 20 символов")
        String description,

        @Min(value = 0, message = "значение должно быть не менее 0")
        @Max(value = 5, message = "значение должно быть не более 5")
        double rating,

        @Size(max = 150, message = "длина строки должна быть не более 150 символов")
        String photoUrl
) {
}
