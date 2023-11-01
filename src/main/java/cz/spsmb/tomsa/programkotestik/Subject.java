package cz.spsmb.tomsa.programkotestik;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject {
    private String name;

    public static List<Integer> random(Integer pocetZnamek) {
        pocetZnamek = 5;
        int randomNumber;
        Random random = new Random();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < pocetZnamek; i++) {
            randomNumber = random.nextInt(5) + 1;
            marks.add(randomNumber);
        }
        return marks;
    }

    public static double diameter(List<Integer> numbers) {
        double number = 0;
        for (int i = 0; i < numbers.size(); i++) {
            number = number + numbers.get(i);
        }
        return number / numbers.size();
    }

}
