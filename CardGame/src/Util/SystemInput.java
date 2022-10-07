package Util;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class SystemInput {
    private final Scanner scanner;
    private String lastRawCommand = "";

    public SystemInput() {
        this.scanner = new Scanner(System.in);
    }

    public void readCommand() {
        this.lastRawCommand = scanner.nextLine();
    }

    public String getLastCommand() {
        return lastRawCommand.toLowerCase().split(" ")[0].substring(1);
    }

    public String getArgument(int number) {
        return lastRawCommand.toLowerCase().split(" ")[number + 1];
    }
    public boolean lastCommandUnknown() {
        List<String> list = Arrays.asList("draw", "discard", "retrieve");
        if(!list.contains(getLastCommand().toLowerCase())) {
            return true;
        }
        if(!lastRawCommand.startsWith("/")) {
            return true;
        }
        if(lastRawCommand.split(" ").length != 2) {
            return true;
        }
        return false;
    }
}