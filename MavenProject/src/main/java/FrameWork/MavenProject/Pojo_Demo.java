package FrameWork.MavenProject;

public class Pojo_Demo {
	
	private int age;
	
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public static void main(String[] args) {
		
		Pojo_Demo p = new Pojo_Demo();
		p.setAge(27);
		System.out.println(p.getAge());
		

	}

}
