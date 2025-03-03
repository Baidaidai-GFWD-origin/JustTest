import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`);

    print("请输入您的姓名：");
    val name = scanner.next();

    print("请输入您的年龄：");
    val age = scanner.next();

    println("您的姓名是：$name，年龄是：$age");
    scanner.close();
}
