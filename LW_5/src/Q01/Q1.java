package Q01;

public class Q1 {
    public static void main(String[] args) {
        int start=10;
        int end=49;

        for(int i=start; i<=end;i++){
            System.out.print(i+" ");

            if ((i-start +1) % 10==0){
                System.out.println();
            }
        }
    }
}
