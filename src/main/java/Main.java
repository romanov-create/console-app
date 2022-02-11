import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] arrNumbers = new Integer[]{2, 2, 2};

        int sumOfNumbers = calculate(arrNumbers, MathOperation.SUM);
        int MultiOfNumbers = calculate(arrNumbers, MathOperation.MULTI);

        System.out.println("Sum of array numbers : " + sumOfNumbers);
        System.out.println("Multiplication of array numbers : " + MultiOfNumbers);

    }

    enum MathOperation {
        SUM,
        MULTI;
    }

    public static int calculate(Integer[] arrayNumbers, MathOperation mathOperation) {
        if (arrayNumbers == null || arrayNumbers.length == 0) {
            throw new IllegalArgumentException("please, fill in the array of numbers");
        }

        List<Integer> listOfNumbers = Arrays.asList(arrayNumbers);
        BinaryOperator<Integer> binOperation = null;

        if (mathOperation == MathOperation.SUM) {
            binOperation = Integer::sum;
        }

        if (mathOperation == MathOperation.MULTI) {
            binOperation = (a, b) -> a * b;
        }

        if (binOperation == null) {
            throw new IllegalArgumentException("binOperation not is null !");
        }

        return  listOfNumbers.stream().reduce(binOperation).get();
    }
}

