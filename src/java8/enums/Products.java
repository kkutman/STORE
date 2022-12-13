package java8.enums;


public enum Products {
    KURUT(10),
    BREAD(25),
    TEA(100),
    MILK(120),
    CHEESE(200),
    BANANA(40);
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Products(int price) {
        this.price=price;

    }
}

