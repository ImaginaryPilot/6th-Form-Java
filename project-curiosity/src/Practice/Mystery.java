package Practice;

import helpers.Keyboard;

public class Mystery {
    public static void main(String[] args) {
        int N = Keyboard.readInt();

        if (N < 0) {
            N = Keyboard.readInt();
        }

        while (N > 0 && N % 2 == 0) {
            N -= 2;
        }
        System.out.println(N);
    }
}
