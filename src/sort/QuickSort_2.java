package sort;

import java.util.Random;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/24 19:49
 * @Description: 快速排序
 */
public class QuickSort_2 {

    public static int divide(int sort[], int left, int right) {
        if (left == right)
            return left;
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
        return left;
    }

    public static void quickSort(int sort[], int left, int right) {
        if (left >= right)
            return;
        int mid = divide(sort, left, right);
        quickSort(sort, left, mid);
        quickSort(sort, mid + 1, right);

    }

    public static void main(String[] args) {
        int sort[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            sort[i] = random.nextInt(50);
        }
//        divide(sort, 0, sort.length - 1);
        quickSort(sort, 0, sort.length - 1);
        for (int i : sort) {
            System.out.print(i + "\t");
        }
    }

}