/**
 * @ Description:表格文字识别
自动识别表格线及表格内容，结构化输出表头、表尾及每个单元格的文字内容。
表格文字识别接口为异步接口，分为两个API：提交请求接口、获取结果接口。
 * @ author: Joy
 * @ date:2018年9月17日下午9:17:38
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
public class TableRecognitionAsync {
	public void sample(AipOcr client) {
	    // 传入可选参数调用接口
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    
	    // 参数为本地图片路径
	    String image = "test.jpg";
	    JSONObject res = client.tableRecognitionAsync(image, options);
	    System.out.println(res.toString(2));

	    // 参数为本地图片二进制数组
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.tableRecognitionAsync(file, options);
	    System.out.println(res.toString(2));

	}


}
