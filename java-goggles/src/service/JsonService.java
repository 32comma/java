package service;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

import model.Tag;

public interface JsonService {
	public static Tag getTag(String jsonFile) {
		Tag tag = null;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(jsonFile));
			Gson gson = new Gson();
			tag = gson.fromJson(bufferedReader, Tag.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return tag;
	}
}
