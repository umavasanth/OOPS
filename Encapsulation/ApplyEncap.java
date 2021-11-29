package Encapsulation;

/*Print college names(any 5 colleges) and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI - Should use private variables for the department name and college .
 (Apply encapsulation)*/
public class ApplyEncap {

    private String collegeName;
    private String deptName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}

