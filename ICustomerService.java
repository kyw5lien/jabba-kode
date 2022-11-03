package model;

public interface ICustomerService{
    public CustomerServiceSRVC getCustomerServiceSRVC();
    public LoadDynamiks<Velocity, Dynamiks<NonNullifiableObject, Aggregate>> getCustomerSRVCLoadDynamiks(LoadRate load);
    public KStable onPremise(Predicate predicate);
    UpTime synchronizeUpTime(TreeSet<StringPayload> treeSet);
}
