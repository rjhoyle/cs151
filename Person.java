public class Person {

    int age;
    private String fname;
    private String lname;

    static int count = 0;
    
    public Person(String fname, String lname) {
	this.fname = fname;
	this.lname = lname;

	count++;
    }
    
    /** Mutator method for age
     * @param age - age to set
     */
    public void setAge(int age) {
	this.age = age;
    }

    public void setFname(String fname) {
	this.fname = fname;
    }

    public String getFname() {
	return this.fname;
    }

    public void setLname(String lname) {
	this.lname = lname;
    }

    public String getLname() {
	return this.fname;
    }

    
    /** Accessor method for age
     * @return the current age
     */
    public int getAge() {
	return(age);
    }

    public String toString() {
	return fname + " " + lname + " " + count;
    }

    public boolean equals(Object rhs) {
	if ( !(rhs instanceof Person) ) {
	    return false;
	}

	Person other = (Person) rhs;

	if ( (this.age == other.age) &&
	     (this.fname.equals(other.fname)) &&
	     (this.lname.equals(other.lname) ) ) {
	    return true;
	}
	return false;
    }
    
    public static void main (String[] args) {
	Person p1 = new Person("Roberto", "Hoyle");
	p1.setAge(44);

	System.out.println(p1);
	
	Person p2 = new Person("Maia", "Hoyle");
	p2.setAge(8);

	System.out.println(p1);
	System.out.println(p2);

	Person p3 = new Person("Roberto", "Hoyle");
	p3.setAge(44);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	if (p1 == p3) {
	    System.out.println("There is something weird...");
	}
	if (p1.equals(p3)) {
	    System.out.println("That is more like it!");
	}
	

	System.out.println("I ran!");
    }
}

