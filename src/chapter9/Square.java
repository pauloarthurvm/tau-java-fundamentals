package chapter9;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter() {
        return (sides * length);
    }

//    Overloading
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
