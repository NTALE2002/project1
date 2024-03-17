package schoolManagementSystem;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers Ntale=new Teachers(32,"Ntale",900);
        Teachers Umar=new Teachers(21,"Umar",700);
        Teachers Sadiq=new Teachers(73,"Shadik",600);

        List<Teachers>teachers=new ArrayList<>();
        teachers.add(Ntale);
        teachers.add(Umar);
        teachers.add(Sadiq);

        Students Shailah=new Students(44,"Shailah",1);
        Students Moses=new Students(43,"Moses",4);
        Students Biko=new Students(41,"Bikola",4111);


        List<Students> students=new ArrayList<>();
        students.add(Shailah);
        students.add(Moses);
        students.add(Biko);

        school IUEA=new school(teachers,students);
        System.out.println(IUEA.getTotalMoneySpent());
        Shailah.payfees(5000);
        Moses.payfees(6000);
        Biko.payfees(6000);

        System.out.println("Student Name: "+ Shailah.getName()+"\n"+"you have paid $"+ Shailah.getFeesPaid()+"\n"+"your fees balance is $"+Shailah.getremainingfees());
        System.out.println("_______teachers' Section_____________");

        Ntale.receiveSalary(400);
        Sadiq.receiveSalary(600);
        System.out.println(Ntale.remainingSalary());
        System.out.println((IUEA.getTotalMoneySpent()));

    }
}
