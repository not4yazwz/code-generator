package com.zwz.generator;

import com.zwz.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    /**
     * generate
     *
     * @param model FreeMarker parameter
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        // 1.静态文件生成
        String projectPath = System.getProperty("user.dir");
        String inputPath = new File(projectPath, "demo-projects/acm-template").getAbsolutePath();
        String outputPath = projectPath + File.separator + "demo-projects/out";
        StaticGenerator.copyFilesByHuTools(inputPath, outputPath);
        // 2.动态文件生成
        String dynamicInputPath = projectPath + File.separator + "code-generator-basic/src/main/resources/template/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "demo-projects/out/MainTemplate.java";
        DynamicGenerator.doGenerator(dynamicInputPath, dynamicOutputPath, model);
    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setLoop(true);
        mainTemplateConfig.setAuthor("Neil");
        mainTemplateConfig.setOutputText("Test");
        doGenerate(mainTemplateConfig);
    }
}
