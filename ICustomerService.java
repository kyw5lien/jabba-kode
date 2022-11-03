package model;

public interface ICustomerService{
    public CustomerServiceSRVC getCustomerServiceSRVC();
    public LoadDynamiks<Velocity, Dynamiks<NonNullifiableObject, Aggregation>> getCustomerSRVCLoadDynamiks(LoadRate load);
    public Stable onPremise(Predicate predicate);
    UpTime synchronizeUpTime(TreeSet<StringPayload> treeSet);
}
