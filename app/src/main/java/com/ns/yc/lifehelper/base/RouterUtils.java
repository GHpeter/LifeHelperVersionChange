package com.ns.yc.lifehelper.base;


import android.app.Activity;
import android.content.Context;
import android.os.Build;

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
    public static final String SPLASH = INDEXROUTER + "Splash";

    public static final String MAIN = INDEXROUTER + "Main";
    public static final String SELECTFOLLOW = INDEXROUTER + "SelectFollow";
    public static final String WEBVIEW = INDEXROUTER + "Webview";
    public static final String MEFEEDBACK = INDEXROUTER + "MeFeedBack";
    public static final String ABOUTME = INDEXROUTER + "AboutMe";
    public static final String MEPERSON = INDEXROUTER + "MePerson";
    public static final String MESETTING = INDEXROUTER + "MeSetting";
    public static final String ZHIHUNEWS = INDEXROUTER + "ZhiHuNews";
    public static final String VIDEONEWS = INDEXROUTER + "VideoNews";


    public static final String WYNEWS = INDEXROUTER + "WyNews";
    public  static  final  String TXNEWS=INDEXROUTER+"TxNews";
    public  static  final  String MYKNOWLEDGE=INDEXROUTER+"MyKnowledge";
    public static void actNotParams(String path) {
        ARouter.getInstance().build(path).navigation();

    }

    public static void actNotParamsWithAnimation(Context context, String path, int enterAnim, int exitAnim) {
        ARouter.getInstance().build(path).withTransition(enterAnim, exitAnim).navigation();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN && context instanceof Activity) {
            ((Activity) context).overridePendingTransition(enterAnim, exitAnim);
        }
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

    /**
     * @param context:上下文
     * @param path:router路由路径
     * @param strKey:key值数组
     * @param objects:values值数组
     * @param enterAnim:入场动画
     * @param exitAnim:退出动画
     */
    public static void actWithParamsAndAnimation(Context context, String path, String[] strKey,
                                                 Object[] objects,
                                                 int enterAnim, int exitAnim) {
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

        postcard.withTransition(enterAnim, exitAnim).navigation();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN && context instanceof Activity) {
            ((Activity) context).overridePendingTransition(enterAnim, exitAnim);
        }
    }


}
