import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(123,"William", "Mahlangu", 90000);
        System.out.println(employee.getEmpNo());

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(56);
        myList.add(500);
        myList.add(120);
        myList.remove(1);
        System.out.println(myList);
    }
}