package ToOffer09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(2);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
    }
}
