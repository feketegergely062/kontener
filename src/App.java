

public class App {
    public static void main(String[] args) throws Exception {
       // new LoadFile().load(); ---> átalakítás elott
       java.util.ArrayList<Employee> empList = LoadFile.load();
       System.out.println(empList.get(0).name);
    }
}
