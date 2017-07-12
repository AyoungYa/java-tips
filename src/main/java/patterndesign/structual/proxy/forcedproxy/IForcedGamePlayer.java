package patterndesign.structual.proxy.forcedproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public interface IForcedGamePlayer {
	void login(String name, String password);
	
	void killBoss();
	
	void upgrade();
	
	IForcedGamePlayer getProxy();
}
