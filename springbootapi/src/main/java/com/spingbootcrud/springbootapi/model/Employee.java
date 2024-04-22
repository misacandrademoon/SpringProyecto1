package com.spingbootcrud.springbootapi.model;
import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "producto")
    private String producto;

    // Constructor, getters y setters
    // Constructor
    public Employee() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}

