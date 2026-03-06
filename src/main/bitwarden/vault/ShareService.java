package com.bitwarden.vault;

public class ShareService {

    // Этот метод должен был бы формировать защищенную ссылку
    // для отправки данных с паролем, лимитом просмотров и сроком удаления.
    public String createSecureShareLink(String itemId) {
        return "https://share.local/item/" + itemId;
    }
}