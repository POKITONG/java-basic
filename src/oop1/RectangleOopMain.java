package oop1;

public class RectangleOopMain {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 5;
        rectangle.width = 8;

        System.out.println("넓이: " + rectangle.calculateArea(5,8));
        System.out.println("둘레 길이: " + rectangle.calculatePerimeter(5, 8));
        System.out.println("정사각형 여부: " + rectangle.isSquare(5, 8));
    }
}