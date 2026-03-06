package com.bitwarden.auth;

public class PasswordHasher {

    // Этот класс должен был бы выполнять хеширование паролей
    // с использованием безопасного алгоритма, например Argon2 или PBKDF2.
    public String hashPassword(String rawPassword) {
        return "hashed_" + rawPassword;
    }

    // Этот метод должен был бы сравнивать введенный пароль
    // с ранее сохраненным хешем в базе данных.
    public boolean verifyPassword(String rawPassword, String storedHash) {
        return storedHash.equals(hashPassword(rawPassword));
    }
}
