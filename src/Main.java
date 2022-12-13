import java8.classes.Market;
import java8.classes.Person;
import java8.enums.Products;
import java8.services.impl.PersonServicesImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(System.in);
            Person person = new Person("KUTMAN", 1000);
            Market market1 = new Market("GLOBUS", 10000);
            Market market2 = new Market("FRUNZE", 20000);
            List<Market> markets = new ArrayList<>(List.of(market1, market2));
            List<Products> products1 = new ArrayList<>(List.of(Products.KURUT, Products.BANANA, Products.BREAD, Products.CHEESE, Products.MILK, Products.TEA));
            PersonServicesImpl personServices = new PersonServicesImpl();
            while (true) {
                System.out.println("PRESS 1 BUY A PRODUCT!!!");
                System.out.println("PRESS 2 ALL MY PRODUCTS!!!");
                System.out.println("PRESS 3 ALL PERSON DATA!!!");
                System.out.println("PRESS 4 ADD ALL MARKET!!!");
                System.out.println("PRESS 5 ADD ALL PRODUCTS!!!");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        String n = scanner.nextLine();
                        System.out.print("MARKET : ");
                        String market22 = scanner.nextLine();

                        while (true) {
                            try {


                                System.out.println("PRESS \"STOP\" STOPING LOOP!!");
                                System.out.print("NAME PRODUCTS : ");
                                String products = scanner.nextLine();
                                if (products.toUpperCase().equals("STOP")) {
                                    personServices.chek(person, markets, market22);
                                    break;
                                }
                                System.out.println(personServices.crateProducts(person, Products.valueOf(products.toUpperCase()), market22, markets));

                            } catch (IllegalArgumentException e) {
                                System.err.println("NET TAKOGO PRODUCTA!!!");
                                System.out.println("PRESS \"STOP\" STOPING LOOP!!");
                                System.out.print("NAME PRODUCTS : ");
                                String products = scanner.nextLine();
                                if (products.toUpperCase().equals("STOP")) {
                                    personServices.chek(person, markets, market22);
                                    break;
                                }
                                System.out.println(personServices.crateProducts(person, Products.valueOf(products.toUpperCase()), market22, markets));
                            }
                        }
                        break;
                    case 2:
                        System.out.println(personServices.getAllProducts());
                        break;
                    case 3:
                        System.out.println(person.toString());
                        break;
                    case 4:
                        System.out.println(markets);
                        break;
                    case 5:
                        System.out.println(products1);
                        break;
                    default:
                        System.err.println("ERROR");
                }

            }

        }catch (IllegalArgumentException e){
            System.err.println("NET TAKOGO PRODUCTA!!!");
        }catch (InputMismatchException e){
            System.err.println("TUURA JAZ!!!");
        }

    }
}