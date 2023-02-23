package org.example;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> mergeSort(ArrayList<String> data) {
        String item;
        if (data.size() <= 1) {
            return data;
        }
        else {
            ArrayList<String> first = new ArrayList<>();
            ArrayList<String> second = new ArrayList<>();
            double midpoint = data.size() / 2.0;
            for (int i = 0; i < data.size(); i++) {
                item = data.get(i);
                if (i < midpoint) {
                    first.add(item);
                }
                else{
                    second.add(item);
                }
            }

            ArrayList<String> sorted_first = mergeSort(first);
            ArrayList<String> sorted_second = mergeSort(second);

            ArrayList<String> sorted = new ArrayList<>();
            while (true) {
                if (sorted_first.size() > 0) {
                    if (sorted_second.size() > 0) {
                        if (sorted_first.get(0).compareTo(sorted_second.get(0)) <= 0) {
                            item = sorted_first.remove(0);
                        }
                        else {
                            item = sorted_second.remove(0);
                        }
                    }
                    else {
                        item = sorted_first.remove(0);
                    }
                }
                else {
                    if (sorted_second.size() > 0) {
                        item = sorted_second.remove(0);
                    } else {
                        break;
                    }
                }
                sorted.add(item);
            }
            return sorted;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>(List.of("Dopey", "Doc", "Sleepy", "Happy", "Bashful", "Sneezy", "Grumpy"));
        System.out.println(mergeSort(data));
    }
}