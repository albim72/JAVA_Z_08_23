
public class Main {
    public static void main(String[] args) {
        StudentDAO stud = new StudentDAO();
        for(Student st:stud.getAllStudent()){
            System.out.printf("Student: [numer albumu: %d, imię: %s].\n",st.getNralb(),st.getName());
        }

        System.out.println("_________ Update Student _____________");
        Student student = stud.getAllStudent().get(0);
        student.setName("Ola");
        stud.updateStudent(student);
        System.out.println("Odświeżona lista studentów ->");
        for(Student st:stud.getAllStudent()){
            System.out.printf("Student: [numer albumu: %d, imię: %s].\n",st.getNralb(),st.getName());
        }

        System.out.println("_________ Delete Student _____________");
        Student std = stud.getAllStudent().get(3);
        stud.deleteStudent(std);
        System.out.println("Odświeżona lista studentów ->");
        for(Student st:stud.getAllStudent()){
            System.out.printf("Student: [numer albumu: %d, imię: %s].\n",st.getNralb(),st.getName());
        }
    }
}
