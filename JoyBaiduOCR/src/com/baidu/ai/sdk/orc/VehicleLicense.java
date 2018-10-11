/**
 * @ Description:��ʻ֤ʶ��
�Ի�������ʻ֤�������йؼ��ֶν���ʶ��
 * @ author: Joy
 * @ date:2018��9��17������9:08:39
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
public class VehicleLicense {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("accuracy", "normal");
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.vehicleLicense(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.vehicleLicense(file, options);
	    System.out.println(res.toString(2));

	}


}
