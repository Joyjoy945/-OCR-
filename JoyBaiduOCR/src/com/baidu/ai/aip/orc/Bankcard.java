/**
 * @ Description:���п�ʶ��
 * @ author: Joy
 * @ date:2018��9��12������9:00:11
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
public class Bankcard {
	  /**
     * ��Ҫ��ʾ���������蹤����
     * FileUtil,Base64Util,HttpUtil,GsonUtils���
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * ����
     */
    public static void main(String[] args) {
        // ���п�ʶ��url
        String bankcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/receipt";
        // ����ͼƬ·��
        String filePath = "E://TestP//bankcard.jpg";//"#####�����ļ�·��#####"
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * ���ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
             */
            String accessToken = AuthService.getAuth();//"#####���ü�Ȩ�ӿڻ�ȡ��token#####"
            String result = HttpUtil.post(bankcardIdentificate, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
