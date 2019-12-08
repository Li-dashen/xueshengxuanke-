package 学生选课系统;

class Teacher extends Person{
	String course;
	String address;
	String time;
	int score;
	
	String getcourse() {
		return course;
	}
	String getaddress() {
		return address;
	}
	int getscore() {
		return score;
	}
	public String gettime() {
		return time;
	}
	public Teacher(int id,String name,String sex,String course,
			        String address,String time,int score) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.course = course;
		this.address = address;
		this.time = time;
		this.score = score;
	}
	public String toString() {
		   return "课程编号；" + id +" 老师名称：" + name + " 老师性别：" + sex 
				   +" 课程："+ course + "   地址："+address+"   学分："+score+"  时间： "+ time ;
		   
		}
}