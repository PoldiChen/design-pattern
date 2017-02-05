/**
 * created by PoldiChen
 * date 2017年2月5日 下午5:58:28
 */
package strategy;

/** 
 * Class: Context
 * date: 2017年2月5日 下午5:58:28
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Context {
	
	private IStrategy strategy;
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate() {
		this.strategy.operate();
	}

}
