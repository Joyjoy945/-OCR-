/**
 * @ Description:表格识别结果
 * 获取表格文字识别结果
 * @ author: Joy
 * @ date:2018年9月17日下午9:19:19
 */
package com.baidu.ai.sdk.orc;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class TableResultGet {
	public void sample(AipOcr client){
		// 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("result_type", "json");
	    
	    String requestId = "23454320-23255";
	    
	    // 表格识别结果
	    JSONObject res = client.tableResultGet(requestId, options);
	    System.out.println(res.toString(2));
	}
}
