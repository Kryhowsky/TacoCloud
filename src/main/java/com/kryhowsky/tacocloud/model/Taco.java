package com.kryhowsky.tacocloud.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;

////    @NotNull
//    @Size(min = 5, message = "Nazwa musi składać się z przynajmniej pięciu znaków.")
    private String name;

//    @Size(min = 1, message = "Musisz wybrać przynajmniej jeden składnik.")
    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt( ){
        this.createdAt = new Date();
    }
}
