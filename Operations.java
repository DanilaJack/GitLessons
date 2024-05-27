public class Operations {

    private static int option(int n){
        int k = 1;
        for (int i = 1; i <= n; i++){
            k *= i;
        }
        return k;
    }

    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);

        System.out.println(option(6));

        System.out.println("row in the branch 'newbranch'");
    }

}
