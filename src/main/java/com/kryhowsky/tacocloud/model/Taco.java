package com.kryhowsky.tacocloud.model;


import lombok.Data;

import java.util.List;

@Data
public class Taco {

////    @NotNull
//    @Size(min = 5, message = "Nazwa musi składać się z przynajmniej pięciu znaków.")
    private String name;

//    @Size(min = 1, message = "Musisz wybrać przynajmniej jeden składnik.")
    private List<String> ingredients;
}