// public class Person {
//     private String firstname;
//     private String lastname;

//     public Person(String firstName, String lastName) {
//         this.firstname = firstName;
//         this.lastname = lastName;
//     }

//     public String getFirstname() {
//         return firstname;
//     }

//     public String getLastname() {
//         return lastname;
//     }
// }

// class Employee extends Person {
//     private String employeeId;
//     private String jobTitle;

//     public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
//         super(firstName, lastName);
//         this.employeeId = employeeId;
//         this.jobTitle = jobTitle;
//     }

//     public String getEmployeeId() {
//         return employeeId;
//     }

//     @Override
//     public String getLastname() {
//         return super.getLastname() + " " + jobTitle;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Employee o1 = new Employee("Midhun", "Jayan", "12345", "Software Engineer");
//         System.out.println("First Name: " + o1.getFirstname());
//         System.out.println("Last Name with Job Title: " + o1.getLastname());
//         System.out.println("Employee ID: " + o1.getEmployeeId());
//     }
// }
