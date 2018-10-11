/**
 * @ Description:ͨ������ʶ�𣨺���Ƨ�ְ棩
	ĳЩ�����У�ͼƬ�е����Ĳ����г����֣�����������Ƨ�֣�
	��ʱ�û���Ҫ�Ը�ͼ��������ʶ��Ӧʹ��ͨ������ʶ�𣨺���Ƨ�ְ棩��
 * @ author: Joy
 * @ date:2018��9��17������8:34:24
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
public class General5 {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("probability", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.enhancedGeneral(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.enhancedGeneral(file, options);
	    System.out.println(res.toString(2));

	    
	   
		// ͨ������ʶ�𣨺���Ƨ�ְ棩, ͼƬ����ΪԶ��urlͼƬ
	    String url = "";
	    JSONObject res1 = client.enhancedGeneralUrl(url , options);
	    System.out.println(res1.toString(2));

	}


}
