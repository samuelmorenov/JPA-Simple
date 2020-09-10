package uo.ri.cws;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uo.ri.cws.domain.ConstructorTests;
import uo.ri.cws.domain.IsCertifiedForTests;
import uo.ri.cws.domain.PackageAccessorTests;
import uo.ri.cws.persistence.PersistenceTest;

@RunWith(Suite.class)
@SuiteClasses({
	PersistenceTest.class,
	PackageAccessorTests.class,
	ConstructorTests.class,
	IsCertifiedForTests.class
})
public class AllTests { }
