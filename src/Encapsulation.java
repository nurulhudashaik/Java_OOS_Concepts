public class Encapsulation {

    //1.declare variables as private
    private int empSsn;
    private String empName;
    private int empAge;

    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation();
        emp.setEmpSsn(522101);
        emp.setEmpName("Reshma");
        emp.setEmpAge(25);
        System.out.println("Employee details are:" + emp.getEmpName() + "\n" + emp.getEmpSsn() + "\n" + emp.getEmpAge());
    }

    //2.set getter and setter methods

    public int getEmpSsn() {
        return empSsn;
    }

    public void setEmpSsn(int empSsn) {
        this.empSsn = empSsn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
