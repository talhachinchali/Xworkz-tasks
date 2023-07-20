public class washingmachine {
    public static void main(String[] args) {
        washingmachine1 washingMachine = new washingmachine1();
        washingMachine.start();
        washingMachine.stop();
        washingMachine.wash();
        washingMachine.rinse();
        washingMachine.spin();
        washingMachine.addDetergent();
        washingMachine.setProgram();
        washingMachine.setTemperature(40);
        washingMachine.setLoadSize(7);
        washingMachine.setDelayStart(2);
        washingMachine.pause();
        washingMachine.resume();
        washingMachine.drain();
        washingMachine.addFabricSoftener();
        washingMachine.runQuickWash();
        washingMachine.runNormalWash();
        washingMachine.runDelicateWash();
        washingMachine.runHeavyDutyWash();
        washingMachine.runSelfClean();
        washingMachine.checkErrorCodes();
        washingMachine.displayStatus();
    }
}
