/**
 * @ Description:通用文字识别（含生僻字版）
	某些场景中，图片中的中文不光有常用字，还包含了生僻字，
	这时用户需要对该图进行文字识别，应使用通用文字识别（含生僻字版）。
 * @ author: Joy
 * @ date:2018年9月17日下午8:34:24
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
public class General5 {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("probability", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.enhancedGeneral(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.enhancedGeneral(file, options);
	    System.out.println(res.toString(2));

	    
	   
		// 通用文字识别（含生僻字版）, 图片参数为远程url图片
	    String url = "";
	    JSONObject res1 = client.enhancedGeneralUrl(url , options);
	    System.out.println(res1.toString(2));

	}


}
