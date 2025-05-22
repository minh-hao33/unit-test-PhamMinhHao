package com.example.unittest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication

public class StudentAnalyzer {
    /**
     * Đếm số học sinh đạt loại Giỏi (>= 8.0), bỏ qua điểm không hợp lệ.
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }
    /**
     * Tính trung bình các điểm hợp lệ (0 - 10).
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        double total = 0;
        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                total += score;
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }
}
