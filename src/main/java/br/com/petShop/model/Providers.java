package br.com.petShop.model;

public class Providers extends Customers {

    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString(){
        return this.getName();
    }


}
