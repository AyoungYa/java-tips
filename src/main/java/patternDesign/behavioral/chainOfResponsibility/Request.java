package patternDesign.behavioral.chainOfResponsibility;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class Request {
	private Level level;
	
	public Request(Level level) {
		this.level = level;
	}
	
	public Level getLevel() {
		return level;
	}
	
	
}
