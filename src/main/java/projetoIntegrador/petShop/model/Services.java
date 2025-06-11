package projetoIntegrador.petShop.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Services {
    private int id;
    private String service_name;
    private String service_description;
    private double price_large;
    private double price_medium;
    private double price_small;
}
