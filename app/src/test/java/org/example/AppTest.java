package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void zipSameSize() {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(10, 20, 30);

        assertEquals(List.of(1, 10, 2, 20, 3, 30), App.zip(a, b));
    }

    @Test
    void zipFirstLonger() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(10, 20);

        assertEquals(List.of(1, 10, 2, 20, 3, 4), App.zip(a, b));
    }

    @Test
    void zipSecondLonger() {
        List<Integer> a = List.of(1, 2);
        List<Integer> b = List.of(10, 20, 30, 40);

        assertEquals(List.of(1, 10, 2, 20, 30, 40), App.zip(a, b));
    }

    @Test
    void zipOneEmpty() {
        List<Integer> a = List.of();
        List<Integer> b = List.of(10, 20);

        assertEquals(List.of(10, 20), App.zip(a, b));
    }

    @Test
    void zipBothEmpty() {
        assertEquals(List.of(), App.zip(List.of(), List.of()));
    }

    @Test
    void zipStrings() {
        List<String> a = List.of("A", "B");
        List<String> b = List.of("X", "Y", "Z");

        assertEquals(List.of("A", "X", "B", "Y", "Z"), App.zip(a, b));
    }
}
