package Practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] N = {7,4,8,1};


        for(int i = 0; i < N.length - 1; i++) {
            for(int j = 0; j < N.length - 1; j++){
                if(N[j] > N[j + 1]){
                    int temp = N[j + 1];
                    N[j + 1] = N[j];
                    N[j] = temp;
                }
            }
        }
        for (int e : N) {
            System.out.print(e + ", ");
        }
    }
}
