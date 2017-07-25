package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by manishgiri on 7/22/17.
 */
public class WhilePractice {

    private static String[] findCategories(String s) {
        List<String> cats = new ArrayList<>();
        int i = 0;
        String find = "category:";
        while (true) {
            // find 'category:'
            int found = s.indexOf(find, i);
            // if not found, break
            if (found == -1) {
                break;
            }
            /**
             * if found -
             * a. extract category value, add to list
             * b. move i forward
             */

            // extract cateory value
            int start = found + 9;
            // end when space is found
            int end = s.indexOf(' ', start);

            // add cat value to list
            cats.add(s.substring(start, end));

            // move i forward
            i = start;
        }
        return cats.toArray(new String[cats.size()]);

    }

    public static void main(String[] args) {

        String pattern = "We have a large inventory of things in our warehouse falling in "
                + "the category:apparel and the slightly "
                + "more in demand category:makeup along with the category:furniture and ….";
        String[] categories = findCategories(pattern);
        System.out.println(Arrays.toString(categories));

    }
}
