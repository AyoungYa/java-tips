package patterndesign.structual.proxy.forcedproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class ForcedGameProxy implements IForcedGamePlayer, IProxy{
	private IForcedGamePlayer gamePlayer = null;
	
	public ForcedGameProxy(IForcedGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public void login(String name, String password) {
		this.gamePlayer.login(name, password);
	}
	
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}
	
	@Override
	public IForcedGamePlayer getProxy() {
		return this;
	}
	
	@Override
	public void count() {
		System.out.println("Proxy earn ¥50");
	}
}
