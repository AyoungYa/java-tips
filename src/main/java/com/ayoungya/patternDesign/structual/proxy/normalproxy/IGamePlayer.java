package patterndesign.structual.proxy.normalproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public interface IGamePlayer {
	void login(String user, String password);
	
	void killBoss();
	
	void upgrade();
}
