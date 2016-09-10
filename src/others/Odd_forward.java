package others;

import Standard.std;
import Standard.stdOut;

/**
 * 奇数放在偶数的前面。（插入排序的变异）
 * Created by nibnait on 2016/8/7.
 */
public class Odd_forward {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        stdOut.print(a);

        /*for (int i = 1; i < Algorithms_4thEdition.length; i++) {
            for (int j = i; j > 0 && IsOdd(Algorithms_4thEdition[j]) && !IsOdd(Algorithms_4thEdition[j-1]); j--) {
                std.swap(Algorithms_4thEdition,j,j-1);
            }
        }*/

        //时间复杂度：O(n)的方法：
        //两个指针
        for (int i = 0; i < a.length; i++) {
            if (!IsOdd(a[i])) {
                for (int j = a.length - 1; j > 0 && i < j; j--) {
                    if (IsOdd(a[j])) {
                        std.exch(a, i, j);
                    }
                }
            }
        }
        stdOut.print(a);
    }

    private static boolean IsOdd(int i) {
        return i % 2 == 1;
    }


}