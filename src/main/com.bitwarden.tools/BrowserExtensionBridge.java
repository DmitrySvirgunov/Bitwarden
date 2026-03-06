package com.bitwarden.tools;

public class BrowserExtensionBridge {

    // Этот метод должен был бы принимать запрос
    // от браузерного расширения на автозаполнение формы.
    public String requestAutofill(String siteUrl) {
        return "Autofill data for: " + siteUrl;
    }

    // Этот метод должен был бы быстро сохранять
    // новую учетную запись из браузера в хранилище.
    public String saveFromBrowser(String siteUrl, String login) {
        return "Saved credentials for " + siteUrl + " with login " + login;
    }
}