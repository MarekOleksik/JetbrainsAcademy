abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double lengthSideA;
    double lengthSideB;
    double lengthSideC;

    public Triangle(double lengthSideA, double lengthSideB, double lengthSideC) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
        this.lengthSideC = lengthSideC;
    }

    @Override
    double getPerimeter() {
        return lengthSideA + lengthSideB + lengthSideC;
    }

    @Override
    double getArea() {
        return Math.sqrt((lengthSideA + lengthSideB + lengthSideC) * (lengthSideA + lengthSideB - lengthSideC) *
                (lengthSideA - lengthSideB + lengthSideC) * (lengthSideB - lengthSideA + lengthSideC)) / 4;
    }
}

class Rectangle extends Shape {

    double lengthSideA;
    double lengthSideB;

    public Rectangle(double lengthSideA, double lengthSideB) {
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
    }

    @Override
    double getPerimeter() {
        return 2 * lengthSideA + 2 * lengthSideB;
    }

    @Override
    double getArea() {
        return lengthSideA * lengthSideB;
    }
}

class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}