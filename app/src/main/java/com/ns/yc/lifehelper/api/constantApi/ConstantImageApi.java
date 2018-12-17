package com.ns.yc.lifehelper.api.constantApi;

import com.ns.yc.lifehelper.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/6/6
 * 描    述：图片接口
 * 修订历史：
 * ================================================
 */
public class ConstantImageApi {

    // 电影栏头部的图片
    public static final String MOVIE_URL_01 = "http://ojyz0c8un.bkt.clouddn.com/one_01.png";
    /**
     * 注意：
     * 集合类如果仅仅有添加元素的方法，而没有相应的删除机制，导致内存被占用。
     * 如果这个集合类是全局性的变量 (比如类中的静态属性，全局性的 map 等即有静态引用或 final 一直指向它)，
     * 那么没有相应的删除机制，很可能导致集合所占用的内存只增不减。
     * 这里做法：使用arrays文件代替
     */

    static final int[] NarrowImage = {
            R.drawable.bg_small_autumn_tree_min,
            R.drawable.bg_small_kites_min,
            R.drawable.bg_small_lake_min,
            R.drawable.bg_small_leaves_min,
            R.drawable.bg_small_magnolia_trees_min,
            R.drawable.bg_small_solda_min,
            R.drawable.bg_small_tree_min,
            R.drawable.bg_small_tulip_min
    };
    /**
     * 初始化页面随机图片
     */
    private static final String SPALSH_01 = "http://www.pptbz.com/pptpic/UploadFiles_6909/201211/2012111719294197.jpg";
    private static final String SPALSH_02 = "http://img5.duitang.com/uploads/item/201411/07/20141107164412_v284V.jpeg";
    private static final String SPALSH_03 = "http://img5.imgtn.bdimg.com/it/u=746215187,1522527078&fm=26&gp=0.jpg";
    private static final String SPALSH_04 = "http://img1.imgtn.bdimg.com/it/u=2488133216,866026667&fm=200&gp=0.jpg";
    private static final String SPALSH_05 = "http://img2.imgtn.bdimg.com/it/u=2157261095,901350627&fm=26&gp=0.jpg";
    public static final String[] SPALSH_URLS = new String[]{
            SPALSH_01, SPALSH_02, SPALSH_03, SPALSH_04,
            SPALSH_05
    };
    private static final int[] priorityIcons = new int[]{
            R.drawable.ic_priority_1,
            R.drawable.ic_priority_2,
            R.drawable.ic_priority_3,
            R.drawable.ic_priority_4
    };
    private static final Integer[] ides = new Integer[]{
            R.drawable.bg_autumn_tree_min,
            R.drawable.bg_kites_min,
            R.drawable.bg_lake_min,
            R.drawable.bg_leaves_min,
            R.drawable.bg_magnolia_trees_min,
            R.drawable.bg_solda_min,
            R.drawable.bg_tree_min,
            R.drawable.bg_tulip_min
    };
    private static final Integer[] smallImages = new Integer[]{
            R.drawable.bg_small_autumn_tree_min,
            R.drawable.bg_small_kites_min,
            R.drawable.bg_small_lake_min,
            R.drawable.bg_small_leaves_min,
            R.drawable.bg_small_magnolia_trees_min,
            R.drawable.bg_small_solda_min,
            R.drawable.bg_small_tree_min,
            R.drawable.bg_small_tulip_min
    };

    public static int[] createPriorityIcons() {
        return priorityIcons;
    }

    public static List<Integer> createBgImg() {
        return Arrays.asList(ides);
    }

    public static List<Integer> createSmallImage() {
        return Arrays.asList(smallImages);
    }

    public static ArrayList<Integer> getNarrowImage() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < NarrowImage.length; i++) {
            arrayList.add(NarrowImage[i]);
        }
        return arrayList;
    }

}
