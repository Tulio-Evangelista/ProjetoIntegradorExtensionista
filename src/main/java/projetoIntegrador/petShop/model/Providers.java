package projetoIntegrador.petShop.model;

import projetoIntegrador.petShop.model.Customers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Providers extends Customers {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString(){
        return this.getName();
    }
}
