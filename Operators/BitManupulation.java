package Operators;

public class BitManupulation {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        // System.out.println("a & b: " + (a & b)); // AND operation
        // System.out.println("a | b: " + (a | b)); // OR operation
        // System.out.println("a ^ b: " + (a ^ b)); // XOR operation
        // System.out.println("~a: " + (~a));       // NOT operation
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }
}
