package API.busStop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import API.busStop.model.BusStops;
import API.user.model.Users;


@RestController
@RequestMapping
public class BusStopContoller {
	
	@Autowired
	private API.busStop.service.BusStopService bService;
	

	@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000"})
	
	@RequestMapping(value = "/busStop/add", method = RequestMethod.POST)
	public void addBusStop(@Validated @RequestBody BusStops busStopIns) {
		
		try {
			bService.addBusStop(busStopIns);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/busStop", method = RequestMethod.GET)
	public List<BusStops>ViewAllBusStops() {
		List<BusStops> busStoplist = null;
		try {
			busStoplist = bService.getAllBusStops();  
		} catch(Exception e) {
			e.printStackTrace();
		}
		return busStoplist;
	}
	
	

//	@RequestMapping(value = "/busStop/{id}", method = RequestMethod.GET)
//	public BusStops viewBusStop(@PathVariable String busStopName){
//		BusStops BusStops = null;
//		try {
//			BusStops = bService.findBusStop(busStopName);  
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		return BusStops;
//	}
//	
//	
//	@RequestMapping(value = "/busStops/view", method = RequestMethod.GET)
//	public List<BusStops> viewAllBusStops(){
//		List<BusStops> BusStopsList = null;
//		try {
//			BusStopsList = bService.getAllBusStops();  
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return BusStopsList;
//	}

}
