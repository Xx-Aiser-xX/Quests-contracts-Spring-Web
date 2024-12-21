package org.example.questcontracts.form.create;

import jakarta.validation.constraints.*;

public record OrganizerCreateQuestForm(
        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 30, message = "Длина строки должна составлять 2-30 символов")
        String photoUrl,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 0, message = "значение должно быть не менее 0")
        int ageRestriction,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 30, message = "Длина строки должна составлять 2-30 символов")
        String genre,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 200, message = "Длина строки должна составлять 2-200 символов")
        String name,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 30, message = "Длина строки должна иметь не менее 100 символов символов")
        String description,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 200, message = "Длина строки должна составлять 2-200 символов")
        String location,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 15, message = "значение должно быть не менее 15")
        @Max(value = 1440, message = "значение должно быть не более 1440")
        int duration,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "значение должно быть не менее 1")
        int maxParticipants,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "значение должно быть не менее 1")
        double price,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 0, message = "значение должно быть не менее 0")
        @Max(value = 10, message = "значение должно быть не более 10")
        int difficulty
) {
}