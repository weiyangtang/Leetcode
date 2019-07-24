package sort;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/22 19:31
 * @Description: 插入排序, 注意边界
 */
public class InsertSort {
    public static void InsertSort(int sort[]) {
        int len = sort.length;
        int count = 0;
        for (int i = 1; i < len; i++) {
            int j, temp = sort[i];
            for (j = i - 1; j >= 0 && sort[j] > temp; j--) {
                sort[j + 1] = sort[j];
                count++;
            }
            sort[j + 1] = temp;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int sort[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        InsertSort(sort);
        for (int i : sort) {
            System.out.print(i + "\t");
        }
    }
}