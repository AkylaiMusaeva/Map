package LmsTask.service;

import LmsTask.model.Product;

public interface Interface {
    void saveProduct(Product product);

    void updateProduct();

    void getByIdProduct();

    void searchByProductName();

    void filterByCharacter();

    void sortByCharacter();

    void deleteByProduct();

    void getAllProduct();

    void deleteCharacterByKeyName();

    void deleteAllCharacters();
}
