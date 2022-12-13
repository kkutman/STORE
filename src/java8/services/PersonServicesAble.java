package java8.services;

import java8.classes.Market;
import java8.classes.Person;
import java8.enums.Products;

import java.util.List;

public interface PersonServicesAble {
    public String crateProducts(Person person, Products products1, String marketName, List<Market> markets);
    public void chek(Person person, List<Market> market,String name);
    public List<String> getAllProducts ();
}
