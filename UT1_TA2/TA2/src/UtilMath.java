public class UtilMath {
    public static int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }
    /*
    Si lo es, el programa deberá
    calcular la suma de los números pares desde 0 hasta el número dado, y en caso contrario deberá
    calcular la suma de los números impares desde 0 hasta el número dado. Utilizar solamente sentencias
    while o do-while.
     */
    public static int sumaPrimosParesImpares(long n){
        int result = 0;
        int numeroPar = 0;
        int numeroImpar = 1;
        if(n <= 0){
            return result;
        }
        if(isPrime(n)){
            while (numeroPar <= n){
                result += numeroPar;
                numeroPar += 2;
            }
        } else {
            while (numeroImpar <= n){
                result += numeroImpar;
                numeroImpar += 2;
            }
           
        }
        return result;
    }
}
