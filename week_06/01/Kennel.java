public class Kennel {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 2);
        Dog dog2 = new Dog("Fido", 3);
        Dog dog3 = new Dog("Buddy", 1);

        dog1.setAge(3); // updating dog's age
        dog2.setName("Max"); // updating dog's name
        dog3.setAge(2); // updating dog's age

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}