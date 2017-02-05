/**
 * created by PoldiChen
 * date 2017��2��5�� ����9:50:03
 */
package singleton.lazy.syn;

/** 
 * Class: Singleton
 * date: 2017��2��5�� ����9:50:03
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // ������ʽ��synchronized�ؼ�������getInstance��������ֻ֤��һ��ʵ����������Ӱ������
	
	private static Singleton instance = null;
	
	private Singleton() {}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
