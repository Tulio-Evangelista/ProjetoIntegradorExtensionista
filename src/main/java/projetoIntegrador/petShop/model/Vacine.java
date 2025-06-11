package projetoIntegrador.petShop.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vacine {
    private int id;
    private String vaccine_name;
    private String vaccine_application;
    private String vaccine_expiration;
    private String note;


    private Customers custumers;
    private Pets pets;
}
