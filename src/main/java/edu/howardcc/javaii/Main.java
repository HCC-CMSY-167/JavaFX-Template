package edu.howardcc.javaii;

/**
 * Launch the JavaFX App
 *
 * Moving the main method out of the {@link App} class allows a non-modular JavaFX app to be launched from an IDE
 * or with a shaded jar. See https://stackoverflow.com/a/52654791/425683 for details
 */
public class Main {

    public static void main(String[] args) {
        App.launchApp();
    }

}
