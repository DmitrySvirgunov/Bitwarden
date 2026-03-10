package com.bitwarden.vault;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис управления пользовательским хранилищем.
 */
public class VaultService {

    /** Список элементов хранилища. */
    private final List<VaultItem> items = new ArrayList<>();

    /**
     * Добавляет новый элемент в хранилище.
     *
     * @param item элемент для сохранения
     */
    public void addItem(VaultItem item) {
        items.add(item);
    }

    /**
     * Возвращает все элементы хранилища.
     *
     * @return список сохраненных элементов
     */
    public List<VaultItem> getAllItems() {
        return items;
    }
}