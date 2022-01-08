package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("Haja");
	}
     public void studentDepartment() {
    	 System.out.println("ECE");
     }
     public void studentId() {
    	 System.out.println("EC6040");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.studentName();
		st.studentDepartment();
		st.studentId();
		 Department dp = new Department();
		 dp.deptname();

	}

}
