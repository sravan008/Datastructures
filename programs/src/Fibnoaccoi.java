public class Fibnoaccoi {

    void generateFib(int n )
    {
        int x = 0;
        int y = 1;
        for(int i = 0;i<n;i++){
            int z = x+y;
            System.out.println(z);
            x=y;
            y=z;
        }

    }
    public static void main(String[] args) {
        Fibnoaccoi fib = new Fibnoaccoi();
        fib.generateFib(8);
    }

}
