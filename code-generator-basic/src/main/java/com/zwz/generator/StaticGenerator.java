package com.zwz.generator;

import cn.hutool.core.io.FileUtil;

/**
 * 静态文件生成
 */
public class StaticGenerator {
    public static void main(String[] args) {
        // 相对路径
        String projectPath = System.getProperty("user.dir");
        String inputPath = "";
        String outputPath = "";
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
