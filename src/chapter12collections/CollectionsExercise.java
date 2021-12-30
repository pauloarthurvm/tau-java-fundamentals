package chapter12collections;

import java.util.HashMap;
import java.util.Map;

import static chapter12collections.TestResults.getMakeUpGrades;
import static chapter12collections.TestResults.getOriginalGrades;

public class CollectionsExercise {

    /*
    The students were given a pop quiz and collectively they didn't do so great.
    As a result, the instructor decided to give them a makeup exam to allow them to improve their scores
     */
    public static void main(String[] args) {

        Map<String, Integer> newGrades = new HashMap<>();
        Map<String, Integer> oldGrades = getOriginalGrades();
        Map<String, Integer> makeupGrades = getMakeUpGrades();

        oldGrades.forEach(
                (k, v) -> {
                    if(v > makeupGrades.get(k)) {
                        newGrades.put(k, v);
                    } else {
                        newGrades.put(k, makeupGrades.get(k));
                    }
                }
        );
        System.out.println(newGrades);
    }
}
