package oop1;

public class Rectangle {
    int width = 0;
    int height = 0;

    int calculateArea (int width, int height) {
        int area = width * height;
        return area;
    }

    int calculatePerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        return perimeter;
    }

    boolean isSquare (int width, int height) {
        return width == height;
    }
}
