public class CountDigit {

    public static int countdigit(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 145;
        int res = countdigit(n);
        System.out.println(res);
    }

}
