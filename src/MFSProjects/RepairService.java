package MFSProjects;

public class RepairService {
    String serviceType;
    double timeForRepair;
    double serviceFee;

    public RepairService(String serviceType, double timeForRepair, double serviceFee) {
        this.serviceType = serviceType;
        this.timeForRepair = timeForRepair;
        this.serviceFee = serviceFee;

    }
}
