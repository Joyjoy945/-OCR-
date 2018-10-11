/**
 * @ Description:ͨ������ʶ�𣨺�λ����Ϣ�棩
�û����������ʶ��ĳ��ͼ�е��������֣�������������ͼ�е�λ����Ϣ��
 * @ author: Joy
 * @ date:2018��9��17������8:29:36
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
public class General3 {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("vertexes_location", "true");
	    options.put("probability", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.general(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.general(file, options);
	    System.out.println(res.toString(2));

	    
	    String url = "";
		// ͨ������ʶ�𣨺�λ����Ϣ�棩, ͼƬ����ΪԶ��urlͼƬ
	    JSONObject res1 = client.generalUrl(url , options);
	    System.out.println(res1.toString(2));

	}


}
