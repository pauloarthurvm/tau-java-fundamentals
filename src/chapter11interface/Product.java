package chapter11interface;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String gerBarCode() {
        return "no bar code";
    }

}
