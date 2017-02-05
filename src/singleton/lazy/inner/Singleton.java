/**
 * created by PoldiChen
 * date 2017��2��5�� ����9:57:27
 */
package singleton.lazy.inner;

/** 
 * Class: Singleton
 * date: 2017��2��5�� ����9:57:27
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Singleton { // ����ʽ+��̬�ڲ��࣬��֤�̰߳�ȫ�ֲ�Ӱ������
	
	private static class InnerClass {
		private static final Singleton instance = new Singleton();
	}
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return InnerClass.instance;
	}

}
