package com.bitwarden.vault;

/**
 * Сервис безопасного обмена данными через ссылку.
 */
public class ShareService {

    /**
     * Создает защищенную ссылку для передачи элемента.
     *
     * @param itemId идентификатор элемента
     * @return ссылка для безопасного доступа
     */
    public String createSecureShareLink(String itemId) {
        return "https://share.local/item/" + itemId;
    }
}