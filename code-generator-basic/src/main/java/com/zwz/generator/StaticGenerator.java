package com.zwz.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * 静态文件生成
 */
public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String inputPath = new File(projectPath, "demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath + File.separator + "demo-projects/out";
        copyFilesByHuTools(inputPath, outputPath);
    }

    /**
     * 拷贝文件(基于HuTools实现)
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     */
    public static void copyFilesByHuTools(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

}
