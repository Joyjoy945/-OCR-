/**
 * @ Description:���֤ʶ��
�û����������ʶ�����֤�����֤ʶ���������ͱ��档
 * @ author: Joy
 * @ date:2018��9��17������8:58:20
 */
package com.baidu.ai.sdk.orc;

import java.util.HashMap;

import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class IdCard {
	public void sample(AipOcr client) {
	    // �����ѡ�������ýӿ�
	    HashMap<String, String> options = new HashMap<String, String>();
	    options.put("detect_direction", "true");
	    options.put("detect_risk", "false");
	    
	    String idCardSide = "front";
	    
	    // ����Ϊ����ͼƬ·��
	    String image = "E://TestP//IDCard4.jpg";
	    JSONObject res = client.idcard(image, idCardSide, options);
	    System.out.println(res.toString(2));

	    // ����Ϊ����ͼƬ����������
	    //byte[] file = AuthServiceForSdk.readImageFile(image);
	    //res = client.idcard(file, idCardSide, options);
	    //System.out.println(res.toString(2));

	}


}
