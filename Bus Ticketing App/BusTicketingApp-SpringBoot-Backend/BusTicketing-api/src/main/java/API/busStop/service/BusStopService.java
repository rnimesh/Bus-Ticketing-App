package API.busStop.service;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import API.busStop.model.BusStops;
import API.user.model.Users;




@Service
public class BusStopService{
	
	private static final AtomicInteger count = new AtomicInteger(0);
	
	@Autowired
	private API.busStop.repository.BusStopRepository busRepository;
	private API.busStop.repository.BusStopRepository1 busRepository1;
	
	
	public BusStops findBusStop(String busStopName) {
		
	return busRepository.findOne(busStopName);
	}
	
	
	public List<BusStops> getAllBusStops() {
	List<BusStops> busStopList = null;
	busStopList = busRepository.findAll();
	return busStopList;
	
	}
	
	
	
	public void addBusStop(BusStops busStopIns) {
		
		busStopIns.setBusStopId(String.valueOf(count.incrementAndGet()));
		busRepository.save(busStopIns);  
	}

	public void updateBusStop(BusStops busStopIns) {
		busStopIns.setBusStopId( String.valueOf( count.incrementAndGet() ) ) ;
		busRepository.save(busStopIns);  
	}
//	
//	@SuppressWarnings("finally")
//	public BusStops getOneBusStop(BusStops busStopIns) {
//		
//		BusStops BusStop = null;
//		try {
//			List<BusStops> busStopList = busRepository.findAll();
//			for(BusStops busIns: busStopList) {
//				if(busIns.getBusStopId().equals(busStopIns.getBusStopId().toString())) {
//				
//					BusStop =  busIns;
//					break;
//				}
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			return BusStop;
//		}
//	}

}
