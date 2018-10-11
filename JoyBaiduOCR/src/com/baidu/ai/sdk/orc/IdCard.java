/**
 * @ Description:身份证识别
用户向服务请求识别身份证，身份证识别包括正面和背面。
 * @ author: Joy
 * @ date:2018年9月17日下午8:58:20
 */
package com.baidu.ai.sdk.orc;

import java.util.HashMap;

import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class IdCard {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("detect_risk", "false");
	    
	    String idCardSide = "front";
	    
	    // 参数为本地图片路径
	    String image = "E://TestP//IDCard4.jpg";
	    JSONObject res = client.idcard(image, idCardSide, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    //byte[] file = AuthServiceForSdk.readImageFile(image);
	    //res = client.idcard(file, idCardSide, options);
	    //System.out.println(res.toString(2));

	}


}
