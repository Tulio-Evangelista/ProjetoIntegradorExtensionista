package projetoIntegrador.petShop.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToDo {
    private int id;
    private String date;
    private String time;
    private String status;
    private double total_Value;

    private Services services;
    private Customers custumers;
    private Pets pets;
}
