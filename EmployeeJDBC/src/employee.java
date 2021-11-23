
public class employee {
private int empno;
private String empname;
private String job;
private float sal;
private float comm;
private int deptno;
public employee(int empno, String empname, String job, float sal, float comm, int deptno) {
	super();
	this.empno = empno;
	this.empname = empname;
	this.job = job;
	this.sal = sal;
	this.comm = comm;
	this.deptno = deptno;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
public float getComm() {
	return comm;
}
public void setComm(float comm) {
	this.comm = comm;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
}
