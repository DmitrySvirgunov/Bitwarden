package com.bitwarden.vault;

/**
 * Элемент пользовательского хранилища.
 * Содержит учетные данные и адрес ресурса.
 */
public class VaultItem {

    /** Название записи. */
    private String title;

    /** Логин или имя пользователя. */
    private String login;

    /** Пароль записи. */
    private String password;

    /** Адрес связанного сайта. */
    private String url;

    /**
     * Создает новый элемент хранилища.
     *
     * @param title название записи
     * @param login логин
     * @param password пароль
     * @param url адрес сайта
     */
    public VaultItem(String title, String login, String password, String url) {
        this.title = title;
        this.login = login;
        this.password = password;
        this.url = url;
    }

    /**
     * Возвращает название записи.
     *
     * @return название
     */
    public String getTitle() {
        return title;
    }

    /**
     * Возвращает логин записи.
     *
     * @return логин
     */
    public String getLogin() {
        return login;
    }

    /**
     * Возвращает пароль записи.
     *
     * @return пароль
     */
    public String getPassword() {
        return password;
    }

    /**
     * Возвращает адрес сайта.
     *
     * @return URL ресурса
     */
    public String getUrl() {
        return url;
    }
}