/**
 * @ Description:���֤ʶ��
 * @ author: Joy
 * @ date:2018��9��12������8:58:42
 */
package com.baidu.ai.aip.orc;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import com.baidu.ai.aip.util.FileUtil;
import com.baidu.ai.aip.util.HttpUtil;
import com.baidu.ai.api.auth.AuthService;
import com.baidu.aip.util.Base64Util;

/**
 * @author Joy
 *
 */
public class Idcard {
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
        // ���֤ʶ��url
        String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
        // ����ͼƬ·��
        String filePath = "//#####�����ļ�·��#####";//#####�����ļ�·��#####��eg:E://IDCard.jpg
        
        
//        
//        ��ɫ��Ƭת�ڰ�
//        
//        JFileChooser jChooser = new JFileChooser();
//        ����Ĭ�ϵĴ�Ŀ¼,�������Ļ�����window��Ĭ��Ŀ¼(�ҵ��ĵ�)
//        jChooser.setCurrentDirectory(new File("E://"));
//        ��һ���Ի���
//        int index = jChooser.showDialog(null, "���ļ�");
//        if (index == JFileChooser.APPROVE_OPTION) {
//        	filePath = jChooser.getSelectedFile().getAbsolutePath();
//        }
//        Image img = new ImageIcon(filePath).getImage();
//        BufferedImage bfi = new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_RGB);
//        bfi.getGraphics().drawImage(img, 0, 0,null);
//        for(int y=0;y<bfi.getHeight();y++) 
//            for(int x=0;x<bfi.getWidth();x++) {
//                Color pixel = new Color(bfi.getRGB(x, y));
//                bfi.setRGB(x, y,new Color(getGray(pixel),getGray(pixel),getGray(pixel)).getRGB());
//            }
//        try {
//			ImageIO.write(bfi, "JPEG", new File("IDCard3.jpg"));
//			System.out.println("��Ƭת�ڰ׳ɹ�la!!!!!!!");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
        
        
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            // ʶ�����֤����id_card_side=front;ʶ�����֤����id_card_side=back;
            String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
                    + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * ���ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
             */
            String accessToken = AuthService.getAuth();//#####���ü�Ȩ�ӿڻ�ȡ��token#####
            String result = HttpUtil.post(idcardIdentificate, accessToken, params);
            System.out.println(result);
            
            //���˸��������룬�ţ�ȥ��Ҳ����
            int count = 1;
            for (int i = 0; i < result.length();i++){
            	System.out.print(result.charAt(i));
            	count++;
            	if (count%120 == 0){
            		System.out.print("\n");
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static int getGray(Color pixel) {
        return (pixel.getRed()*30+pixel.getGreen()*60+pixel.getBlue()*10)/100;
    }
}
