import java.util.Arrays;
import java.util.List;

public class CountNumbersOfText {

    public static void main(String[] args) {
        String text = "фDS12 ф4ф10";
       // System.out.println(deleteNth(new Integer[]{20, 37, 20, 21}, 1));

        System.out.println(count(text));
    }

    public static String count(String str) {
/*        long countDigit = str.chars().filter(Character::isDigit).count();
        long countChar = str.chars().filter(Character::isLetter).count();

        return "Text have a digit: " + countDigit + "\nText have a chars: " + countChar;*/
        char[] chars = str.toCharArray();
        int countD = 0;
        int countC = 0;
        int countL = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                countD++;
            } else if (Character.isAlphabetic(chars[i])) {
                if (Character.UnicodeBlock.of(chars[i]).equals(Character.UnicodeBlock.CYRILLIC)) {
                    countC++;
                } else if (Character.UnicodeBlock.of(chars[i]).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                    countL++;
                }
            }
        }
        return "Text have: " + "\n- DIGITS : " + countD + "\n- CYRILLIC : " + countC + "\n- LATIN : " + countL;
    }





    public static List<Integer> deleteNth(Integer[] elements, int maxOccurrences) {
        //Code here ;)
        List<Integer> list = Arrays.asList(elements);
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    if (count == maxOccurrences) {
                        list.remove(i);
                    }
                }
            }
        }
        return list;
    }
}
