package com.paulgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String name;

    @Column(name = "categoria", length = 10, nullable = false)
    private String category;

}
