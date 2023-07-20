public class Trainer {
    public static void main(String[] args){
        System.out.println("Running trainer in main");
        Trainer1.teach();
        Trainer1.teach("Java");
        Trainer1.giveFeedback();
        Trainer1.giveFeedback("Good job!");
        Trainer1.planWorkshop("Software Development", 5);
        Trainer1.organizeConference("Tech Conference");
        Trainer1.mentorStudent("John");
        Trainer1.customTraining("Python", "Advanced");
        Trainer1.name("Emma");
        Trainer1.trainerplace("bangalore");
    }
}

 class Trainer1 {
    static void teach() {
        System.out.println("The trainer is teaching");
    }
    static void trainerplace(String place){
        System.out.println("trainer place is:"+place);
    }

    static void teach(String subject) {
        System.out.println("The trainer is teaching " + subject);
    }

    static void giveFeedback() {
        System.out.println("The trainer is giving feedback");
    }

    static void giveFeedback(String feedback) {
        System.out.println("The trainer is giving feedback: " + feedback);
    }

    static void planWorkshop(String topic, int duration) {
        System.out.println("The trainer is planning a workshop on " + topic + " for " + duration + " days");
    }

    static void organizeConference(String conferenceName) {
        System.out.println("The trainer is organizing the " + conferenceName);
    }

    static void mentorStudent(String studentName) {
        System.out.println("The trainer is mentoring " + studentName);
    }

    static void customTraining(String subject, String level) {
        System.out.println("The trainer is providing custom training in " + subject + " at " + level + " level");
    }
    
    static void name(String name){
        System.out.println("Trainer's name is " + name);
    }
}
