package Day4;

public class Question_9 {

    static int powerFunction(int x, int n){
        if(n == 1) return x;

        if(n % 2 == 0){
            return powerFunction(x, n/2) * powerFunction(x, n/2);
        }
        else{
            return x * powerFunction(x, n/2) * powerFunction(x, n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println("2 to the power 20 is : " + powerFunction(2, 20));
    }
}
