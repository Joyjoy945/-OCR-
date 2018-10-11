/**
 * @ Description:通用文字识别（含位置高精度版）
 * 用户向服务请求识别某张图中的所有文字，并返回文字在图片中的坐标信息，
 * 相对于通用文字识别（含位置信息版）该产品精度更高，但是识别耗时会稍长。
 * @ author: Joy
 * @ date:2018年9月17日下午8:31:00
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
public class General4 {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("detect_direction", "true");
	    options.put("vertexes_location", "true");
	    options.put("probability", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.accurateGeneral(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.accurateGeneral(file, options);
	    System.out.println(res.toString(2));

	}


}
