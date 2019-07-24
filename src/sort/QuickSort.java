package sort;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/22 20:24
 * @Description: 快速排序
 */
public class QuickSort {

    /***
     * 划分函数
     * @param sort
     * @param left
     * @param right
     * @return
     */
    public static int divide(int[] sort, int left, int right) {
        int key = sort[left];
        while (left < right) {
            while (sort[right] >= key && left < right)
                right--;
            sort[left] = sort[right];
            while (sort[left] < key && left < right)
                left++;
            sort[right] = sort[left];
        }
        sort[left] = key;
        for (int i : sort) {
            System.out.print(i + "\t");
        }
        return left;
    }

    public static void main(String[] args) {
        int sort[] = new int[]{1, 10, 2, 1, -1, 0};
        divide(sort, 0, sort.length - 1);
    }
}