package Programs.OnArrays;

public class Febonocci {

        static void fib(int n) {
            int a = -1, b = 1, c;
            if (n == 0)
                System.out.println(a);

            for (int i = 1; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c+" ");
            }
        }

        public static void main (String args[])
        {
            int n = 9;
            fib(n);
        }
    }


