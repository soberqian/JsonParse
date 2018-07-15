package com.json.parse;


import java.util.List;

import com.google.gson.Gson;
import com.model.BookModel;
import com.model.BookSummaryModel;

public class GsonParseComplexTest {

	public static void main(String[] args) {
		//复杂一点的JSON数据
		String json = "{\"goodRateShow\":99,\"poorRateShow\":1,\"poorCountStr\":\"500+\",\"book\": [{\"id\":\"01\",\"language\": \"Java\",\"edition\": \"third\",\"author\": \"Herbert Schildt\"},{\"id\":\"07\", \"language\": \"C++\",\"edition\": \"second\",\"author\": \"E.Balagurusamy\"}]}";
		Gson gson = new Gson();  //初始化操作
		BookSummaryModel summarymodel = gson.fromJson(json, BookSummaryModel.class); //转化成Java对象
		//对象中拿到集合
		List<BookModel> listmodel = summarymodel.getBook();
		//输出数据
		for (BookModel model : listmodel) {
			System.out.println(summarymodel.getGoodRateShow()+"\t"+ summarymodel.getPoorCountStr() + "\t" + model.getId() + "\t" + model.getLanguage() + "\t" + model.getEdition());
		}
	}
}
