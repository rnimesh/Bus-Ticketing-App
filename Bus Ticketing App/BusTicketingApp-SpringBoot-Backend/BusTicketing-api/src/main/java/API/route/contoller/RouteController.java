package API.route.contoller;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import API.route.service.RouteFactory;

@RestController
public class RouteController {

	@Autowired
	private RouteFactory algorithmFactory;

	@Autowired
	Validator validator;

	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody String course) throws Exception {
	}
	
	@RequestMapping(value = "/route/factory", method = RequestMethod.GET)
	public void springBeanFactoryPattern() throws Exception {

		// Spring managed bean factory design pattern testing
		System.out.println("Nomal bus price is : " + algorithmFactory.getAlgorithm("NomalBus").applyAlgorithm(10));
		System.out.println("Luxury bus price is : " + algorithmFactory.getAlgorithm("LuxuryBus").applyAlgorithm(10));
		System.out.println("Semi Luxury bus price is : " + algorithmFactory.getAlgorithm("SemiLuxuryBus").applyAlgorithm(10));
		
		
	}
	
	@Lookup
	public Validator getValidator() {
		// Spring will override this method and gives the bean validator from
		// the context;
		return null;
	}

	
	
}
