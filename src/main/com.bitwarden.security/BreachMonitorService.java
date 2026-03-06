package com.bitwarden.security;

public class BreachMonitorService {

    // Этот метод должен был бы обращаться к внешним сервисам
    // и проверять, была ли почта пользователя в базах утечек.
    public boolean isEmailCompromised(String email) {
        return false;
    }

    // Этот метод должен был бы проверять,
    // найден ли пароль среди ранее скомпрометированных.
    public boolean isPasswordCompromised(String password) {
        return false;
    }
}