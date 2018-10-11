/**
 * @ Description:自定义模版文字识别
自定义模版文字识别，是针对百度官方没有推出相应的模版，
但是当用户需要对某一类卡证/票据（如房产证、军官证、火车票等）进行结构化的提取内容时，
可以使用该产品快速制作模版，进行识别。
 * @ author: Joy
 * @ date:2018年9月17日下午9:14:15
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
public class Custom {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    String templateSign = "Nsdax2424asaAS791823112";
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.custom(image, templateSign, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.custom(file, templateSign, options);
	    System.out.println(res.toString(2));

	}


}
