/**
 * created by PoldiChen
 * date 2017年2月5日 下午9:54:06
 */
package singleton.hungry;

/** 
 * Class: Singleton
 * date: 2017年2月5日 下午9:54:06
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // 饿汉式
	
	private static Singleton instance = new Singleton(); // 创建类的时候就同时创建实例
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}

}
