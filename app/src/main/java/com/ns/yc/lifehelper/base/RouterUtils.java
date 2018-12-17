package com.ns.yc.lifehelper.base;


import android.os.Bundle;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author ：Create by lichunfu
 * @Date : 2018/12/17
 * Description:
 * * Arouter管理页面跳转的常量工具类
 * 在支持路由的页面上添加注解(必选)
 * 这里的路径需要注意的是至少需要有两级，/xx/xx
 **/
public class RouterUtils {
    public static final String INDEXROUTER = "/lifehelper/";


    public static final String GUIDE = INDEXROUTER + "Guide";
    public   static  final  String SPLASH=INDEXROUTER+"Splash";


    public static void actNotParams(String path) {
        ARouter.getInstance().build(path).navigation();

    }


    public static void actWithParams(String path, String[] strKey, Object[] objects) {
        Postcard postcard = ARouter.getInstance().build(path);
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof String) {
                postcard.withString(strKey[i], (String) objects[i]);
            } else if (objects[i] instanceof Integer) {
                postcard.withInt(strKey[i], (int) objects[i]);
            } else if (objects[i] instanceof Long) {
                postcard.withLong(strKey[i], (Long) objects[i]);
            } else if (objects[i] instanceof Object) {
                postcard.withObject(strKey[i], objects[i]);
            } else if (objects[i] instanceof Boolean) {
                postcard.withBoolean(strKey[i], (Boolean) objects[i]);
            }


        }
        postcard.navigation();
    }


}
