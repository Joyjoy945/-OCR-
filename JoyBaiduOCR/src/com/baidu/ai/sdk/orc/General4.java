/**
 * @ Description:ͨ������ʶ�𣨺�λ�ø߾��Ȱ棩
 * �û����������ʶ��ĳ��ͼ�е��������֣�������������ͼƬ�е�������Ϣ��
 * �����ͨ������ʶ�𣨺�λ����Ϣ�棩�ò�Ʒ���ȸ��ߣ�����ʶ���ʱ���Գ���
 * @ author: Joy
 * @ date:2018��9��17������8:31:00
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
public class General4 {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("recognize_granularity", "big");
	    options.put("detect_direction", "true");
	    options.put("vertexes_location", "true");
	    options.put("probability", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.accurateGeneral(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.accurateGeneral(file, options);
	    System.out.println(res.toString(2));

	}


}
