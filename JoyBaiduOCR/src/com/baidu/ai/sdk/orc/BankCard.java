/**
 * @ Description:银行卡识别
识别银行卡并返回卡号和发卡行。
 * @ author: Joy
 * @ date:2018年9月17日下午8:59:21
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
public class BankCard {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.bankcard(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.bankcard(file, options);
	    System.out.println(res.toString(2));

	}


}
