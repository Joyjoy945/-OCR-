/**
 * @ Description:���ʶ����ѯ�ӿ�
 * ���ñ��ʶ�����󣬻�ȡ����id֮����ѯ���ñ��ʶ���ȡ����Ľӿ�
 * @ author: Joy
 * @ date:2018��9��17������9:21:32
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
		//�첽�ӿ�
		
		String file = "";
		//ʹ�÷�װ��ͬ����ѯ�ӿ�
		JSONObject jsonres = client.tableRecognizeToJson(file , 20000);
		System.out.println(jsonres.toString(2));
		
		JSONObject excelres = client.tableRecognizeToExcelUrl(file, 20000);
		System.out.println(excelres.toString(2));
	}
}
