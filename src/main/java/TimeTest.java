import java.util.*;
/**
 * class is counting the running time of functions
 */
public class TimeTest {
    /**
     * this function adds items to the collection
     * @param collection of elems
     */
    public static long testAdd(Collection<Integer> collection, int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.add(i);
        long end = System.nanoTime();
        return end - start;
    }
    /**
     * this function gets items from the collection
     * @param collection of elems
     */
    public static long testGet(List<Integer> collection, int n){
        long start = System.nanoTime();
        for ( int i=0; i<n; i++)
            collection.get(i);
        long end = System.nanoTime();
        return end - start;
    }
    /**
     * this function deletes items from the collection
     * @param collection of elems
     */
    public static long testDelete(List<Integer> collection, int n){
        long start = System.nanoTime();
        for ( int i=n-1; i>0; i--)
            collection.remove(i);
        long end = System.nanoTime();
        return end - start;
    }
}