import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        int s = 0;
        for (int i : L) s += i;
        return s;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> filtered = new ArrayList<>();
        for (int i: L){
            if (i % 2 == 0) filtered.add(i);
        }
        return filtered;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> com = new ArrayList<>();
        for ( int i: L1){
            if (L2.contains(i)){
                com.add(i);
            }
        }
        return com;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for ( String word : words){
            for (char ch : word.toCharArray()){
                if (ch == c) count++;
            }
        }
        return count;
    }
}
