package com.imooc.o2o.util;

import java.util.Locale;

public class PathUtil {
    //获取文件分隔符
    private static String seperator = System.getProperty("file.separator");

    //获取绝对路径
    public static String getImgBasePath(){
        //获取系统名称
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath = "D:/projectdev/image/";
        }else {
            basePath = "/user/admin/Desktop/image/";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }

    //获取相对路径
    public static String getShopImagePath(long shopId){
        String imagePath = "/upload/item/shop" + shopId + "/";
        return imagePath.replace("/",seperator);
    }

}
