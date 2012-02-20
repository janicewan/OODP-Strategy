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
	else return null;
	}
}
