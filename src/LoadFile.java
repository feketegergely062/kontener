import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {
    public LoadFile(){

    }
    public static ArrayList<Employee> load(){
        ArrayList<Employee>employeeList = null;
        try {
          employeeList =  tryload();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba a file nem található!");
        }
        return employeeList;
    }
        public static  ArrayList<Employee> tryload() throws FileNotFoundException{
            ArrayList<Employee>employeeList = new ArrayList<>();
            File file = new File("kontenerkft.txt");
            Scanner scanner = new Scanner(file,"utf-8");
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] lineArray = line.split("#");
                Employee emp = new Employee();
                emp.name = lineArray[0];
                emp.city = lineArray[1];
                emp.address = lineArray[2];
                String[] dataStrArray = lineArray[3].split("-"); // mert # ekkel választotta el a dátumokat, ha rendese írja akkor ezek nem kellenek.
                int year = Integer.parseInt(dataStrArray[0]);
                int monath = Integer.parseInt(dataStrArray[1]);
                int day = Integer.parseInt(dataStrArray[2]);
                emp.birth = LocalDate.of(year, monath, day);
                emp.salary = Double.parseDouble(lineArray[4]);

                employeeList.add(emp);
               

            }


            return employeeList;
            
        }
    
    
}
