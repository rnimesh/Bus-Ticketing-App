package API.busStop.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import API.busStop.model.BusStops;



public interface BusStopRepository extends MongoRepository<BusStops, String >{


	


}
