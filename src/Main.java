import java.util.*;

public class Main {

    public static List<Integer> printingOddNumbers(List<Integer> nums) {
        List<Integer> numsOdd = new ArrayList<>();
        for (Integer num : nums) {
            if (!(num % 2 == 0)) {
                numsOdd.add(num);
            }
        }
        return numsOdd;
    }

    public static Set<Integer> printingEvenNumbers(List<Integer> nums) {
        nums.sort(Comparator.comparing(Object::toString));
        List<Integer> numsEven = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numsEven.add(num);
            }
        }
       return new HashSet<>(numsEven);
    }

    public static Set<String> uniqueWords(List<String> words) {
      return new HashSet(words);

    }


    public static List<Integer> numberTakes(List<String> words) {
        List<Integer> numberTakes = new ArrayList<>(List.of());
        for (int i = 0; i < words.size(); i++) {
            int b = 1;
            for (int a = i + 1; a < words.size(); a++) {
                if ((words.get(i).equals(words.get(a)))) {
                    b = b + 1;
                    words.remove(a);
                }
            }
            if (b > 1) {
                numberTakes.add(b);
            }
        }
        return numberTakes;
    }


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 8, 4, 4, 5, 5, 6, 7));
        System.out.println(printingOddNumbers(nums));
        System.out.println(printingEvenNumbers(nums));


        List<String> words = new ArrayList<>(List.of("palace", "building", "home", "street", "home", "avenue", "building"));
        System.out.println(uniqueWords(words));

        List<String> words2 = new ArrayList<>(List.of("palace", "building", "home", "street", "home", "palace", "avenue",
                "building", "home", "building"));
        System.out.println(numberTakes(words2));
    }
}