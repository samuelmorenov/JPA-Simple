package cws.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import cws.domain.Certificate;
import cws.domain.Mechanic;
import cws.domain.VehicleType;

public class IsCertifiedForTests {

	private Mechanic mechanic;
	private VehicleType car;
	private VehicleType truck;

	@Before
	public void setUp() throws Exception {
		mechanic = new Mechanic("123");
		car = new VehicleType("car");
		truck = new VehicleType("truck");
		
		new Certificate(mechanic, car);		// auto link
	}

	/**
	 * It is certified for car, but not for truck not null
	 */
	@Test
	public void testCertifiedForCarNotForTruck() {
		assertTrue( mechanic.isCertifiedFor( car ) );
		assertTrue( ! mechanic.isCertifiedFor( truck ) );
		assertTrue( ! mechanic.isCertifiedFor( null ) );
	}

}
