package com.bitwarden.vault;

import java.util.List;

public class ImportExportService {

    // Этот метод должен был бы экспортировать данные пользователя
    // в безопасный файл, например JSON или CSV.
    public String exportToJson(List<VaultItem> items) {
        return "{ \"itemsCount\": " + items.size() + " }";
    }

    // Этот метод должен был бы импортировать данные из файла
    // и добавлять их в аккаунт пользователя.
    public int importFromJson(String json) {
        return 1;
    }
}