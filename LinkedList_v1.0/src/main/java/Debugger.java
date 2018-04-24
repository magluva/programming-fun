package main.java;

public class Debugger {

    public static final String[] colourArray = {"\u001B[0m", "\u001B[30m", "\u001B[34m", "\u001B[36m", "\u001B[32m", "\u001B[35m", "\u001B[31m", "\u001B[33m", "\u001B[37m"};

    private boolean active;

    public Debugger(boolean active) {
        this.active = active;
    }

    public void log(int colour, String msg) {
        if (active) {
            System.out.println(colourArray[colour] + msg + colourArray[0]);
        }
    }

    public void usage() {
        System.out.println("Debugger db = new Debugger(true);");
        System.out.println("db.log(0, \"This resets colour to cli standard.\"");
        System.out.println("db.log(1, \"This text will be black.\"");
        System.out.println("db.log(1, \"This text will be blue.\"");
        System.out.println("db.log(1, \"This text will be cyan.\"");
        System.out.println("db.log(1, \"This text will be green.\"");
        System.out.println("db.log(1, \"This text will be purple.\"");
        System.out.println("db.log(1, \"This text will be red.\"");
        System.out.println("db.log(1, \"This text will be yellow.\"");
        System.out.println("db.log(1, \"This text will be white.\"");
    }
}

