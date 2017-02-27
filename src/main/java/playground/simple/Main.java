package playground.simple;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        final URL dir = Main.class.getClassLoader().getResource("dir/");
        final File file = new File(dir.toURI());
        System.out.println(Arrays.toString(file.listFiles()));
    }
}
