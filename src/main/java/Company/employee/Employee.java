package Company.employee;

public abstract class Employee {

        protected String name;
        protected String jobtitle;
        protected double sellery;

        public String getName() {
            return name;
        }

        public String getJobtitle() {
            return jobtitle;
        }

        public abstract void work();

        public abstract boolean drinktea(String tea);

        public void sleep(int hours) {
            System.out.println("Поспал " + hours + " часов");
            if (hours < 8) {
                System.out.println("Невыспался, очень злой");
            } else {
                System.out.println("Выспался. порядок");
            }

        }
}

