package org.example.questcontracts.viewmodel;

import org.example.questcontracts.viewmodel.cards.HonorBoardCountCardViewModel;

import java.util.List;

public record HonorBoardViewModel(
        BaseViewModel base,
        List<HonorBoardCountCardViewModel> honorBoardCountCardViewModel
) {
}
