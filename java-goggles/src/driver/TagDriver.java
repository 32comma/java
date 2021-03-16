package driver;

import java.util.Map;

import model.Tag;
import service.JsonService;
import service.MapperService;

public class TagDriver implements JsonService, MapperService {
	public TagDriver() {
		Tag[] tagArray = { JsonService.getTag("1.json"), JsonService.getTag("2.json"), JsonService.getTag("3.json") };
		Map<String, Tag> tagMap = MapperService.getMap(tagArray);
		System.out.println(tagMap.toString());

	}
}
