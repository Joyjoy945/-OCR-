/**
 * @ Description:�Զ���ģ������ʶ��
�Զ���ģ������ʶ������԰ٶȹٷ�û���Ƴ���Ӧ��ģ�棬
���ǵ��û���Ҫ��ĳһ�࿨֤/Ʊ�ݣ��緿��֤������֤����Ʊ�ȣ����нṹ������ȡ����ʱ��
����ʹ�øò�Ʒ��������ģ�棬����ʶ��
 * @ author: Joy
 * @ date:2018��9��17������9:14:15
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
public class Custom {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    String templateSign = "Nsdax2424asaAS791823112";
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.custom(image, templateSign, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.custom(file, templateSign, options);
	    System.out.println(res.toString(2));

	}


}
