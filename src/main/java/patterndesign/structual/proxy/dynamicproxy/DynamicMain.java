package patterndesign.structual.proxy.dynamicproxy;

import patterndesign.structual.proxy.normalproxy.GamePlayer;
import patterndesign.structual.proxy.normalproxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class DynamicMain {
	public static void main(String[] args){
		IGamePlayer player = new GamePlayer("Lisi");
		InvocationHandler handler = new DynamicGamePlayerIH(player);
		System.out.println("Start Dynamic proxy");
		
		ClassLoader classLoader = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, new DynamicGamePlayerIH(player));
		
		proxy.login("Lisi", "12333");
		proxy.killBoss();
		proxy.upgrade();
		
		System.out.println("End Dynamic proxy");
	}
}
