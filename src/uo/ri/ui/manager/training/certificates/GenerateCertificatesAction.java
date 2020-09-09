package uo.ri.ui.manager.training.certificates;

import uo.alb.util.console.Console;
import uo.alb.util.menu.Action;
import uo.ri.cws.application.service.training.CertificateService;
import uo.ri.cws.conf.Factory;

public class GenerateCertificatesAction implements Action {

	@Override
	public void execute() throws Exception {
		
		Console.println("Generating certificates...");
		
		CertificateService cs = Factory.service.forCertificateService();
		int qty = cs.generateCertificates();
		
		Console.println(qty + " certificates generated");
	}

}
