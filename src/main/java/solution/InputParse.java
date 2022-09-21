package solution;

import java.util.TreeSet;

public class InputParse {

    /**
     * Used to parse and clean the supplied input data which should be supplied as an array of inputs.
     * <p>
     * Parsing will move through each value in turn and check if it is an integer, if not it will be ignored.
     * <p>
     * Then checks if the value is between 1 and 100 inclusive, if it is not it will be ignored.
     * <p>
     * If it meets this criteria then it is added to the TreeSet, duplicates will be ignored by the Set,
     * and values will be placed in order in the tree. This will be returned in reverse order to the calling
     * class.
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
