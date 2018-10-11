/**
 * @ Description:通用票据识别
用户向服务请求识别医疗票据、发票、的士票、保险保单等票据类图片中的所有文字，
并返回文字在图中的位置信息。
 * @ author: Joy
 * @ date:2018年9月17日下午9:12:40
 */
package com.baidu.ai.sdk.orc;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.ai.sdk.auth.AuthServiceForSdk;
import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class Receipt {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("probability", "true");
	    options.put("accuracy", "normal");
	    options.put("detect_direction", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.receipt(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.receipt(file, options);
	    System.out.println(res.toString(2));

	}


}
