package baby.turtle.core;

public class ResultError extends Result{
	
	public ResultError(){
		super(false);
		}
	
	public ResultError(String message) {
		super(false,message);
	}
}
