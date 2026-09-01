//  MODULE
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter marks : ");
        int x = in.nextInt();
        if(x >=90){

            System.out.println("Grade A");
    }
    else if(x >= 80){
        System.out.println("Grade B");

    }
    else if(x >= 70 ){
        System.out.println("Grade C");
    }

else if(x >= 60){
        System.out.println("Grade D");
    }
        else{
System.out.println("Fail");
        }

}
}
//......................................................

 class Main2 {
   
    public static void main(String[] args) {
        for(int i =1;i <= 10;i++){
            System.out.println(i);
        }
    }
}
//......................................................
class Main3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //new is the object of scanner class
    System.out.print("enter num 1 :");
    int num1 = in.nextInt();
    System.out.print("enter num 2 :");
    int num2 = in.nextInt();
    int sum = num1 + num2 ;
    System.out.println("the sum : " + sum);
}
}
//...................................................
 
class Main4{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter your name :");
    String name = in.nextLine();
}
}
//.....................................................

// Define the Car class
class Car {
    // Properties (Instance Variables)
    String colour;
    String brandName;

    // Constructor to initialize properties
    public Car(String brandName, String colour) {
        this.brandName = brandName;
        this.colour = colour;
    }

    // Method: accelerate
    public void accelerate() {
        System.out.println("The " + colour + " " + brandName + " is accelerating.");
    }

    // Method: drive
    public void drive() {
        System.out.println("Driving the " + brandName + ".");
    }
}
// Main class to run the program and access properties via a real object
 class Main5 {
    public static void main(String[] args) {
        // Create a real object (instance) of the Car class
        Car myCar = new Car("Tesla", "Red");

        // Access properties using the real object
        System.out.println("Car Brand: " + myCar.brandName);
        System.out.println("Car Colour: " + myCar.colour);

        // Access methods using the real object
        myCar.accelerate();
        myCar.drive();
    }
}
//.....................................................
class Calculator {
    

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division by zero is not possible.");
        }
    }
}

 class Main6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(20, 10);
        calc.sub(20, 10);
        calc.mul(20, 10);
        calc.div(20, 10);
    }
}
//.....................................................
class Main7 {//parameterized constructor
    int x;
    int y;

    // Parameterized constructor
    Main7(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Main7 obj1 = new Main7(10, 20);
        Main7 obj2 = new Main7(30, 40);

        obj1.display();
        obj2.display();
    }

}
class Main8 {// non parameterized constructor
    int x;
    int y;

    // Non-parameterized constructor
    Main8() {
        x = 5;
        y = 10;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Main8 obj1 = new Main8();
        Main8 obj2 = new Main8();

        obj1.display();
        obj2.display();
    }
}
class Studet {
    
    String name;
    int age;

    // Constructor to initialize properties
    Studet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    //main method to create student objects and display their details
    public static void main(String[] args) {
        Studet student1 = new Studet("Alice", 20);
        Studet student2 = new Studet("Bob", 22);

        student1.display();
        student2.display();
    }
}
class Student1 {
    //program to display all types of constructors
    String name;
    int age;    

    // Non-parameterized constructor
    Student1() {        
        name = "Default Name";
        age = 18;
    }   

    // Parameterized constructor
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create student objects using different constructors
        Student1 student1 = new Student1(); // Non-parameterized constructor
        Student1 student2 = new Student1("Charlie", 21); // Parameterized constructor

        // Display student details
        student1.display();
        student2.display();
    }
}
//.....................................................
class Student2 {
    //program to implement all types of methods
    String name;
    int age;

    
}

class Person {
    String name;
    int age;
}

class Student extends Person {
    int roll_number;
}

class Result extends Student {
    int math_marks;
    int phy_marks;
    int chem_marks;

    public static void main(String[] args) {
        Result Sam = new Result();

        Sam.name = "Sam";
        Sam.age = 19;
        Sam.roll_number = 8;
        Sam.math_marks = 90;
        Sam.phy_marks = 85;
        Sam.chem_marks = 88;

        System.out.println("Name: " + Sam.name);
        System.out.println("Age: " + Sam.age);
        System.out.println("Roll Number: " + Sam.roll_number);
        System.out.println("Math Marks: " + Sam.math_marks);
        System.out.println("Physics Marks: " + Sam.phy_marks);
        System.out.println("Chemistry Marks: " + Sam.chem_marks);
    }
}

//.....................................................

//Hierarchial Inheritance Example
class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: pi * r^2");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle: length * width");
    }
}
class Hierinheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.area(); // Calls Circle's area method
        rectangle.area(); // Calls Rectangle's area method
        
    }
}

//.....................................................
































