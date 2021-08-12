package map;
public class student  {
private String studname;
private int sub1;
private int sub2;
private int sub3;
private int total;
private double average;

public student(String studname, int sub1, int sub2, int sub3, int total, double average) {
	super();
	this.studname = studname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.total = total;
	this.average = average;
}
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
public int getSub1() {
	return sub1;
}
public void setSub1(int sub1) {
	this.sub1 = sub1;
}
public int getSub2() {
	return sub2;
}
public void setSub2(int sub2) {
	this.sub2 = sub2;
}
public int getSub3() {
	return sub3;
}
public void setSub3(int sub3) {
	this.sub3 = sub3;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public double getAverage() {
	return average;
}
public void setAverage(double average) {
	this.average = average;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(average);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((studname == null) ? 0 : studname.hashCode());
	result = prime * result + sub1;
	result = prime * result + sub2;
	result = prime * result + sub3;
	result = prime * result + total;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	student other = (student) obj;
	if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
		return false;
	if (studname == null) {
		if (other.studname != null)
			return false;
	} else if (!studname.equals(other.studname))
		return false;
	if (sub1 != other.sub1)
		return false;
	if (sub2 != other.sub2)
		return false;
	if (sub3 != other.sub3)
		return false;
	if (total != other.total)
		return false;
	return true;
}


}
