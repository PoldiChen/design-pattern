/**
 * created by PoldiChen
 * date 2017年2月5日 下午6:00:51
 */
package strategy;

/** 
 * Class: StrategyImplA
 * date: 2017年2月5日 下午6:00:51
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class StrategyImplA implements IStrategy {

	@Override
	public void operate() {
		System.out.println("operate with strategy A");
	}

}
