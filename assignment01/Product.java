package assignment01;

import java.util.ArrayList;

public class Product {
    private int productCode;
    private String name;
    private double price;
    private String category;

    //Using parametrized constructor....
    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Using getter and setter..
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //creating arrayList.....
    public static ArrayList<Product> getProductsList() {
        // Creating user defined Product Array List
        ArrayList<Product> prods = new ArrayList<>();
        Product p1 = new Product(101, "Iphone 11", 49000.00, "Mobile");
        Product p2 = new Product(102, "Oneplus nord2", 28000.00, "Mobile");
        Product p3 = new Product(103, "Oppo F15", 17000.00, "Mobile");
        Product m1 = new Product(201, "Macbook Air", 79000.00, "laptop");
        Product m2 = new Product(202, "lenova", 60999.00, "laptop");
        Product m3 = new Product(203, "MSI-GT65", 59000.00, "laptop");
        Product e1 = new Product(301, "ucb T-shirt", 1500.00, "clothes");
        Product e2 = new Product(302, "LEE jeans", 5600.00, "clothes");
        Product e3 = new Product(303, "Sparky Shirt", 3000.00, "clothes");

        // Adding products to the list
        prods.add(p1);
        prods.add(p2);
        prods.add(p3);
        prods.add(m1);
        prods.add(m2);
        prods.add(m3);
        prods.add(e1);
        prods.add(e2);
        prods.add(e3);
        return prods;
    }

    public static void main(String[] args) {

        //Initilized new object..
        ProductService productService = new ProductService();
        String prodName = productService.findNameByCode(513);
        System.out.println(prodName);

        Product product_obj = productService.findMaxPriceProduct("laptop");
        System.out.println(product_obj);

        ArrayList<Product> products = productService.getProductsByCategory("clothes");
        if (products != null) {
            for (Product product : products) {
                System.out.println(
                "[ product code: " + product.getProductCode() + 
                ", product name: " + product.getName() + 
                ", product price: Rs." + product.getPrice() + 
                ", product category: " + product.getCategory() + " ]"
                );
            }
        }
    }    

}
