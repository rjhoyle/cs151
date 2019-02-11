/** A student
 * 
 * @author rhoyle
 *
 */


public class Student extends Person {
    private int year;
    
    /** Constructor
     * 
     * @param fname String First Name
     * @param lname String Last Name
     * @param year int Year of Graduation
     */
    public Student(String fname, String lname, int year) {
	super(fname, lname);
	this.year = year;
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Student s1 = new Student("Bob", "Geitz", 1975);
	Person p1 = new Person("Roberto", "Hoyle");
	
	if (s1.equals(p1)) {
	    System.out.println("s1 equals p1");
	}
	
	if (s1 instanceof Person) {
	    System.out.println("Students are people too!");
	}
    }

}
