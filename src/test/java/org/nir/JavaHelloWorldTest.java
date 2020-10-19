package org.nir;

import org.junit.jupiter.api.Test;
import org.nir.JavaHelloWorld;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        System.out.println(new JavaHelloWorld().getHello());

    }
}