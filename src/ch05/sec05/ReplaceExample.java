package ch05.sec05; //replace

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "string of java es inchangeable and String, string of java";
        String newStr = oldStr.replace("java", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
