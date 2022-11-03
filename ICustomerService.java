package model;

public interface ICustomerService{
    public CustomerServiceSRVC getCustomerServiceSRVC();
    public LoadDynamiks<KSpeed, OnKPh<NonNullifiableObj, Aggregate>> getCustomerSRVCLoadDynamiks(LoadObj load);
    public KStable onPremise(Predicate predicate);
    UpTempo heartBeat(TreeSet<StringPayload> treeSet);
}
