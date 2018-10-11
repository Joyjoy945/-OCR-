/**
 * @ Description:AipOcr是Optical Character Recognition的Java客户端，
		为使用Optical Character Recognition的开发人员提供了一系列的交互方法。
 * @ author: Joy
 * @ date:2018年9月17日下午7:31:54
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
	//设置APPID/AK/SK
    public static final String APP_ID = "11775091";
    public static final String API_KEY = "YVyW29vqLPpPNyDfx8A0S05Q";
    public static final String SECRET_KEY = "Hvlt6pGLLd4eQ3SE0j5Av7bHVTDMWDqu";

    public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        //int proxy_port = 0 ;
		// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", proxy_port );  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
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
