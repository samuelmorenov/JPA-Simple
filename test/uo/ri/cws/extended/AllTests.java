package uo.ri.cws.extended;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	uo.ri.cws.extended.domain.PackageAccessorTests.class,
	uo.ri.cws.extended.certificate.ConstructorTests.class,
	uo.ri.cws.extended.mechanic.IsCertifiedForTests.class
})
public class AllTests { }
