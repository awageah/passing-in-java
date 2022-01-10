public class Test {

    public static void main(String[] args) {

        /*
         *
         *   Passing_By_Value
         *
         * */

        int x = 10;
        changeVal(x);
        System.out.println(x);

        /*
         *
         *   Passing_By_Reference
         *
         * */
        Employee emp = new Employee("Ayman");
        changeVal(emp);
        System.out.println(emp.getEmpName());

    }

    private static void changeVal(int x) {
        x = 20;
    }

    private static void changeVal(Employee emp) {
//        emp.setEmpName("Ahmed");
        emp = new Employee("Mahmoud");
    }

}
