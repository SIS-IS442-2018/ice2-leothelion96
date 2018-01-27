public class StudentTest {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println("Default Constructor value: \n" +
                "Student Name: " + s1.getName() + "\n" +
                "Student AgeL " + s1.getAge() + "\n" +
                "Student Gender: " + s1.getGender() + "\n" +
                "Student Height: " + s1.getHeight());

        Student s2 = new Student("Tom", 100, "Male", 1.8 );
        System.out.println("\nDefault Constructor value: \n" +
                "Student Name: " + s2.getName() + "\n" +
                "Student AgeL " + s2.getAge() + "\n" +
                "Student Gender: " + s2.getGender() + "\n" +
                "Student Height: " + s2.getHeight());
    }
}
