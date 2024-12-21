package org.example.questcontracts.form;

import jakarta.validation.constraints.Min;

public record PageSearchForm(
        @Min(value = 0, message = "Страница должна быть больше 0")
        Integer page
) {
}
