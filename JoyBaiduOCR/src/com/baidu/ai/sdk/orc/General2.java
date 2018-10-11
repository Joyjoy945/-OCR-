/**
 * @ Description:ͨ������ʶ�𣨸߾��Ȱ棩
�û����������ʶ��ĳ��ͼ�е��������֣������ͨ������ʶ��ò�Ʒ���ȸ��ߣ�����ʶ���ʱ���Գ���
 * @ author: Joy
 * @ date:2018��9��17������8:26:06
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
public class General2 {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("probability", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.basicAccurateGeneral(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.basicAccurateGeneral(file, options);
	    System.out.println(res.toString(2));

	}


}
