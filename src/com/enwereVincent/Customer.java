package com.enwereVincent;

import java.util.Arrays;

import static com.enwereVincent.Main.input;

public class Customer {
    private int id;
    private String Name;
    private String Address;
    private  Product[] product;

    public Customer(int id, String name , String address){
        this.id = id;
        this.Name = name;
        this.Address = address;

    }
    public Customer(int id, String name , String address, Product[] addProduct){
        this.id = id;
        this.Name = name;
        this.Address = address;
        this.product = addProduct;
    }

    public void buyProduct(){
        input.nextLine();
        for (int i = 0; i < product.length; i++){
            System.out.print("Enter Product " + "No." + (i + 1) + " ");
            String prod =  input.nextLine();
            product[i] = new Product(prod);
        }
        System.out.println(Arrays.toString(product));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public Product[] getProduct() {
        return product;
    }
}
