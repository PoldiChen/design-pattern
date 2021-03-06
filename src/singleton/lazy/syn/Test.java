/**
 * created by PoldiChen
 * date 2017年2月5日 下午9:53:08
 */
package singleton.lazy.syn;

import singleton.lazy.simple.Singleton;

/** 
 * Class: Test
 * date: 2017年2月5日 下午9:53:08
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode()); // 一样的hashcode，同一个实例
	}

}
