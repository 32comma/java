package service;

import java.util.HashMap;
import java.util.Map;

import model.Tag;

public interface MapperService {
	public static Map<String, Tag> getMap(Tag []  list) {
		Map<String, Tag> tagMap = new HashMap<String, Tag>();
		for (Tag t : list) {
			tagMap.put(t.getKey(), t);

		}
		return tagMap;
	}
}
