public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        setName(name);
        setAge(age);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive number.");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}
