package projetoIntegrador.petShop.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Workers extends Customers{

    private String password;
    private String responsibility;
    private String access_level;


}

