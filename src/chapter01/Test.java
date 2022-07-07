package chapter01;

public class Test {
    public static void main(String[] args) {
        /**
         * 说明：
         * 当子类的实例传入父类的形参时，可以自动识别出子类要具体执行的方法。
         *
         * 这个特性被称为多态
         *
         * 前提条件：子类也实现了父类的接口
         *
         *
         * */
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        doSomething(shape);
        doSomething(circle);
        doSomething(triangle);
    }

    public static void doSomething(Shape shape) {
        System.out.println("-------------");
        shape.draw();
        shape.erase();
    }
}
