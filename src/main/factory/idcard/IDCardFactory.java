package idcard;

import framework.*;
import java.util.List;
import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList<String>();
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }
    public void registerProduct(Product p) {
        this.owners.add(((IDCard) p).getOwner());
    }
    public List getOwners() {
        return this.owners;
    }
}
