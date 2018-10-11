/**
 * @ Description:��ʻ֤ʶ��
�Ի�������ʻ֤���йؼ��ֶν���ʶ��
 * @ author: Joy
 * @ date:2018��9��17������9:07:19
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
public class DrivingLicense {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.drivingLicense(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.drivingLicense(file, options);
	    System.out.println(res.toString(2));

	}


}
