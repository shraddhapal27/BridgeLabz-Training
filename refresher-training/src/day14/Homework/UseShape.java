package day14.Homework;

class Shape {
    int area(){
        return 0;
    }
}

class Circle extends Shape{
    int area(int radius){
        return 22/7 * radius * radius;
    }
}

class Rectangle extends Shape{
    int area(int length, int width){
        return length*width;
    }
}

class Triangle extends Shape{
    int area(int base, int height){
        return 1/2 * base * height;
    }
}

