package emailApp;
import java.util.Scanner;
public class Email<T> {
   private String firstName;
   private String lastName;
   private String email;
   private T password;
   private int PasswordLength=10;
   private String department;
   private int mailBoxCapacity=300;
   private String alternateEamil;
   private String companySuffix="aeeycompany.com";
   // Constructor to receive firstname and lastname

    public Email(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("email created:"+" "+this.firstName+" "+this.lastName);
    //call a method asking for the department
        this.department=setDepartment();
        System.out.println(" Department :"+ " "+this.department);
        //call a method that returns a random password
        this.password = (T) randomPassword(8);
        System.out.println();
        System.out.println("your password : "+" "+this.password);
        //combine elements to generate email
        email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println(" Your Email is :"+email);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.println(" " +
    "Enter the department :\n1 for sales\n2 " +
    "for Development\n3 for Accounting\n0 for none ");
        Scanner input=new Scanner(System.in);
        int depChoice= input.nextInt();
        if (depChoice==1){return "sales";}
        else if (depChoice==2){return "Development";}
        else if (depChoice==3){return "Accounting";}
        else if (depChoice==0){return "none";}
        else{ return " ";}

    }

    public String getDepartment() {

        return department;
    }


    //Generate a random password
private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKUMNOPQRSTILXYZ!@#$";
        char password[]=new char[length];
    for (int i = 0; i < length; i++) {
       int random=(int) (Math.random()*passwordSet.length());
       password[i]=passwordSet.charAt(random);
    }
    return new String(password);
}
    //set and get the mailBoxCapacity

  void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    //Set and get the alternate email

    public void setAlternateEamil(String alternateEamil) {
        this.alternateEamil = alternateEamil;
    }

    public String getAlternateEamil() {
        return alternateEamil;
    }
    //Change the password

    private void setPassword(String pass) {
        this.password = (T) pass;
    }

    public T getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + "\n" +
                ", lastName='" + lastName + "\n" +
                ", email='" + email + "\n" +
                ", password=" + password +
                ", PasswordLength=" + PasswordLength +
                ", department='" + department + "\n" +
                ", mailBoxCapacity=" + mailBoxCapacity +
                ", alternateEamil='" + alternateEamil + "\n" +
                ", companySuffix='" + companySuffix + "\n" +
                '}';
    }
}
