import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ainura";
        person.surname = "Nusubalieva";
        person.dateOfBirth = 2004;
        person.gender = 'F';
        Person person1 = new Person();
        person1.name = "Akylai";
        person1.surname = "Nusubalieva";
        person1.dateOfBirth = 2001;
        person1.gender = 'F';
        System.out.println(person.name);
        person1.getInfo();

        Person[] arrayPerson = new Person[2];
        arrayPerson[0] = person;
        arrayPerson[1] = person1;
        for (Person person3 : arrayPerson){
            System.out.println(person.name + "\n" + person.surname);
        }


        Car car = new Car();
        car.age = 2020;
        car.mark = "Lexus";
        car.price = 22500;
        System.out.println(car.getInfo());

        System.out.println("-------------");
        Car car1 = new Car();
        car1.price = 23000;
        car1.age = 2023;
        car1.mark = "Toyota";
        System.out.println(car1.getInfo());

        System.out.println("-------------");
        Car car2 = new Car();
        car2.price = 25000;
        car2.age = 2003;
        car2.mark = "Honda";
        System.out.println(car2.getInfo());


        Programmer[] programmers = new Programmer[]{
                new Programmer()
        };
        Scanner scanner = new Scanner(System.in);
        Programmer prog = new Programmer("Akyl", "Jakshylyjov", 12);
        System.out.println("Write the name: ");
        prog.name = scanner.nextLine();
        System.out.println("Write the surname: ");
//        prog.age = new Scanner(System.in).nextInt();//jany object tuzup scanner alsak bolot
        prog.surname = scanner.nextLine();
        System.out.println("Write the age: ");
        prog.age = scanner.nextInt();
        prog.showInfo();





    }
}