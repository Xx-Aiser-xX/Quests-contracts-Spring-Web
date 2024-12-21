package org.example.questcontracts.viewmodel;

import org.example.questcontracts.viewmodel.cards.UserBookingsCardViewModel;

import java.util.List;

public record UserViewModel(
        BaseViewModel base,
        int id,
        String photoUrl,
        String name,
        String email,
        String phone,
        List<UserBookingsCardViewModel> questCurrentBookingsCardViewModel,
        List<UserBookingsCardViewModel> questCompletedCardViewModel,
        Integer totalPages
) {
}
