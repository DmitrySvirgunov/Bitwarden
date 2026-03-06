package com.bitwarden.auth;

public class AuthService {

    private final PasswordHasher passwordHasher = new PasswordHasher();

    // Этот метод должен был бы регистрировать пользователя:
    // валидировать email, проверять сложность пароля
    // и сохранять хеш пароля в базе данных.
    public String register(String email, String password) {
        String hash = passwordHasher.hashPassword(password);
        return "User registered: " + email + ", passwordHash=" + hash;
    }

    // Этот метод должен был бы выполнять вход пользователя,
    // проверяя корректность логина и пароля.
    public boolean login(String email, String password) {
        String fakeStoredHash = passwordHasher.hashPassword(password);
        return passwordHasher.verifyPassword(password, fakeStoredHash);
    }
}