package API.route.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="price")
public class price {


	@Id
	private String ID;
	
	private Double distance;
	private Double nomalPrice;
	private Double luxuryPrice;
	private Double semiLuxuryPrice;
	
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Double getNomalPrice() {
		return nomalPrice;
	}
	public void setNomalPrice(Double nomalPrice) {
		this.nomalPrice = nomalPrice;
	}
	public Double getLuxuryPrice() {
		return luxuryPrice;
	}
	public void setLuxuryPrice(Double luxuryPrice) {
		this.luxuryPrice = luxuryPrice;
	}
	public Double getSemiLuxuryPrice() {
		return semiLuxuryPrice;
	}
	public void setSemiLuxuryPrice(Double semiLuxuryPrice) {
		this.semiLuxuryPrice = semiLuxuryPrice;
	}
	
	
	
	
}
