/**
 * 
 */
package vehicles;

/**
 * @author jwan01
 *
 */
public class FlyingFactory {
	public Flying createFlying(String string) {
	if(string.equals("Fighter Jet")){
		return new IFlyLikeFJ();
		}
	else if(string.equals("Don't Fly")){
		return new IDontFly();
	}
	else if(string.equals("Passenger Airplane")){
		return new IFlyLikePP();
	}
	else if(string.equals("Vertical")){
		return new IFlyLikeFJ();
	}
	else if(string.equals("Don't Liftoff")){
		return new IFlyLikeFJ();
	}
	else if(string.equals("Horizontal")){
		return new IFlyLikeFJ();
	}
	else return null;
	}
}
