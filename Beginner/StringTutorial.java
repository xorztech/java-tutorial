package Beginner;

public class StringTutorial {
    public static void main(String args[]){
        String myString = new String("Hello, Xorz!");
        myString = myString.replace("Xorz", "Java");
        System.out.println(myString);

        //String Literals
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println(str1 == str2);

        //length
        String str = "Hello, world!";
        int len = str.length(); // len is assigned the value 13
        System.out.println(len);

        //char
        char c = str.charAt(5);
        System.out.println(c);

        String substr = str.substring(0, 5); // substr is assigned the value "Hello"
        System.out.println(substr);

        int index = str.indexOf("world"); // index is assigned the value 7
        System.out.println(index);

        String uppercase = str.toUpperCase(); // uppercase is assigned the value "HELLO, WORLD!"
        String lowercase = str.toLowerCase(); // lowercase is assigned the value "hello, world!"
        System.out.println(uppercase);
        System.out.println(lowercase);

        str = "    Hello, world!   ";
        String trimmed = str.trim(); // trimmed is assigned the value "Hello, world!"
        System.out.println(trimmed);

    }
}
