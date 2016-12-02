package com.budofa.store.controler.model;

public class LoginResponse {

    private final boolean successful;

    public LoginResponse(boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
