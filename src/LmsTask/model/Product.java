package LmsTask.model;

import LmsTask.enums.Category;
import LmsTask.enums.KeyCharacters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Product {
    private Long id;
    private Category category;
    private String name;
    private List<Map<KeyCharacters,String>> maps;
    private int price;

    public Product(){
        this.maps=new ArrayList<>();
    }
    public Product(Long id, Category category, String name, List<Map<KeyCharacters, String>> maps, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.maps = maps;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<KeyCharacters, String>> getMaps() {
        return maps;
    }

    public void setMaps(List<Map<KeyCharacters, String>> maps) {
        this.maps = maps;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", maps=" + maps +
                ", price=" + price +
                '}';
    }

}
