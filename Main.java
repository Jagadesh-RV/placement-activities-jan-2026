public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 100) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
