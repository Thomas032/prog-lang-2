public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.Add(1, 2));
        System.out.println(adder.Add('1', '2'));
        System.out.println(adder.Add(1.5, 2.5));
        System.out.println(adder.Add("Hello", "World"));
    }
}
