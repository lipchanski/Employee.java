package Company.employee.implementation;

import Company.employee.Employee;

public class QA extends Employee {


    protected QA(String sellery) {
        super(sellery);
    }

    @Override
    public void work(){
        System.out.println("Testing and reporting");
    }

    @Override
    protected void playboardgame(String rest) {
        System.out.println("Наигрались" + rest);

    }

    @Override
    public boolean drinktea(String tea) {
        switch (tea){
            case "Green tea":
                return true;
            default:
                return false;
        }

        @Override
        public void lunch() {
            System.out.println("Наелся");
        }
    }

    @Override
    public void lunch() {

    }

    public String reporBugs(int bugId){
        return "Bug_with_bugId " + bugId;
    }

}
