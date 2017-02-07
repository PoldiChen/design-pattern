/**
 * created by PoldiChen
 * date 2017��2��7�� ����9:56:33
 */
package proxy;

/** 
 * Class: Proxy
 * date: 2017��2��7�� ����9:56:33
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Proxy implements IOperate {

	private Client client;
	
	public Proxy(Client client) {
		this.client = client;
	}

	@Override
	public void operate() {
		client.operate();
		
	}

}
