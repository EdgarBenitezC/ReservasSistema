package com.restaurante.reservas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tables")
public class Tabla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int capacity;
// supongo que location es como la zona donde esta la mesa o algo asi, corrijanme si es mentira
    @Column(nullable = false, length = 100)
    private String location;
// Aqui creo que seria solo algo como ocupado, disponible o reservada
    @Column(nullable = false, length = 20)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}