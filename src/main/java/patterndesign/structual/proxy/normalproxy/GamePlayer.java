package patterndesign.structual.proxy.normalproxy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/11.</p>
 */
public class GamePlayer implements IGamePlayer{
	private String name = "";
	public GamePlayer(String _name){
		this.name = _name;
	}
	
	@Override
	public void login(String user, String password) {
		System.out.println("Now login in user: " + user + "; password: " + password);
	}
	
	@Override
	public void killBoss() {
		System.out.println(this.name + " is killing boss~");
	}
	
	@Override
	public void upgrade() {
		System.out.println(this.name + " upgraded!");
	}
}
