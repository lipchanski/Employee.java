package Company.employee.implementation;

import Company.employee.Employee;

public class Progremmer extends Employee {

    public String getName (){
        return name;
    }

    private String language;

    @Override
    public void work(){
        System.out.println("Кодит и плачет");
    }

    @Override
    public boolean drinktea(String tea){
        return  tea!=null;
    }

    public void fixBug(String bugName){
        System.out.println("Bug %10s was fixed", bugName);
    }

}
