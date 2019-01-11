package fun.bruce.study.kotlin.basic;

public class ExtensionFunsTest {

    public static void main(String[] args) {
        char first = ExtensionFunsKt.firstChar("Kotlin");
        char last  = ExtensionFunsKt.lastChar(("Kotlin"));

        System.out.println("first:" + first);
        System.out.println("last:" + last);
    }

}
