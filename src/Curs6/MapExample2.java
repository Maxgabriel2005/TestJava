package Curs6;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(404, "Not Found");
		map.put(405, "Method not allowed");
		map.put(401, "Unauthorised");
		
		
		System.out.println(map);
		
		
        Map<Integer, String> altaMapa = new HashMap<>();
		
		altaMapa.put(200, "OK");
		altaMapa.put(204, "No content");
		altaMapa.put(201, "Created");
		
		System.out.println(altaMapa);
		map.putAll(altaMapa);
		System.out.println(map);
		

	}

}
