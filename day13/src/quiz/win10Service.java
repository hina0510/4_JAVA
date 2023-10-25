package quiz;

import java.util.HashMap;

public class win10Service {
	win10DTO dto;
	public win10Service(){
		dto = new win10DTO();
		HashMap map = new HashMap();
		map.put("kkk", "vvv");
		dto.setInfo(map);
	}
}
