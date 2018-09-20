package Ex5;


import Ex5.Ex5_4.Version;

@Version(nvers = 7.1, version = "Nougat")
public class MyService{
	  private String name;
	  private int number;
	  
	  public MyService(String name, int number) {
			this.name = name;
		    this.number = number;  
		}
	  public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	  private void thisClassInfo(){
		  System.out.println(this.name + " " + this.number);}
		  
		  @Override
		  public boolean equals(Object obj) {
			  if (obj == null || obj.getClass() != this.getClass()) 
					{return false;	 } 
			  
			  else if (obj == this) 
		  return true;
		  else return false;
		 }
		  
		  @Override
		  public int hashCode() {
		      int hash = 37;
		      hash = hash * 17 + getName().hashCode() + getNumber();                    
		      return hash;
		  }
}
	