package factory.idcard;

import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList<String>();
    protected Product createProduct(String owner) {
        return IDCard(owner);
    }
    protected void registerProduct(Product p) {
        this.owners.add(((IDCard) p).getOwner());
    }
    public List getOwners() {
        return this.owners;
    }
}
