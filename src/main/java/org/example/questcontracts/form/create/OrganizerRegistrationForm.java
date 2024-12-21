package org.example.questcontracts.form.create;

import jakarta.validation.constraints.*;

public record OrganizerRegistrationForm(
        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 30, message = "длина строки должна быть 2-30 символов")
        String name,

        @NotBlank(message = "Неободимо заполнить поле")
        @Email(message = "Некорректный тип почты")
        String email,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 11, max = 11, message = "Формат номера: 89167890123")
        String phone,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 40, message = "длина строки должна составлять 2-40 символов")
        String city,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 20, message = "длина строки должна быть не менее 20 символов")
        String description,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 6, max = 40, message = "длина строки должна быть 6-40 символов")
        String password,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 6, max = 40, message = "длина строки должна быть 6-40 символов")
        String confirmPassword,

        @Size(min = 2, max = 200, message = "длина строки должна быть 2-200 символов")
        String photoUrl
) {
}
