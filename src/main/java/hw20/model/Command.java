package hw20.model;

public enum Command {
    SHOW("show", "\t Shows the title of the book in the library"),
    ADD("add", "\t \t Adds a book to the library"),
    DELETE("delete", "\t Deletes the selected book from the library"),
    EXIT("exit", "\t Finish)");

    public String command;
    public String description;

    Command(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static void printDescription() {
        System.out.println(Output.START_LIBRARY.description);
        System.out.println(SHOW.command + SHOW.description);
        System.out.println(DELETE.command + DELETE.description);
        System.out.println(ADD.command + ADD.description);
        System.out.println(EXIT.command + EXIT.description);
    }
}
