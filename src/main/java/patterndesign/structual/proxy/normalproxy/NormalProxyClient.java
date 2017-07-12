package patterndesign.structual.proxy.normalproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class NormalProxyClient {
	public static void main(String[] args){
		IGamePlayer proxy = new GamePlayerProxy("Jim");
		
		System.out.println("start proxy Jim to play game");
		
		proxy.login("Jim", "12345");
		proxy.killBoss();
		proxy.upgrade();
		
		System.out.println("end proxy Jim to play game");
	}
}
