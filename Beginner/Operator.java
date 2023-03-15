package Beginner;

public class Operator {
    public static void main(String srgs[]){
        //Operators
        //Artithmetic operation
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2; // Addition
        int diff = num1 - num2; // Subtraction
        int product = num1 * num2; // Multiplication
        int quotient = num1 / num2; // Division
        int remainder = num1 % num2; // Modulus

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        //Relational Operator
        boolean isEqual = (num1 == num2); // Equal to - false
        boolean isNotEqual = (num1 != num2); // Not equal to true
        boolean isGreaterThan = (num1 > num2); // Greater than true
        boolean isLessThan = (num1 < num2); // Less than false
        boolean isGreaterThanOrEqual = (num1 >= num2); // Greater than or equal to true
        boolean isLessThanOrEqual = (num1 <= num2); // Less than or equal to false

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isGreaterThanOrEqual);
        System.out.println(isLessThanOrEqual);

        //Logical Operator
        boolean isTrue = true;
        boolean isFalse = false;

        boolean andResult = (isTrue && isFalse); // AND false
        boolean orResult = (isTrue || isFalse); // OR true
        boolean notResult = !isTrue; // NOT    false
        System.out.println("//Logical Operator");
        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(notResult);

        //Bitwise operator
        //int num1 = 10; // Binary: 1010
        //int num2 = 5; // Binary: 0101

        int intAndResult = num1 & num2; // Bitwise AND: 0000
        int intOrResult = num1 | num2; // Bitwise OR: 1111 -- 15
        int xorResult = num1 ^ num2; // Bitwise XOR: 1111
        int complementResult = ~num1; // Bitwise Complement: 11111111111111111111111111110101
        int leftShiftResult = num1 << 2; // Left Shift: 101000
        int rightShiftResult = num1 >> 2; // Right Shift: 10
        int zeroFillRightShiftResult = num1 >>> 2; // Zero-fill Right Shift: 10

        System.out.println("//Bitwise Operator");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(intAndResult);
        System.out.println(intOrResult);
        System.out.println(xorResult);
        System.out.println(complementResult);
        System.out.println(leftShiftResult);
        System.out.println(rightShiftResult);
        System.out.println(zeroFillRightShiftResult);

        //Assignment Operators
        System.out.println("//Assignment Operators");
        int num = 10;

        num += 5; // Add and assign: num = num + 5; --- 15
        System.out.println(num);
        num -= 5; // Subtract and assign: num = num - 5; 10
        System.out.println(num);
        num *= 5; // Multiply and assign: num = num * 5; 50
        System.out.println(num);
        num /= 5; // Divide and assign: num = num / 5; 10
        System.out.println(num);
        num %= 5; // Modulus and assign: num = num % 5; 0
        System.out.println(num);
        num &= 5; // Bitwise AND and assign: num = num & 5; 0
        System.out.println(num);
        num |= 5; // Bitwise OR and assign: num = num | 5; 5
        System.out.println(num);
        num ^= 5; // Bitwise XOR and assign: num = num ^ 5; 0
        System.out.println(num);

        //precedence
        System.out.println("//Operators Precedence");
        int y = 10 % 3 * 2 - 1; //-- 1
        System.out.println(y);


    }
}
