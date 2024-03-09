package com.zwz;

import com.zwz.cli.CommandExecutor;

/**
 * Author: zwz
 */
public class Main {
    public static void main(String[] args) {
//        args = new String[]{"generate", "-l", "-a", "-t"};
//        args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}