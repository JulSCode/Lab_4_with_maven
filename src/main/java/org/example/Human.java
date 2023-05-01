package org.example;
/**
 * The class stores information about a human
 */
public class Human
{
    /**
     * ID of human
     */
    private int ID;
    /**
     * Name of human
     */
    private String name;
    /**
     * Gender of human
     */
    private String gender;
    /**
     * Subdivision of human
     */
    private Subdivision subdivision;
    /**
     * Salary of human
     */
    private float salary;
    /**
     * Birthday of human
     */
    private String birthday;
    public Human(String ID, String name, String gender, String birthday, String title, String salary) {
        subdivision = new Subdivision(title);
        this.ID = Integer.parseInt(ID);
        this.name = name;
        this.gender = gender;
        this.salary = Float.parseFloat(salary);
        this.birthday = birthday;
    }
    /**
     * Method for setting birthday of human
     * @param birthday new date of birth
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * Method for setting gender of human
     * @param gender new gender of human
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Method for setting ID of human
     * @param ID new ID of human
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Method for setting name of human
     * @param name new name of human
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method for setting salary of human
     * @param salary new salary of human
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    /**
     * Method for setting subdivision of human
     * @param subdivision new subdivision of human
     */
    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }
    /**
     * Method for setting subdivision of human
     * @param subdivision new title of subdivision of human
     */
    public void setSubdivision(String subdivision) {
        this.subdivision.setTitle(subdivision);
    }
    /**
     * Method for getting the salary of human
     * @return salary of human
     */
    public float getSalary() {
        return salary;
    }
    /**
     * Method for getting the ID of human
     * @return ID of human
     */
    public int getID() {
        return ID;
    }
    /**
     * Method for getting the birthday of human
     * @return birthday of human
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * Method for getting the gender of human
     * @return gender of human
     */
    public String getGender() {
        return gender;
    }
    /**
     * Method for getting the name of human
     * @return name of human
     */
    public String getName() {
        return name;
    }
    /**
     * Method for getting the subdivision of human
     * @return subdivision of human
     */
    public Subdivision getSubdivision() {
        return subdivision;
    }
    /**
     * Method outputs complete information
     * about a human in a special format
     */
    public void printDataPerson() {
        System.out.format("%-10s%-30s%-10s%-10s%-12s%-10s",ID,name,gender,subdivision.printSubdivision(),birthday,salary);
    }
    /**
     * Method outputs complete information
     * about a human without format
     */
    public void printDataPersonWithoutFormat() {
        System.out.print(ID+" ");
        System.out.print(name+" ");
        System.out.print(gender+" ");
        System.out.print(subdivision.printSubdivision()+" ");
        System.out.print(birthday+" ");
        System.out.print(salary+" ");
    }
}
