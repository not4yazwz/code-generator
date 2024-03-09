package com.zwz.cli;

import picocli.CommandLine;

@CommandLine.Command(name = "neil", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {
    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());

    }

    @Override
    public void run() {
        System.out.println("Please input specified command or input --help to view prompt");
    }


    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
