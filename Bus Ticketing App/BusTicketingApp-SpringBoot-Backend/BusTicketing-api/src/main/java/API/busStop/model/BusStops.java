package API.busStop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "busStop")
public class BusStops {
	
	@Id
	private String busStopId;
	private String busStopName;
	private String description;
	private double distance;
	
	
	public String getBusStopId() {
		return busStopId;
	}
	public void setBusStopId(String busStopId) {
		this.busStopId = busStopId;
	}
	public String getBusStopName() {
		return busStopName;
	}
	public void setBusStopName(String busStopName) {
		this.busStopName = busStopName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
