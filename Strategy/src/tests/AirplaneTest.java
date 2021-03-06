/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.FlyingFactory;
import vehicles.Flying;
import vehicles.IDontLiftOff;
import vehicles.ILiftOffH;
import vehicles.LiftOff;
import vehicles.ILiftOffV;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	private static FlyingFactory flyingFactory;

	@BeforeClass
	public static void onlyOnce(){
		flyingFactory = new FlyingFactory();
	}
	
	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Don't Fly");
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Passenger Airplane");
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Vertical");
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Don't Liftoff");
		LiftOff liftOff = new IDontLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Horizontal");
		
		LiftOff liftOff = new ILiftOffH();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
