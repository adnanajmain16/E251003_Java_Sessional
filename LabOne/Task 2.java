public class Adnan {
    String name;
    String id;
    int age;
    String email;
    String phone;
    String address;

    public static void main(String[] args) {

        Adnan s1 = new Adnan();
        s1.id = "E251003";
        s1.name = "Adnan Ajmain";
        s1.age = 21;
        s1.email = "adnanajmain9@gmail.com";
        s1.phone = "+8801317222978";
        s1.address = "Hathazari, Chittagong";

        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Age: " + s1.age);
        System.out.println("Email: " + s1.email);
        System.out.println("Phone: " + s1.phone);
        System.out.println("Address: " + s1.address);
    }
}
