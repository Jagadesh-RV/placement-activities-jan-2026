import java.util.Scanner;

public class method_inheritance {
    public static void main(String[] args) {
        Class_B obj=new Class_B();
        obj.even_odd_prime();
    }
    
}

class Class_A {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    void even_odd_prime() {
        if (a % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

class Class_B extends Class_A {

    void even_odd_prime() {
        
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        if (count >2) {
            System.out.println("Not a Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}
