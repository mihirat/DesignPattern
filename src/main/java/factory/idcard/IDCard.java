package factory.idcard;

import framework.*;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("create ID for  " + owner);
        this.owner = owner;
    }
    public void use() {
        System.out.println("use ID of " + owner);
    }
    public String getOwner() {
        return owner;
    }
}