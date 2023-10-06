package com.example.pr_18_gruznykh;

public class Product {
    public int name;
    public int price;
    public int image;
    public boolean box;

    Product(String _describe, int _price, int _image, boolean _box) {
        name = Integer.parseInt(_describe);
        price = _price;
        image = _image;
        box = _box;
    }
}
