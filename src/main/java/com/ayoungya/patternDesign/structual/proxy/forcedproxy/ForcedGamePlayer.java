package patterndesign.structual.proxy.forcedproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class ForcedGamePlayer implements IForcedGamePlayer{
	private String name = "";
	private IForcedGamePlayer proxy = null;
	
	public ForcedGamePlayer(String name) {
		this.name = name;
	}
	
	@Override
	public void login(String name, String password) {
		if (isProxy()){
			System.out.println(String.format("Login in User: %s; Password: %s.", name, password));
		}else {
			System.out.println("Has no proxy.");
		}
	}
	
	@Override
	public void killBoss() {
		if (isProxy()) {
			System.out.println(String.format("User: %s killed boss", this.name));
		} else {
			System.out.println("Has no proxy, cannot kill boss");
		}
		
	}
	
	@Override
	public void upgrade() {
		if (isProxy()) {
			System.out.println(String.format("User: %s upgraded. ", this.name));
		} else {
			System.out.println("Has no proxy, cannot upgrade");
		}
	}
	
	@Override
	public IForcedGamePlayer getProxy() {
		this.proxy = new ForcedGameProxy(this);
		return this.proxy;
	}
	
	private boolean isProxy(){
		return this.proxy != null;
	}
}
