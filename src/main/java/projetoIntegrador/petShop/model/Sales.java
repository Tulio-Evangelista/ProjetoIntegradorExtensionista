package projetoIntegrador.petShop.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sales {

    private int id;
    private Customers customer;
    private String sale_date;
    private Products products;
    private double total_sale;
    private String note;

};
