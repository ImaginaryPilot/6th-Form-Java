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
        return -1;
    }
}