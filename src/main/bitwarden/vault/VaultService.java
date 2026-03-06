package com.bitwarden.vault;

import java.util.ArrayList;
import java.util.List;

public class VaultService {

    private final List<VaultItem> items = new ArrayList<>();

    // Этот метод должен был бы сохранять новый элемент
    // в личное или корпоративное хранилище пользователя.
    public void addItem(VaultItem item) {
        items.add(item);
    }

    // Этот метод должен был бы возвращать все записи пользователя из хранилища.
    public List<VaultItem> getAllItems() {
        return items;
    }
}