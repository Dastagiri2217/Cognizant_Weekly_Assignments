public class MVCPattern {
    public static void main(String[] args) {
        Student student = new Student("Dastagiri", "3233", "A");

        //  View
        StudentView view = new StudentView();

        //  Controller
        StudentController controller = new StudentController(student, view);

        // Display 
        controller.updateView();

        System.out.println("\nUpdating student record...\n");

        // Update student  via controller
        controller.setStudentName("Dudekula Dastagiri");
        controller.setStudentGrade("A+");

        // Display updated info
        controller.updateView();
    }
}
