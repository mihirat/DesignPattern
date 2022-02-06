package factory;

import factory.framework.*;
import factory.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product c1 = f.createProduct("michel");
        Product c2 = f.createProduct("timos");
        Product c3 = f.createProduct("wargner");
        c1.use();
        c2.use();
        c3.use();
    }
}