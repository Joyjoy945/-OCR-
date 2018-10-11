/**
 * @ Description:�������ʶ��
�Զ�ʶ�����߼�������ݣ��ṹ�������ͷ����β��ÿ����Ԫ����������ݡ�
�������ʶ��ӿ�Ϊ�첽�ӿڣ���Ϊ����API���ύ����ӿڡ���ȡ����ӿڡ�
 * @ author: Joy
 * @ date:2018��9��17������9:17:38
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
public class TableRecognitionAsync {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "test.jpg";
	    JSONObject res = client.tableRecognitionAsync(image, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    byte[] file = AuthServiceForSdk.readImageFile(image);
	    res = client.tableRecognitionAsync(file, options);
	    System.out.println(res.toString(2));

	}


}
