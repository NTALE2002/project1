package schoolManagementSystem;

import java.util.List;

public class school {
    private List<Teachers> teachers;
    private List<Students> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public school(List<Teachers> teacher, List<Students> student) {
        this.teachers = teacher;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teachers> getTeacher() {
        return teachers;
    }

    /**
     *
     * @param teacher adds a new teacher to the list
     */
    public void Addteacher(Teachers teacher) {
      teachers.add(teacher);
    }

    /**
     *
     * @return student to the list
     */
    public List<Students> getStudent() {
        return student;
    }

    /**
     *
     * @param student adds a new student to the list
     */
    public void Addstudent(Students student) {
        this.student.add(student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned updates the total money earned
     */
    public static void setTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned +=MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the School
     *
     */
    public int getTotalMoneySpent() {

        return totalMoneySpent;
    }

    /**
     * updates the total money spent by the school
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
         totalMoneySpent-=MoneySpent;
    }
}
