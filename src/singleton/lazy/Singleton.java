/**
 * created by PoldiChen
 * date 2017��2��5�� ����9:45:56
 */
package singleton.lazy;

/** 
 * Class: Class
 * date: 2017��2��5�� ����9:45:56
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // ����ʽ����������¿��ܳ��ֶ��ʵ��
	
	private static Singleton instance = null;
	
	private Singleton() {} // ����ģʽ�Ĺ��캯����Ҫ��private���Σ��������ⲿ����

	public static Singleton getInstance() { // ��ȡʵ����ʱ��Ž���ʵ����
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
