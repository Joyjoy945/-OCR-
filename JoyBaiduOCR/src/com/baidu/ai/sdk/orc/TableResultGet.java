/**
 * @ Description:���ʶ����
 * ��ȡ�������ʶ����
 * @ author: Joy
 * @ date:2018��9��17������9:19:19
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
		// �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("result_type", "json");
	    
	    String requestId = "23454320-23255";
	    
	    // ���ʶ����
	    JSONObject res = client.tableResultGet(requestId, options);
	    System.out.println(res.toString(2));
	}
}
