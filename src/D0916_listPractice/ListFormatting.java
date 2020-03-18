package D0916_listPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 *
 * Re-visited and edited by Adam Yao on 2020.3.18
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     *
     * HINT: Use a for-each loop, and create a variable outside the loop to keep
     *       track of which item number you’re on. (Think: why does the variable
     *       have to be declared and initialized _outside_ the loop? What
     *       happens if you move it inside?)
     */
    public static List<String> numberEachItem(List<String> items) {
        int x = 1;
        List<String> modifiedItem = new ArrayList<String>();

        for(String item : items) {
            modifiedItem.add(x + ". " + item);
            x++;
        }
        return modifiedItem;
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     *
     * HINT: You can declare a String variable outside the loop, much like you
     *       declared an into outside the loop in the previous example.
     *       Initialize it to an empty string, repeatedly add to it inside the
     *       loop, then return it when you're done.
     */
    public static String formatWithCommas(List<String> items) {
        if(items.size() < 1) { return ""; }
        String modifier = items.get(0);
        for(int i = 1; i <= items.size()-1; i++){
            modifier += (", " + items.get(i));
        }
        return modifier;
    }

    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two and three"
     *
     *  HINT: There is no way to do this without using several conditionals.
     *        Use the test to help you. After you have it working, see if you
     *        can simplify your solution at all.
     */
    public static String formatGrammatically(List<String> items) {
        String modifier = "";
        if(items.size() == 0){
            return "";
        }
        else if(items.size() == 1){
            return items.get(0);
        }
        else if(items.size() == 2){
            return (items.get(0) + " and " + items.get(1));
        }
        else{
            for(int i=0; i<items.size()-2; i++) {
                modifier += (items.get(i) + ", ");
            }
            modifier += (items.get(items.size()-2) + " and " + items.get(items.size()-1));
            return modifier;
        }
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two, and three"   // Oxford comma after "two"
     *
     *  HINT: It is tricky to get all the cases right! Again, use the test to
     *        help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
        String modifier = "";
        if(items.size() == 0){
            return "";
        }
        else if(items.size() == 1){
            return items.get(0);
        }
        else if(items.size() == 2){
            return (items.get(0) + " and " + items.get(1));
        }
        else{
            for(int i=0; i<items.size()-2; i++) {
                modifier += (items.get(i) + ", ");
            }
            modifier += (items.get(items.size()-2) + ", and " + items.get(items.size()-1));
            return modifier;
        }
    }

    /*
     * Special challenge, if you are looking for something extra:
     *
     * Create the following method that can either use the Oxford comma or not,
     * depending on its second parameter:
     *
     *     public static String formatGrammatically(List<String> items, boolean oxfordComma) {
     *         ???
     *     }
     *
     * Don't implement it by using the two methods above. Instead, do it the
     * other way around. Change the methods above so they both use your new one,
     * like this:
     *
     *     public static String formatGrammatically(List<String> items) {
     *         formatGrammatically(items, false);
     *     }
     *
     *     public static String formatGrammaticallyWithOxfordComma(List<String> items) {
     *         formatGrammatically(items, true);
     *     }
     *
     * ...and see if all the tests still pass!
     */
}
