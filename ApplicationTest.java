
package com.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void testAddition() {
        Application app = new Application();

        assertEquals(10, app.add(5, 5));
    }
}
