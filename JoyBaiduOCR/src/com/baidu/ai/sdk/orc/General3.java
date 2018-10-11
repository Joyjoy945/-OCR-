/**
 * @ Description:通用文字识别（含位置信息版）
用户向服务请求识别某张图中的所有文字，并返回文字在图中的位置信息。
 * @ author: Joy
 * @ date:2018年9月17日下午8:29:36
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
public class General3 {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("vertexes_location", "true");
	    options.put("probability", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.general(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.general(file, options);
	    System.out.println(res.toString(2));

	    
	    String url = "";
		// 通用文字识别（含位置信息版）, 图片参数为远程url图片
	    JSONObject res1 = client.generalUrl(url , options);
	    System.out.println(res1.toString(2));

	}


}
