package sort;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/22 19:14
 * @Description: 冒泡排序
 */
public class BubbleSort {

    public static void BubbleSort(int sort[]) {
        int len = sort.length;
        int count = 0;//比较次数
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println("比较次数：" + count);

    }

    public static void main(String[] args) {
        int sort[] = new int[]{4, 7, 8, 1, 0, 4, 7};
        BubbleSort(sort);
        for (int i : sort) {
            System.out.print(i + "\t");
        }
    }
}