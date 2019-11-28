
/** 
 * <Description> <br> 
 *  
 * @author fan.chencheng<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2018年7月19日 <br>
 * @since V1.0<br>
 * @see  <br>
 */
public class ShuLie {
	/**
	 * 
	 * Description: <br> 
	 * 
	 *  斐波那契数列
	 *  斐波纳契数列以如下被以递归的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
	 *  该数列从第3项开始，每一项都等于前两项之和。
	 */
	public static long[] generateFibonaccis(int n) {
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }
	
	public static void main(String[] args) {
        int n = 10;
        long[] fib = generateFibonaccis(n);
        for (int i = 0; i < n; i++) {
            System.out.print(Long.toUnsignedString(fib[i]) + " ");
        }
    }

}
