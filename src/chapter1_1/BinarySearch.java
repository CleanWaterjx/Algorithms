package chapter1_1;

/**
 * Created by yujinxiong on 2017/5/16.
 */
public class BinarySearch {
    public static void main(String[] agrs) {
    }

    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1 ;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if (key < a [mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
