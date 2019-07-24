package sort;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/22 19:59
 * @Description:选择排序
 */
public class SelectSort {
    public static void SelectSort(int[] sort) {
        int len = sort.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (sort[j] < sort[index])
                    index = j;
                count++;
            }
            int temp = sort[index];
            sort[index] = sort[i];
            sort[i] = temp;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int sort[] = new int[]{4, 7, 8, 1, 0, 4, 7};
        SelectSort(sort);
        for (int i : sort) {
            System.out.print(i + "\t");
        }
    }
}