/**
 * @ Description:网络图片文字识别
用户向服务请求识别一些网络上背景复杂，特殊字体的文字。
 * @ author: Joy
 * @ date:2018年9月17日下午8:56:20
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
public class WebPicture {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.webImage(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.webImage(file, options);
	    System.out.println(res.toString(2));

	    
	    // 网络图片文字识别, 图片参数为远程url图片
	    String url = "";
	    JSONObject res1 = client.webImageUrl(url, options);
	    System.out.println(res1.toString(2));

	}


}
