/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Book implements Serializable {
    private int id, amount;
    private String name, author, major, year;
    public static int currentId = 9999;
    
    public Book(int amount, String name, String author, String major, String year) {
        this.id = ++currentId;
        this.amount = amount;
        this.name = name;
        this.author = author;
        this.major = major;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Book.currentId = currentId;
    }
    public Object[] toObjects() {
        return new Object[] {id, name, author, major, year, amount};
    }
    
}
