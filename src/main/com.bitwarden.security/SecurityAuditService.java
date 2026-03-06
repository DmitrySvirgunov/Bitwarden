package com.bitwarden.security;

public class SecurityAuditService {

    // Этот метод должен был бы проверять,
    // является ли пароль слишком простым.
    public boolean isWeakPassword(String password) {
        return password.length() < 8;
    }

    // Этот метод должен был бы сравнивать новый пароль
    // с уже использованными ранее паролями пользователя.
    public boolean isReusedPassword(String newPassword, String oldPassword) {
        return newPassword.equals(oldPassword);
    }

    // Этот метод должен был бы анализировать,
    // использует ли сайт HTTPS.
    public boolean isSiteSecure(String url) {
        return url != null && url.startsWith("https://");
    }

    // Этот метод должен был бы проверять,
    // активна ли двухфакторная аутентификация на внешнем ресурсе.
    public boolean hasTwoFactorAuth(String siteName) {
        return false;
    }
}