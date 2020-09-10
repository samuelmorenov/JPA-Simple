package cws.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cws.domain.Certificate;
import cws.domain.Mechanic;
import cws.domain.VehicleType;

public class PersistenceTest {

	private EntityManagerFactory factory;
	private Mechanic mechanic;

	@Before
	public void setUp() {
		factory = Persistence.createEntityManagerFactory("carworkshop");
		List<Object> graph = createGraph();
		persistGraph(graph);
	}

	@After
	public void tearDown() {
		removeGraph();
		factory.close();
	}

	@Test
	public void testMechanic() {
		EntityManager mapper = factory.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();

		Mechanic cl = mapper.merge(mechanic);

		assertNotNull(cl.getId());
		assertEquals(cl.getSurname(), "apellidos");
		assertEquals(cl.getName(), "nombre");
		assertEquals(cl.getDni(), "dni");

		trx.commit();
		mapper.close();
	}

	protected List<Object> createGraph() {

		mechanic = new Mechanic("dni", "nombre", "apellidos");

		VehicleType vehicleType = new VehicleType("coche", 50.0);
		Certificate certificate = new Certificate(mechanic, vehicleType);

		List<Object> res = new LinkedList<Object>();

		res.add(vehicleType);
		res.add(mechanic);
		res.add(certificate);

		return res;
	}

	private void persistGraph(List<Object> graph) {
		EntityManager mapper = factory.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();

		for (Object o : graph) {
			mapper.persist(o);
		}

		trx.commit();
		mapper.close();
	}

	private void removeGraph() {
		EntityManager mapper = factory.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();

		List<Object> merged = mergeGraph(mapper);

		for (Object o : merged) {
			mapper.remove(o);
		}

		trx.commit();
		mapper.close();
	}

	private List<Object> mergeGraph(EntityManager mapper) {
		List<Object> res = new LinkedList<Object>();

		return res;
	}

}
