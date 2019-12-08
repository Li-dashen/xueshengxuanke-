package 学生选课系统;

class Student extends Person{
	Teacher teacher;//将老师的课的信息放入其中
	public Student(int id,String name,String sex,Teacher teacher) {
		this.id = id;//调用并且代表该项
		this.name = name;
		this.sex = sex;
		this.teacher = teacher;//调用Teacher类
	}
	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		   return "学生信息  ：       " +"  学号；" + id+ " 姓名：" + name 
				   + " 性别：" + sex+"["+teacher+"]" ;
		   }
		   
}