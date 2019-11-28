import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BinarySearch {
	
	public static void main(String args[]) {
        //生成一个随机数组
        int[] array = suiji();
        //对随机数组排序
        Arrays.sort(array);
        System.out.println("产生的随机数组为：" + Arrays.toString(array));

        System.out.println("要进行查找的值：");
        Scanner input = new Scanner(System.in);
        //进行查找的目标值
        int aim = input.nextInt();

        //二分法查找
        int index = binarySearch(array, aim);
        System.out.println("要查找的值的索引位置：" + index);
    }

	/**
     *
     * 生成一个随机数组
     *
     */
     private static int[] suiji() {
         //Random().nextInt(n) + m  返回m到m+n-1之间的随机数
         int n = new Random().nextInt(6) + 5;
         int[] array = new int[n];
         for (int i = 0 ; i < array.length;i++) {
             array[i] = new Random().nextInt(100);
         }
         return array;
      
     }


    /**
     * 利用循环的方式实现二分法
     */
     private static int binarySearch(int[] array, int aim) {
         int left = 0;
         //数组最大索引值
         int right = array.length-1;
         int mid;
         while (left <= right) {
             mid = (left + right) / 2;
             // 若查找数值比中间值小，则以整个查找范围的前半部分作为新的查找范围
             if (aim < array[mid]) {
                 right = mid - 1;
                 // 若查找数值比中间值大，则以整个查找范围的后半部分作为新的查找范围
             }else if (aim > array[mid]) {
                 left = mid +1;
                 // 若查找数据与中间元素值正好相等，则放回中间元素值的索引
             }else {
                 return mid;
             }
         }
         return -1;
     }

}