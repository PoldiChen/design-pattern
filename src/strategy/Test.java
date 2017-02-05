/**
 * created by PoldiChen
 * date 2017��2��5�� ����6:01:28
 */
package strategy;

/** 
 * Class: Test
 * date: 2017��2��5�� ����6:01:28
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Context context;
		context = new Context(new StrategyImplA());
		context.operate();
		context = new Context(new StrategyImplB());
		context.operate();
	}

}
