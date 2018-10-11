/**
 * @ Description:AipOcr��Optical Character Recognition��Java�ͻ��ˣ�
		Ϊʹ��Optical Character Recognition�Ŀ�����Ա�ṩ��һϵ�еĽ���������
 * @ author: Joy
 * @ date:2018��9��17������7:31:54
 */
package com.baidu.ai.sdk.auth;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

/**
 * @author Joy
 *
 */
public class AuthServiceForSdk {
	//����APPID/AK/SK
    public static final String APP_ID = "11775091";
    public static final String API_KEY = "YVyW29vqLPpPNyDfx8A0S05Q";
    public static final String SECRET_KEY = "Hvlt6pGLLd4eQ3SE0j5Av7bHVTDMWDqu";

    public static void main(String[] args) {
        // ��ʼ��һ��AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // ��ѡ�������������Ӳ���
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        //int proxy_port = 0 ;
		// ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
        //client.setHttpProxy("proxy_host", proxy_port );  // ����http����
        //client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

        // ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
        // Ҳ����ֱ��ͨ��jvm�����������ô˻�������
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // ���ýӿ�
        String path = "IDCard3.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        
    }
    
    /**
	 * @param image
	 * @return
	 */
	public static byte[] readImageFile(String image) {
		// TODO Auto-generated method stub
		return null;
	}

}
