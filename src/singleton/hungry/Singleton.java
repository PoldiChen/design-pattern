/**
 * created by PoldiChen
 * date 2017��2��5�� ����9:54:06
 */
package singleton.hungry;

/** 
 * Class: Singleton
 * date: 2017��2��5�� ����9:54:06
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // ����ʽ
	
	private static Singleton instance = new Singleton(); // �������ʱ���ͬʱ����ʵ��
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}

}
