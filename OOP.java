
public class OOP {
	 private float averagegpa;
	 private float mathgpa;
	 private float banglagpa;
	 private float english;
	 
//	public float getAveragegpa() {
//		return averagegpa;
//	}
//	public void setAveragegpa(float averagegpa) {
//		this.averagegpa = averagegpa;
//	}
//	public float getMathgpa() {
//		return mathgpa;
//	}
//	public void setMathgpa(float mathgpa) {
//		this.mathgpa = mathgpa;
//	}
//	public float getBanglagpa() {
//		return banglagpa;
//	}
//	public void setBanglagpa(float banglagpa) {
//		this.banglagpa = banglagpa;
//	}
//	public float getEnglish() {
//		return english;
//	}
//	public void setEnglish(float english) {
//		this.english = english;
//	}
	public OOP(float mathgpa, float banglagpa, float english) {
		super();
		this.mathgpa = mathgpa;
		this.banglagpa = banglagpa;
		this.english = english;
	}
	

	public OOP(float mathgpa, float banglagpa) {
	super();
	this.mathgpa = mathgpa;
	this.banglagpa = banglagpa;
}
	public OOP(float mathgpa) {
		super();
		this.mathgpa = mathgpa;
	}




	public String GetGpa()
	{
		float gpa;
		String mesg="";
		if(mathgpa>0&&banglagpa>0&&english>0)
		{
			gpa=(mathgpa+banglagpa+english)/3;
			mesg="Gpa Of 3 subject"+" "+gpa;
			
			
		}
		else if(mathgpa>0&&banglagpa>0)
		{
			gpa=(mathgpa+banglagpa)/2;
			mesg="Gpa Of 2 subject"+" "+gpa;
			
			
		}
		else if(mathgpa>0)
		{
			gpa=(mathgpa);
			mesg="Gpa Of 1 subject"+" "+gpa;
			
			
		}

		return mesg;
	}
	 

}
