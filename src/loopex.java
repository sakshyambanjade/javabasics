public class loopex {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i=i+3 ){
            System.out.println(i + " ");
        }
        for (int i = 10; i > 0; i-- ){
            System.out.println(i + " ");
        }
        int a = 79;
        while(a <= 700){
            System.out.println(a);
            a++;
        }
        int nums[] = {12,13,14,15};
        for(int n : nums){
            System.out.println(n);
        }
    }
}
