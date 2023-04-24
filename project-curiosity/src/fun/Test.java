package fun;

import helpers.ArrayHelper;

public class Test {
    static int[] test = {3, 5, 17, 19, 22, 55, 82, 94};
    int key = 0;

    public static void main(String[] args) {
        System.out.println(ArrayHelper.binarySearch(test, 17));
    }
}
