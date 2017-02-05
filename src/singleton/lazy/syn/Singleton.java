/**
 * created by PoldiChen
 * date 2017年2月5日 下午9:50:03
 */
package singleton.lazy.syn;

/** 
 * Class: Singleton
 * date: 2017年2月5日 下午9:50:03
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // 简单懒汉式，synchronized关键字修饰getInstance方法，保证只有一个实例，但可能影响性能
	
	private static Singleton instance = null;
	
	private Singleton() {}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
