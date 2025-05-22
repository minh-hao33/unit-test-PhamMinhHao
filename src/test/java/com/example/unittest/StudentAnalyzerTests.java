package com.example.unittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentAnalyzerTests {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    // Test countExcellentStudents
    @Test
    public void testCountExcellentStudents_MixedValidInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllExcellent() {
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.5, 10.0)));
    }

    @Test
    public void testCountExcellentStudents_AllInvalid() {
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-2.0, 11.0, 15.0)));
    }

    // Test calculateValidAverage
    @Test
    public void testCalculateValidAverage_MixedValidInvalid() {
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(5.0, 10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        assertEquals(0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 12.0)));
    }


}
