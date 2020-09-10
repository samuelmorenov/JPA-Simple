package uo.ri.cws.extended.domain;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import ri.cws.domain.Certificate;
import ri.cws.domain.Mechanic;
import ri.cws.domain.VehicleType;

public class PackageAccessorTests {

	@Test
	public void test() {
		Class<?>[] classes = {
			Course.class,
			Dedication.class,
			Mechanic.class,
			Enrollment.class,
			VehicleType.class,
			Certificate.class,
			Invoice.class,
			WorkOrder.class,
			Client.class,
			Vehicle.class,
			Intervention.class,
			Substitution.class,
			SparePart.class,
			PaymentMean.class,
			CreditCard.class,
			Voucher.class,
			Cash.class
		};
		
		for(Class<?> clazz : classes) {
			assertNotPublicAssociationAccessors( clazz );
		}
	}

	private void assertNotPublicAssociationAccessors(Class<?> clazz) {
		Set<Method> methods = filter(clazz, "_set", "_get");
		for(Method m: methods) {
			int modifiers = m.getModifiers();
			assertTrue( "bad public modifer on " + clazz.getSimpleName(),
					! Modifier.isPublic(modifiers) 
				);
		}
	}

	private Set<Method> filter(Class<?> clazz, String... prefixes) {
		Set<Method> res = new HashSet<>();

		Method[] methods = clazz.getDeclaredMethods();
		for(Method m: methods) {
			for(String pf: prefixes) {
				if ( m.getName().startsWith( pf ) ) {
					res.add( m );
				}
			}
		}

		return res;
	}

}
