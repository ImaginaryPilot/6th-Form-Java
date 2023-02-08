package topic04learningaids;

/**
 * 4.2.1 Describe the characteristics of standard 1D array algorithms
 * 4.3.11 Construct algorithms that use arrays and access methods
 */
public class LinearSearch {
    
    /**
     * 
     * @param numarr
     * @param target
     * @return
     */
    public static int search(int[] numarr, int target) {
        for(int i = 0; i < numarr.length; i++){
            if(numarr[i] == target){
                return i;
            }
        }
        return -1; 
    }

    public static int search(String[] strarr, String target) {
        for(int i = 0; i < strarr.length; i++){
            if(strarr[i] == target){
                return i;
            }
        }
        return -1; 
    }

    public static int[] search2D(int[][] numarr, int target) {
        int[] index = {-1, -1};
        for(int i = 0; i < numarr.length; i++){
            for(int j = 0; j < numarr.length; j++){
                if(numarr[i][j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}