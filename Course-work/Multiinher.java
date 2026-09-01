class Person1 {
    String name;
    int age;
}

class Student2 extends Person1 {
    int roll_number;
}

class Multiinher extends Student2 {
    int math_marks;
    int phy_marks;
    int chem_marks;

    public static void main(String[] args) {
        Multiinher Sam = new Multiinher();

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