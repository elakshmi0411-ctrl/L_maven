package com.example.mavennn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", Grade.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", Grade.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", Grade.calculateGrade(75));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", Grade.calculateGrade(60));
    }
}

