package cws;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cws.domain.ConstructorTests;
import cws.domain.IsCertifiedForTests;
import cws.domain.PackageAccessorTests;
import cws.persistence.PersistenceTest;

@RunWith(Suite.class)
@SuiteClasses({
	PersistenceTest.class,
	PackageAccessorTests.class,
	ConstructorTests.class,
	IsCertifiedForTests.class
})
public class AllTests { }
