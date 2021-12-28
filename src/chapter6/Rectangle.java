package chapter6;

public class Rectangle {

    private Double largeSide;
    private Double shortSide;

    public Rectangle(Double largeSide, Double shortSide) {
        this.largeSide = largeSide;
        this.shortSide = shortSide;
    }

    public Double area() {
        return (largeSide * shortSide);
    }

    public Double perimeter() {
        return (2 * largeSide) + (2 * shortSide);
    }

    public Double getLargeSide() {
        return largeSide;
    }

    public void setLargeSide(Double largeSide) {
        this.largeSide = largeSide;
    }

    public Double getShortSide() {
        return shortSide;
    }

    public void setShortSide(Double shortSide) {
        this.shortSide = shortSide;
    }
}
