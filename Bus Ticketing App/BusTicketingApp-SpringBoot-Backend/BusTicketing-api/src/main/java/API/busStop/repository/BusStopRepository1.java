package API.busStop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import API.busStop.model.BusStops;
import API.journey.model.Journey;




public interface BusStopRepository1 extends CrudRepository<BusStops, String>{
	

	public List<BusStops> findBusStopsByBusStopName(String busStopName);
	public List<BusStops> findAll();

}
