/**
 * @ Description:含位置高精度版
 * @ author: Joy
 * @ date:2018年9月12日下午8:56:35
 */
package com.baidu.ai.aip.orc;

import java.net.URLEncoder;

import com.baidu.ai.aip.util.FileUtil;
import com.baidu.ai.aip.util.HttpUtil;
import com.baidu.ai.api.auth.AuthService;
import com.baidu.aip.util.Base64Util;

/**
 * @author Joy
 *
 */
public class General2 {
	 /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static void main(String[] args) {
        // 通用识别url
        String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/general";
        // 本地图片路径
        String filePath = "#####本地文件路径#####";//E:\\find.png
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = AuthService.getAuth();//#####调用鉴权接口获取的token#####
            String result = HttpUtil.post(otherHost, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
