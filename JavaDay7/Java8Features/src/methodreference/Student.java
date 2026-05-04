package methodreference;

import java.util.Optional;

public class Student {
	
	
		private int sid;
		private String sname;
		
		public Student() {
			
			System.out.println("Student()");
		}
		
		public Student(int sid, String sname) {
			super();
			this.sid = sid;
			this.sname = sname;
			
			System.out.println("Student() with params");
		}
		
		
		
		
		public Optional<Student>  getStudent(){
			
			
			
				 return  Optional.ofNullable(new Student());
				 
				//return Optional.of(new Student()).orElse(null);
			
		}


}
		


