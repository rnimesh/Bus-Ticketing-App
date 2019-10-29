package API.route.service;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import API.route.repository.BusRoute;

@Service
public class RouteFactory {
	
	/** The algorithms. */
	@Autowired

	private List<BusRoute> algorithms;
	
	
	/** The algorithms cache. */
	private final Map<String, BusRoute> algorithmsCache = new HashMap<>();

	/**
	 * Inits the my service cache.
	 */
	
	@PostConstruct
	public void initMyServiceCache() {
		for (BusRoute algorithm : algorithms) {
			algorithmsCache.put(algorithm.getBusType(), algorithm);
		}
	}
	
	/**
	 * Factory method to get the algorithm instance depending upon algorithm
	 * type.
	 *
	 * @param algorithmType
	 *            the algorithm type
	 * @return Algorithm
	 * @throws PlatformException
	 *             the platform exception
	 */
	public BusRoute getAlgorithm(String algorithmType) throws Exception {
		BusRoute algorithm = algorithmsCache.get(algorithmType);
		if (null == algorithm) {
			throw new IllegalArgumentException("No bus type found");
		}
		return algorithm;
	}
	


}
