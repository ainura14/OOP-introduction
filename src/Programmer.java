public class Programmer {
    String name;
    String surname;
    int age;

    public Programmer(){};//default constructor

    public Programmer(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public int getBirthDate(){
        return 2024 - age;
    }
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + getBirthDate());
    }
}
