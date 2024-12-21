package org.example.questcontracts.controllers.base;

import org.example.questcontracts.viewmodel.BaseViewModel;

import java.security.Principal;

public interface BaseController {
    BaseViewModel createBaseViewModel(Principal principal, String title);
}
