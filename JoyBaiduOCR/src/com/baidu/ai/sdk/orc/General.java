/**
 * @ Description:通用文字识别   用户向服务请求识别某张图中的所有文字
 * @ author: Joy
 * @ date:2018年9月17日下午8:20:51
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
public class General {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("probability", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "E:\\find.png";
	    JSONObject res = client.basicGeneral(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.basicGeneral(file, options);
	    System.out.println(res.toString(2));

	    
	    String url="";
		// 通用文字识别, 图片参数为远程url图片
	    JSONObject res1 = client.basicGeneralUrl(url, options);
	    System.out.println(res1.toString(2));

	}

	
}
