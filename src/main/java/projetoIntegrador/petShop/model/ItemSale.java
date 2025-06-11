package projetoIntegrador.petShop.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSale {
    private int id;
    private Sales sale;
    private Products product;
    private int qty;
    private Double subtotal;
}
