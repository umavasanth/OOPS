package Encapsulation;

public class EncapTest{

    public static void main(String[] args) {
        ApplyEncap encap=new ApplyEncap();
        encap.setCollegeName("Sai");
        encap.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");

        System.out.println("College Name:"+encap.getCollegeName()+ "Departments "+encap.getDeptName());
        ApplyEncap encap2=new ApplyEncap();
        encap2.setCollegeName("Shastra");
        encap2.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");
        System.out.println("College Name:"+encap2.getCollegeName()+ "Departments "+encap2.getDeptName());

        ApplyEncap encap3=new ApplyEncap();
        encap3.setCollegeName("Apollo");
        encap3.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");
        System.out.println("College Name:"+encap3.getCollegeName()+ "Departments "+encap3.getDeptName());

        ApplyEncap encap4=new ApplyEncap();
        encap4.setCollegeName("Venkateswara");
        encap4.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");
        System.out.println("College Name:"+encap4.getCollegeName()+ "Departments "+encap4.getDeptName());
        ApplyEncap encap5=new ApplyEncap();
        encap5.setCollegeName("Periyar");
        encap5.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");
        System.out.println("College Name:"+encap5.getCollegeName()+ "Departments "+encap5.getDeptName());





    }

}

    /*public void printDetails() {
        EncapTest en1= new EncapTest();

        en1.setCollegeName("Sai Ram");
        en1.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");

        EncapTest en2= new EncapTest();

        en2.setCollegeName("Shastra");
        en2.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");

        EncapTest en3= new EncapTest();
        en3.setCollegeName("Apollo");
        en3.setDeptName("IT , CS , MECH , ECE , EEE , AERO ,AUTO,EI");
        System.out.println();

    }


    }
*/


