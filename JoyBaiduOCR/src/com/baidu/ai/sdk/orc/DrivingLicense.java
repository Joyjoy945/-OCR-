/**
 * @ Description:驾驶证识别
对机动车驾驶证所有关键字段进行识别
 * @ author: Joy
 * @ date:2018年9月17日下午9:07:19
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
public class DrivingLicense {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.drivingLicense(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.drivingLicense(file, options);
	    System.out.println(res.toString(2));

	}


}
