/**
 * created by PoldiChen
 * date 2017��2��7�� ����9:57:15
 */
package proxy;

/** 
 * Class: Test
 * date: 2017��2��7�� ����9:57:15
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Client client = new Client();
		Proxy proxy = new Proxy(client);
		proxy.operate();
	}

}
