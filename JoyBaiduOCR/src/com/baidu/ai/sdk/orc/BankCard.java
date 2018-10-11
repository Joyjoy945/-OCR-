/**
 * @ Description:���п�ʶ��
ʶ�����п������ؿ��źͷ����С�
 * @ author: Joy
 * @ date:2018��9��17������8:59:21
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
public class BankCard {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.bankcard(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.bankcard(file, options);
	    System.out.println(res.toString(2));

	}


}
