package idcard;

import framework.*;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap<Integer, String>();
    private Integer idBase = 0;
    private List owners = new ArrayList<SimpleEntry<String, Integer>>();

    public Product createProduct(String owner) {
        return new IDCard(owner, idBase++);
    }
    public void registerProduct(Product p) {
        IDCard card = (IDCard) p;
        this.owners.add(new SimpleEntry<String, Integer>(card.getOwner(), card.getId()));
        this.database.put(new Integer(card.getId()), card.getOwner());
    }
    public List getOwners() {
        return this.owners;
    }
    public HashMap getDatabase(){
        return database;
    }
}
