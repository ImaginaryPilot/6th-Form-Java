package helpers;

import java.util.Collection;
import java.util.Iterator;

public class CollectionHelper {
    public static int sum (Collection<Integer> col){
        Integer sum = 0;

        // get the iterator from the collection
        Iterator<Integer> iterator = col.iterator();

        while (iterator.hasNext()){
            Integer nextInt = iterator.next();
            sum += nextInt;
        }

        return (int) sum;

    }

    public static int findPositionOf(Collection<Integer> col, int target){
        int position = -1;

        // get the iterator from the collection
        Iterator<Integer> iterator = col.iterator();

        while (iterator.hasNext()){
            Integer nextInt = iterator.next();
            position++;
            if(nextInt == target){
                position = nextInt;
                return position; 
            }
        }
        
        return position; // if we reach here it means we did not find it
    }
}
