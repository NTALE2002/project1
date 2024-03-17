package schoolManagementSystem;

class Teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     *
     * @param id id of the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teachers(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     *  this updates the teachers salary
     * @param salary
     */
//    public void updateSalary(int salary){
//        this.salary=salary;
//
//    }

    /**
     * this updates the salary receved by the teacher
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        school.updateTotalMoneySpent(salaryEarned);
    }
    public int remainingSalary(){
        return salary-=salaryEarned;
    }
}
