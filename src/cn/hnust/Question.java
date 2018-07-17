package cn.hnust;

public class Question {

	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNa(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}*/

	public String id;
	public String question;
	public String A;
	public String B;
	public String C;
	public String D;
	public String ans;
	
	public Question() {
		
	}
	public Question(String id, 
			String question, String A, 
			String B, String C,String D,String ans) {
		this.id = id;
		this.question = question;
		this.A = A;
		this.B = B;
		this.C = C;
		this.D=D;
		this.ans=ans;
	}
	public static void main(String[] args) {
		

	}

}
