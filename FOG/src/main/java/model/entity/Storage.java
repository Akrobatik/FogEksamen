/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Anders
 */
public class Storage {
    private int id;
    private String description;
    private String type;
    private String name;
    private double price;

    public Storage(int id, String description, String type, String name, double price) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Storage{" + "id=" + id + ", description=" + description + ", type=" + type + ", name=" + name + ", price=" + price + '}';
    }

}
