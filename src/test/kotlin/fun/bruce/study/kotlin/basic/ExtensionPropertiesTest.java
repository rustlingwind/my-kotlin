package fun.bruce.study.kotlin.basic;

public class ExtensionPropertiesTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Alics");
        char last = ExtensionPropertiesKt.getLastChar(sb);
        System.out.println(last);

        ExtensionPropertiesKt.setLastChar(sb, 'e');
        last = ExtensionPropertiesKt.getLastChar(sb);
        System.out.println(last);
    }

}
