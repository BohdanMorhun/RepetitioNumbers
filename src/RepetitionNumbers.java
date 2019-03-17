import java.util.*;

public class RepetitionNumbers {
        public static void main(String[] args) {

            List<Integer> list = Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7);

            Set<Integer> set = new TreeSet<>(list);
            for (Integer r : set) {
                System.out.println(r + " - " + Collections.frequency(list, r));

            }
        }
    }
