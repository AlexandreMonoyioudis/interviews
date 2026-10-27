import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTest {
    @Test
    void greetReturnsHelloWorld() {
        Greeter greeter = new Greeter("Hello");
        assertEquals("Hello, World!", greeter.greet("World"));
    }

    @Test
    void greetReturnsHiWorld() {
        Greeter greeter = new Greeter("Hi");
        assertEquals("Hi, you!", greeter.greet("you"));
    }
}
