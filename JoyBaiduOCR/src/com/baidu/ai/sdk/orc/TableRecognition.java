/**
 * @ Description:表格识别轮询接口
 * 调用表格识别请求，获取请求id之后轮询调用表格识别获取结果的接口
 * @ author: Joy
 * @ date:2018年9月17日下午9:21:32
 */
package com.baidu.ai.sdk.orc;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class TableRecognition {
	public void tableRecognition(AipOcr client){
		//异步接口
		
		String file = "";
		//使用封装的同步轮询接口
		JSONObject jsonres = client.tableRecognizeToJson(file , 20000);
		System.out.println(jsonres.toString(2));
		
		JSONObject excelres = client.tableRecognizeToExcelUrl(file, 20000);
		System.out.println(excelres.toString(2));
	}
}
