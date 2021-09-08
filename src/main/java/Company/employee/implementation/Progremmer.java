package Company.employee.implementation;

import Company.employee.Employee;

public class Progremmer extends Employee {

    public String getName (){
        return name;

        public String getSurname (){
            return surname;
        }
    }

    private String language;
    private String hightsalary;

    public Progremmer (String sellery){
        super(sellery);
    }

    public Progremmer (String language) {
        super(language);
        this.language = language;
    }

    @Override
    public void work(){
        System.out.println("Кодит и плачет");
    }

    @Override
    public boolean drinktea(String tea){
        return  tea!=null;
    }

    @Override
    public void lunch() {

    }

    @Override
    protected void playboardgame(String rest) {
        System.out.println("Поиграли" + rest);
    }

    public void fixBug(String bugName){
        System.out.println("Bug %10s was fixed", bugName);
    }

}
