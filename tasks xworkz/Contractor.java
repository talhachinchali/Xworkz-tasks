public class Contractor {
    public static void main(String[] args){
        System.out.println("Running contractor in main");
        Contractor1.manageProject();
        Contractor1.manageProject("Residential");
        Contractor1.scheduleWorkers();
        Contractor1.scheduleWorkers(10);
        Contractor1.orderMaterials("Cement");
        Contractor1.orderMaterials("Bricks", 5000);
        Contractor1.inspectSite("bangalore");
        Contractor1.prepareCostEstimate();
        Contractor1.coordinateSubcontractors();
        Contractor1.handlePermits();
        Contractor1.name("John");
    }
}

 class Contractor1 {
    static void manageProject() {
        System.out.println("The contractor is managing the project");
    }

    static void manageProject(String projectType) {
        System.out.println("The contractor is managing a " + projectType + " project");
    }

    static void scheduleWorkers() {
        System.out.println("The contractor is scheduling workers");
    }

    static void scheduleWorkers(int numWorkers) {
        System.out.println("The contractor is scheduling " + numWorkers + " workers");
    }

    static void orderMaterials(String material) {
        System.out.println("The contractor is ordering " + material);
    }

    static void orderMaterials(String material, int quantity) {
        System.out.println("The contractor is ordering " + quantity + " units of " + material);
    }

    static void inspectSite(String place) {
        System.out.println("The contractor is inspecting the construction site in:"+place);
    }

    static void prepareCostEstimate() {
        System.out.println("The contractor is preparing a cost estimate for the project");
    }

    static void coordinateSubcontractors() {
        System.out.println("The contractor is coordinating subcontractors for specialized tasks");
    }

    static void handlePermits() {
        System.out.println("The contractor is handling the necessary permits for the project");
    }
    
    static void name(String name){
        System.out.println("Contractor's name is " + name);
    }
}
