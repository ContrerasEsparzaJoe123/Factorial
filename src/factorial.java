public class factorial {
    public  int factorial(int numero){
        if (numero==1){
            return 1;
        }
        return  numero * factorial(--numero);
    }
    public static void main(String[] args){
        factorial f = new factorial();

        System.out.println(f.factorial(5 ));
    }
}
