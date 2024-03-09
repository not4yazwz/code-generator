package com.zwz.cli;

import cn.hutool.core.util.ReflectUtil;
import com.zwz.model.MainTemplateConfig;
import picocli.CommandLine;

import java.lang.reflect.Field;

@CommandLine.Command(name = "config", description = "show config parameter information", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {
    public void run() {
        Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);
        for (Field field : fields) {
            System.out.println("Class name: " + field.getName());
            System.out.println("Class type: " + field.getType());
            System.out.println("---");
        }
    }

}
