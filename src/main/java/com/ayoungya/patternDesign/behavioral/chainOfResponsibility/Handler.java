package com.ayoungya.patternDesign.behavioral.chainOfResponsibility;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public abstract class Handler {
	private Handler nextHandler;
	
	public final Response handlerMessage(Request request){
		Response response = null;
		
		if (this.getHandlerLevel().equals(request.getLevel())){
			response = this.echo(request);
		}else {
			if (this.nextHandler != null){
				response = this.nextHandler.handlerMessage(request);
			}
		}
		return response;
	}
	
	protected abstract Level getHandlerLevel();
	
	protected abstract Response echo(Request request);
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	
}
