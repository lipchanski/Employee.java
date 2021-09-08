package Company.employee;

public abstract class Employee {

        protected String name;
        protected String surname;
        protected String jobtitle;
        protected double sellery;

        protected Employee(String sellery);
        this.sellery = sellery;

        public String getName() {
            return name;
        }

        public String getJobtitle() {
            return jobtitle;
        }

        public String getSurname(){
            return surname;

            public Employee(String surname){
                this.surname = surname;
            }

        }

        public abstract void work();

        public void wc(){
            System.out.println("Сходить по важным делам");
        }

        protected abstract void playboardgame(String rest);

        public abstract boolean drinktea(String tea);

        public void lunch(int minutes) {
            System.out.println("Обедал более " + minutes + "минут");
            if (minutes < 30) {
                System.out.println("Не наелся, не отдохнул");
            } else {
                System.out.println("Наелся, отдохнул");
            }
        }

        public void sleep(int hours) {
            System.out.println("Поспал " + hours + " часов");
            if (hours < 8) {
                System.out.println("Невыспался, очень злой");
            } else {
                System.out.println("Выспался. порядок");
            }

        }

    public abstract void lunch();
}

