package com.zwz.cli;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

@CommandLine.Command(name = "list", description = "Show file list", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{
    /**
     * FileUtil.loopFiles in Hutool could ergodic all files under content
     */

    public void run() {
        String projectPath = System.getProperty("user.dir");
        String inputPath = new File(projectPath, "demo-projects/acm-template").getAbsolutePath();
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
