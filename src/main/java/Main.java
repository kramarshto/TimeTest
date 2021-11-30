import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int n = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println();
        System.out.println("------------------ ADDING ------------------");
        System.out.println("              Add " + n + " elements       ");
        System.out.println("--------------------------------------------");
        System.out.println("test add of linkedList | " + TimeTest.testAdd(linkedList, n) + " nanosecs");
        System.out.println("--------------------------------------------");
        System.out.println("test add of arrayList  | " + TimeTest.testAdd(arrayList, n) + " nanosecs");
        System.out.println("--------------------------------------------");

        System.out.println();
        System.out.println("------------------ GETTING -----------------");
        System.out.println("              Get " + n + " elements       ");
        System.out.println("--------------------------------------------");
        System.out.println("test get of linkedList | " + TimeTest.testGet(linkedList, n) + " nanosecs");
        System.out.println("--------------------------------------------");
        System.out.println("test get of arrayList  | " + TimeTest.testGet(arrayList, n) + " nanosecs");
        System.out.println("--------------------------------------------");

        System.out.println();
        System.out.println("----------------- DELETING -----------------");
        System.out.println("            Delete " + n + " elements      ");
        System.out.println("--------------------------------------------");
        System.out.println("test delete of linkedList | " + TimeTest.testDelete(linkedList, n) + " nanosecs");
        System.out.println("--------------------------------------------");
        System.out.println("test delete of arrayList  | " + TimeTest.testDelete(arrayList, n) + " nanosecs");
        System.out.println("--------------------------------------------");
    }
}
