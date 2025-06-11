package projetoIntegrador.petShop.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
    private int id;
    private String product;
    private double price;
    private int stock_qty;

    //private Suppliers suppliers;
}
