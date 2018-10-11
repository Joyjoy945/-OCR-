/**
 * @ Description:车牌识别
识别机动车车牌，并返回签发地和号牌。
 * @ author: Joy
 * @ date:2018年9月17日下午9:09:59
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
public class PlateLicense {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("multi_detect", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.plateLicense(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.plateLicense(file, options);
	    System.out.println(res.toString(2));

	}


}
