package baby.turtle.core;

public class ResultSuccess extends Result{

	public ResultSuccess(){
		super(true);
		}
	
	public ResultSuccess(String message) {
		super(true,message);
	}
}
