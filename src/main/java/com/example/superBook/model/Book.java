package com.example.superBook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    private  int id;
    private String name;
    private String author;
    private double price;
    private int quantity;
}
