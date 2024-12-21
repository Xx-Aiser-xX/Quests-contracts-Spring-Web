package org.example.questcontracts.form.update;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record UpdateReviewForm(
        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "значение должно быть не менее 0")
        int id,

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
        LocalDate reviewDate,

        @NotNull(message = "Неободимо заполнить поле")
        @Min(value = 1, message = "значение должно быть не менее 0")
        int bookingId
) {
}
