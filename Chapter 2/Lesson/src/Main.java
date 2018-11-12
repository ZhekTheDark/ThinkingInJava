import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        /*int x =12;
        // доступно только x
        {
            int q = 96;
            // доступно как x, так и q
        }
        // доступно только x
        // q находится 'за пределами видимости"*/

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

    }
}
