package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void mergeSort() {
        ArrayList<String> data
                = new ArrayList<>(List.of("Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"));
        ArrayList<String> sortedData
                = new ArrayList<>(List.of("Bashful", "Doc", "Dopey", "Grumpy", "Happy", "Sleepy", "Sneezy"));
        assertEquals(Main.mergeSort(data), sortedData);
    }
}