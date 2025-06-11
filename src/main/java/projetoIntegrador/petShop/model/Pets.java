package projetoIntegrador.petShop.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pets {
    private int id;
    private String pet_name;
    private String gender;
    private String birth;
    private double pet_weight;
    private String species;
    private String breed;

    private Customers custumers;
}
