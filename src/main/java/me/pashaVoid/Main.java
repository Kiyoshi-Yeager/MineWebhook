package me.pashaVoid;
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ASCII-арт (например, логотип "MineWebhook")
        String asciiArt =
                "  __  __ _       _  __      __          _    \n" +
                        " |  \\/  (_)     (_) \\ \\    / /         | |   \n" +
                        " | \\  / |_ _ __  _   \\ \\  / /__  _ __ | | __\n" +
                        " | |\\/| | | '_ \\| |   \\ \\/ / _ \\| '_ \\| |/ /\n" +
                        " | |  | | | | | | |_   \\  / (_) | | | |   < \n" +
                        " |_|  |_|_|_| |_|_(_)   \\/ \\___/|_| |_|_|\\_\\\n" +
                        "                                             \n";

        System.out.println(asciiArt);
        String url = "https://discord.gg/Vxqa9gB5Sw";

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                System.out.println("Жаль что ты без GUi :( -> https://discord.gg/Vxqa9gB5Sw");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        new Scanner(System.in).nextLine();
    }
}