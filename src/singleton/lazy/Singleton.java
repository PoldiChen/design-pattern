/**
 * created by PoldiChen
 * date 2017年2月5日 下午9:45:56
 */
package singleton.lazy;

/** 
 * Class: Class
 * date: 2017年2月5日 下午9:45:56
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // 懒汉式，并发情况下可能出现多个实例
	
	private static Singleton instance = null;
	
	private Singleton() {} // 单例模式的构造函数都要用private修饰，不允许外部构造

	public static Singleton getInstance() { // 获取实例的时候才进行实例化
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
