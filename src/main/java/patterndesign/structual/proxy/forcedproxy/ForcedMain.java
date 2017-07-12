package patterndesign.structual.proxy.forcedproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class ForcedMain {
	public static void main(String[] args){
		//Don't use proxy
		IForcedGamePlayer player = new ForcedGamePlayer("Zhangsan");
		
		System.out.println("Start now by real object");
		player.login("zhangsan", "124");
		player.killBoss();
		player.upgrade();
		System.out.println("End Game by real object");
		System.out.println("========================\n");
		
		//Any proxy
		IForcedGamePlayer proxy = new ForcedGameProxy(player);
		System.out.println("Start now by any proxy");
		proxy.login("zhangsan", "124");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("End Game by any proxy");
		System.out.println("========================\n");
		
		//Specified proxy
		IForcedGamePlayer specifiedProxy = player.getProxy();
		System.out.println("Start now by SPECIFIED proxy");
		specifiedProxy.login("zhangsan", "124");
		specifiedProxy.killBoss();
		specifiedProxy.upgrade();
		
		System.out.println("End Game by SPECIFIED proxy");
	}
}
