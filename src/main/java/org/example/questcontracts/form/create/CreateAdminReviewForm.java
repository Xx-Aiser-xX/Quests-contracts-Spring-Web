package org.example.questcontracts.form.create;

import jakarta.validation.constraints.*;

public record CreateAdminReviewForm(
        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 10, max = 2000, message = "Длина строки должна быть 10-2000 символов")
        String reviewText,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 0, message = "значение должно быть не менее 0")
        @Max(value = 5, message = "значение должно быть не более 5")
        int rating,

        @NotBlank(message = "Неободимо заполнить поле")
        @Size(min = 2, max = 40, message = "Длина строки должна быть 2-40 символов")
        String name,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "значение должно быть не менее 0")
        int bookingId
) {
}
