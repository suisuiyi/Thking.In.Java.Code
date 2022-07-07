package chapter01;

public class Shape implements Action {
    @Override
    public void draw() {
        System.out.println("shape draw");
    }

    @Override
    public void erase() {
        System.out.println("shape erase");
    }



}
