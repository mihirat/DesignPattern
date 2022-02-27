package idcard;

import framework.*;


public class IDCard extends Product {
    private String owner;
    private Integer id;

    IDCard(String owner, Integer id) {
        System.out.println("create ID for " + owner);
        this.owner = owner;
        this.id = id;
    }
    public void use() {
        System.out.println("use ID of " + owner + ", having ID num: " + id);
    }
    public String getOwner() {
        return owner;
    }

    public Integer getId() {
        return id;
    }
}