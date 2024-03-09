package com.zwz.cli;

import cn.hutool.core.bean.BeanUtil;
import com.zwz.generator.MainGenerator;
import com.zwz.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "generate", description = "Generate code", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    /**
     * interactive: 交互获取参数信息
     * echo: 对用户显示输入信息
     */

    @CommandLine.Option(names = {"-l", "--loop"}, arity = "0..1", description = "If loop", interactive = true, echo = true)
    private boolean loop;

    @CommandLine.Option(names = {"-a", "--author"}, arity = "0..1", description = "Author name", interactive = true, echo = true)
    private String author = "Neil";

    @CommandLine.Option(names = {"-t", "--outputText"}, arity = "0..1", description = "Content of outputText", interactive = true, echo = true)
    private String outputText = "Test!";

    public Integer call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        System.out.println("configuration information:" + mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
