//Name: Ernesto Aguilera
//Date: 4/9/2021
//PantherID: 002-54-2302
//Title: Mammal
//Description: This program outputs information on a student and a doctor. (alex and jack).
public interface Mammal{ //Wrote it in as stated by the instructions... It has not been used at all.
    public double hairColor(); //Not implemented as instructions did not place this to be output anywhere.
}
class Human implements Mammal{ //Very cool class that returns age, weight, and height!
    private int age;
    private double weight, height;
    public Human(int age, double weight, double height){
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public int getAge(){ //returns age (applies to both individuals)
        return age;
    }
    public double getWeight(){ //returns weight
        return weight;
    }
    public double getHeight(){ //returns height.
        return height;
    }
    public double hairColor(){
        return 20.0;
    }
}
class Student extends Human{ //Student, takes values from Human and implements them with major/year/credithours.
    private String major;
    private double gpa;
    private int creditHours;
    public Student(int age, double weight, double height, String major, double gpa, int creditHours){
        super(age,weight,height);
        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }
    public String getMajor(){ //Returns major
        return major;
    }
    public double getGPA(){ //Returns gpa.
        return gpa;
    }
    public String getYears(){ //Finds what year the student is based on credithours.
        if(creditHours<32){
            return "Freshman";
        } else if(creditHours>=32 && creditHours<64){
            return "Sophomore";
        } else if(creditHours>=64 && creditHours<96){
            return "Junior";
        } else{
            return "Senior";
        }
    }
}
class Doctor extends Human{ //Same values taken like student class but with different variables! (notably years, specialty, and salary.)
    private int years;
    private String specialty;
    public Doctor(int age, double weight, double height, int years, String specialty){
        super(age, weight, height);
        this.years = years;
        this.specialty = specialty;
    }
    public int getYears(){ //Returns years
        return years;
    }
    public String getSpecialty(){ //returns specialty.
        return specialty;
    }
    double getSalary(){ //returns salary done with calculations based on years.
        double salary = 40000;
        for(int i=2;i<=years;i++){
            salary = salary + 5000;
        }
        return salary;
    }
}
class Lab13{ //Final output!
    public static void main(String [] args){ //main class
        Student alex = new Student(18,150,170,"Computer Science",3.4,54); //Student info, going from age,weight,height,major,gpa,and credithours
        Doctor jack = new Doctor(40, 179, 173, 4, "Dermatology"); //Doctors info, going from age,weight,height,years,and specialty
        System.out.println("Student information: " + "\nMajor: " + alex.getMajor() + "\nGPA: " + alex.getGPA() + "\nYear: " + alex.getYears() + "\nAge: " + alex.getAge()); //Student info output.
        System.out.println("Doctor information: " + "\nSpecialty: " + jack.getSpecialty() + "\nHeight: " + jack.getHeight() + " cm\nWeight: " + jack.getWeight() + " lb\nSalary: $" + jack.getSalary()); //Doctor info output.
    }
}