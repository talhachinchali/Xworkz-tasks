public class Trainee {
    public static void main(String[] args){
        System.out.println("Running trainee in main");
        Trainee1.learn();
        Trainee1.learn("Java");
        Trainee1.submitAssignment();
        Trainee1.submitAssignment("Programming");
        Trainee1.attendWorkshop("Software Development");
        Trainee1.attendWorkshop("Data Science", 3);
        Trainee1.name("John");
        Trainee1.takeQuiz("java");
        Trainee1.participateInGroupProject();
        Trainee1.participateInGroupProject("drone");
    }
}

 class Trainee1 {
    static void learn() {
        System.out.println("The trainee is learning");
    }

    static void learn(String subject) {
        System.out.println("The trainee is learning " + subject);
    }

    static void submitAssignment() {
        System.out.println("The trainee is submitting an assignment");
    }

    static void submitAssignment(String assignmentType) {
        System.out.println("The trainee is submitting a " + assignmentType + " assignment");
    }

    static void attendWorkshop(String topic) {
        System.out.println("The trainee is attending a workshop on " + topic);
    }

    static void attendWorkshop(String topic, int duration) {
        System.out.println("The trainee is attending a " + duration + "-day workshop on " + topic);
    }
    
    static void name(String name){
        System.out.println("Trainee's name is " + name);
    }

    static void takeQuiz(String subject) {
        System.out.println("The trainee is taking a quiz on " + subject);
    }

    static void participateInGroupProject() {
        System.out.println("The trainee is participating in a group project");
    }

    static void participateInGroupProject(String projectName) {
        System.out.println("The trainee is participating in the group project: " + projectName);
    }
}
