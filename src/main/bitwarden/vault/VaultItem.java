package com.bitwarden.vault;

public class VaultItem {

    private String title;
    private String login;
    private String password;
    private String url;

    public VaultItem(String title, String login, String password, String url) {
        this.title = title;
        this.login = login;
        this.password = password;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}