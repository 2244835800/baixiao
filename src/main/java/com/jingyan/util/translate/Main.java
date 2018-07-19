package com.jingyan.util.translate;
import java.io.UnsupportedEncodingException;

import net.sf.json.*;
public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
	
//	20171019000089382 grBGzidRW32QVeVkvpXQ
	//20171020000089887 9AxIAdnErNLCW53bFBkt 盈冠免费的
	//有账号20171022000090205 L3A1rOGh_EJM5_5CSgN2
    private static final String APP_ID = "20171022000090205";
    private static final String SECURITY_KEY = "L3A1rOGh_EJM5_5CSgN2";

    public static String translate(String query) throws UnsupportedEncodingException {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String data=api.getTransResult(query, "auto", "en");
        JSONObject ob=JSONObject.fromObject(data);
        JSONArray trans_result=(JSONArray) ob.get("trans_result");
        JSONObject trans_result_content=(JSONObject) trans_result.get(0);
        String yiwen=(String) trans_result_content.get("dst");
        System.out.println(ob);
        System.out.println( ob.get("trans_result"));
        System.out.println(trans_result_content);
        System.out.println(trans_result_content.get("dst"));
        return yiwen;
    }

}
