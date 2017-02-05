/**
 * created by PoldiChen
 * date 2017年2月5日 下午9:57:27
 */
package singleton.lazy.inner;

/** 
 * Class: Singleton
 * date: 2017年2月5日 下午9:57:27
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // 懒汉式+静态内部类，保证线程安全又不影响性能
	
	private static class InnerClass {
		private static final Singleton instance = new Singleton();
	}
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return InnerClass.instance;
	}

}
