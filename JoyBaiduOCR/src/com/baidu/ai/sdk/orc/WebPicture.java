/**
 * @ Description:����ͼƬ����ʶ��
�û����������ʶ��һЩ�����ϱ������ӣ�������������֡�
 * @ author: Joy
 * @ date:2018��9��17������8:56:20
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
public class WebPicture {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("detect_language", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.webImage(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.webImage(file, options);
	    System.out.println(res.toString(2));

	    
	    // ����ͼƬ����ʶ��, ͼƬ����ΪԶ��urlͼƬ
	    String url = "";
	    JSONObject res1 = client.webImageUrl(url, options);
	    System.out.println(res1.toString(2));

	}


}
