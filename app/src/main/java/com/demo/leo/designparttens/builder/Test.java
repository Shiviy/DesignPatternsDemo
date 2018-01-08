package com.demo.leo.designparttens.builder;

/**
 * 测试代码
 * Created by leo on 2018/1/8.
 */

public class Test {
    public static void main(String[] args) {
        //构建器
        Builder builder = new MacbookBuilder();
        builder.buildBoard("英特尔主板").buildDisplay("Retina显示器").buildOS();

        //构建计算机，输出显示信息
        System.out.println("Computer Info : " + builder.create().toString());
    }
}
