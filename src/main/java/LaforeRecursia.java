public class LaforeRecursia {
    public static void main(String[] args) {
        System.out.println(triangle(5000));
       // System.out.println(factorial(15L));
    }

    static Long factorial(Long n)
    {
        if(n==0)
            return 1L;
        else
            return (n * factorial(n-1) );
    }

    public static int triangle(int n)
    {
       // System.out.println("Entering: n=" + n);
        if(n==1)
        {
           // System.out.println("Returning 1");
            return 1;
        }
        else
        {
            int temp = n + triangle(n-1);
           // System.out.println("Returning " + temp);
            return temp;
        }
    }

}
