package Day4;

public class Question_8 {

    static int solve(int num){
        if(num <= 0) return 0;
        if(num == 1) return 1;
        return (solve(num-1) % Integer.MAX_VALUE + solve(num-2) % Integer.MAX_VALUE) % Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        System.out.println("For n = 20 result is : " + solve(20));
        System.out.println("For n = 50 result is : " + solve(50));
    }
}
