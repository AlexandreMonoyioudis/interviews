public class Greeter {
     private String greeting;

    public static void main(String[] args) {
        Greeter greeter = new Greeter("Hello");
        System.out.println(greeter.greet("World"));
    }

    public Greeter(String Greeting) {
    greeting = Greeting;
  }

    public String greet(String name) {
        return greeting + ", " + name + "!";
    }
}
