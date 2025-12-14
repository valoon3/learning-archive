package learning.object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldTest {

    @Test
    void helloWorld() {
        String message = "Hello World";
        assertThat(message).isEqualTo("Hello World");
    }
}