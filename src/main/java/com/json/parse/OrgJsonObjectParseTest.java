package com.json.parse;

import org.json.JSONObject;

public class OrgJsonObjectParseTest {

	public static void main(String[] args) {
		//json对象
		String json = "{\"id\":\"07\",\"language\": \"C++\",\"edition\": \"second\",\"author\": \"E.Balagurusamy\"}";
		JSONObject jsonObject = new JSONObject(json);  //JSONObject构造对象
		String id=jsonObject.getString("id");  //获取key对应的value
		String language=jsonObject.getString("language");
		String edition=jsonObject.getString("edition");
		//输出结果
		System.out.println(id + "\t" + language + "\t" + edition);
	}
}
