package solution;

import java.util.TreeSet;

public class InputParse {

    /**
     * Parses the input data and checks all values are between 1 - 100 (inclusive)
     * Passes back a sorted and deduplicated treeset
     * <p>
     * If value is not an integer it is skipped
     * If a integer value is outside the range it is skipped
     */
    public static TreeSet<Integer> cleanInputData(String[] inputList) {
        TreeSet<Integer> workingTree = new TreeSet<>();
        for (String input : inputList) {
            try {
                int value = Integer.parseInt(input);
                if (value > 0 && value <= 100) {
                    workingTree.add(value);
                }
            } catch (NumberFormatException e) {
            }
        }

        return (TreeSet<Integer>) workingTree.descendingSet();
    }
}
