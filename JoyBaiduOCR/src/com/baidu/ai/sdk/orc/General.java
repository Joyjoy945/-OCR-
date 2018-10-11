/**
 * @ Description:ͨ������ʶ��   �û����������ʶ��ĳ��ͼ�е���������
 * @ author: Joy
 * @ date:2018��9��17������8:20:51
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
public class General {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("language_type", "CHN_ENG");
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    options.put("probability", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "E:\\find.png";
	    JSONObject res = client.basicGeneral(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.basicGeneral(file, options);
	    System.out.println(res.toString(2));

	    
	    String url="";
		// ͨ������ʶ��, ͼƬ����ΪԶ��urlͼƬ
	    JSONObject res1 = client.basicGeneralUrl(url, options);
	    System.out.println(res1.toString(2));

	}

	
}
