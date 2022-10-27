package wc.zk.day03;

/**
 * 数组练习题
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-10-27 10:51:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-10-27      zk           v1.0.0               新建
 **/
public class ArrayDemo {
    //数组之间比较大小值 最大值、最小值
    public static void main(String[] args) {
        int[] arr = {43,3,65,987,32,5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
            System.out.println(arr);
            System.out.println("最大值:"+max+"最小值："+min);
        }
        int[] array =new int[] {63,56,9,5,3};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("排序结果：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        //定义一个长度为10的int数组,自定义一组数据,统计数组中的总和、平均值、最大值、最小值、以及奇数和偶数的个数.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumA = getSum(array1);
        double avg = getAvg(sumA,array1);
        int max1 = getMax(array1);
        int min1 = getMin(array1);
        int oddCount = gerOddCount(array1);

        System.out.println("数组的元素总和是："+sumA);
        System.out.println("数组的平均值："+avg);
        System.out.println("数组中元素的最大值为：" + max);
        System.out.println("数组中元素的最小值为：" + min);
        System.out.println("数组中奇数的个数为：" + oddCount);
    }

    private static int gerOddCount(int[] array1) {
        int oddCount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0){
                oddCount++;
            }
        }
        return oddCount;
    }

    private static int getMin(int[] array1) {
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min>array1[i]){
                min = array1[i];
            }
        }
        return min;
    }

    private static int getMax(int[] array1) {
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(max<array1[i]){
                max = array1[i];
            }
        }
        return max;
    }

    private static double getAvg(int sumA, int[] array1) {
        double avg = 0;
        avg += sumA/array1.length;
        return avg;
    }

    private static int getSum(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        return sum;
    }
}
