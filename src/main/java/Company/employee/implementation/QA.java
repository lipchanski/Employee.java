package Company.employee.implementation;

import Company.employee.Employee;

public class QA extends Employee {


    @Override
    public void work(){
        System.out.println("Testing and reporting");
    }

    @Override
    public boolean drinktea(String tea) {
        switch (tea){
            case "Green tea":
                return true;
            default:
                return false;
        }
    }
    public String reporBugs(int bugId){
        return "Bug_with_bugId " + bugId;
    }

}
