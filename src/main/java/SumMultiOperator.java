import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SumMultiOperator {
    public static void main(String[] args) {

        Integer[] arrNumbers = new Integer[]{2, 2, 2};

        int sumOfNumbers = calculate(arrNumbers, MathOperation.SUM);
        int MultiOfNumbers = calculate(arrNumbers, MathOperation.MULTI);

        System.out.println("Sum of array numbers : " + sumOfNumbers);
        System.out.println("Multiplication of array numbers : " + MultiOfNumbers);

    }

    enum MathOperation {
        SUM {
            public BinaryOperator<Integer> operator() {
                return Integer::sum;
            }
        },
        MULTI {
            public BinaryOperator<Integer> operator() {
                return (a, b) -> a * b;
            }
        };

        public abstract java.util.function.BinaryOperator<Integer> operator();
    }

    public static int calculate(Integer[] arrayNumbers, MathOperation mathOperation) {
        if (arrayNumbers == null || arrayNumbers.length == 0) {
            throw new IllegalArgumentException("please, fill in the array of numbers");
        }

        List<Integer> list = Arrays.asList(arrayNumbers);

        //Integer integer = myReduce(arrayNumbers, mathOperation.operator());
        return  list.stream().reduce(mathOperation.operator()).get();
    }

    public static <T> T myReduce(T[] array, java.util.function.BinaryOperator<T> binaryOperator) {
        if (array == null || array.length == 0) {
            return null;
        }

        T result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = binaryOperator.apply(result, array[i]);
        }

        return result;
    }

}

