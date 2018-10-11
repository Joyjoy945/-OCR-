/**
 * @ Description:ͨ��Ʊ��ʶ��
�û����������ʶ��ҽ��Ʊ�ݡ���Ʊ����ʿƱ�����ձ�����Ʊ����ͼƬ�е��������֣�
������������ͼ�е�λ����Ϣ��
 * @ author: Joy
 * @ date:2018��9��17������9:12:40
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
public class Receipt {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("probability", "true");
	    options.put("accuracy", "normal");
	    options.put("detect_direction", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.receipt(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.receipt(file, options);
	    System.out.println(res.toString(2));

	}


}
