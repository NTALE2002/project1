package schoolManagementSystem;
/*
*crrated by Ntale swamadu
*this class is responsible to keep track of Sstudents
* grade,id,names,fees total,fees supposed to pay
* */
class Students {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalPaid;

    /**
     *
     * @param id id of the student
     * @param name name of the Student
     *  @param grade grade of the Student
     */
    public Students(int id,String name,int grade){
        feesPaid=0;
        totalPaid=6000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {

        return id;
    }

    /**
     *
     * @return return name of the Student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total paid by the student
     */
    public int getTotalPaid() {
        return totalPaid;
    }

    /**
     *updates the grade of student
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * updates the fees paid by the student
     * @param fees
     */
    public void payfees(int fees) {
       feesPaid+=fees;
       school.setTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the balance that should be paid by the student
     */
    public int getremainingfees(){
        return totalPaid-feesPaid;
    }


}
