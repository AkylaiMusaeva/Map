package LmsTask.service.serviceImpl;

import LmsTask.enums.KeyCharacters;
import LmsTask.model.Characters;
import LmsTask.model.Product;
import LmsTask.service.Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    private Characters characters;
    private Product product;
    private KeyCharacters keyCharacters;
    List<Product>products=new ArrayList<>();
    public Service(){
        this.product=new Product();
        this.characters=new Characters();
    }
    public Service(Characters characters,Product product){
        this.characters=characters;
        this.product=new Product();
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public KeyCharacters getKeyCharacters() {
        return keyCharacters;
    }

    public void setKeyCharacters(KeyCharacters keyCharacters) {
        this.keyCharacters = keyCharacters;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public Product saveProduct(Product product,Enum e,String charr){
        this.product.setId(product.getId());
        this.product.setCategory(product.getCategory());
        this.product.setName(product.getName());
        this.product.setMaps(product.getMaps());
        this.product.setPrice(product.getPrice());
        characters.methodCh();
        Map<KeyCharacters,String> map=new HashMap<>();
        for (KeyCharacters a : characters.getCharacter().keySet()) {
            if (a.equals(e)) {
                for (String d : characters.getCharacter().get(a)) {
                    if (d.equals(charr)) {
                        map.put((KeyCharacters) e, d);
                        List<Map<KeyCharacters, String>> characterList = product.getMaps();
                        characterList.add(map);
                        product.setMaps(characterList);
                    }
                }
            }
        }
        return product;
    }
}
