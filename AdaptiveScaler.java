public interface AdaptativeScaler <T,E>{
    public default <T> TimeLapseMomentum adaptativeScaling(T dataStructure, E adaptativeConstraintsSet) {
        return AdaptativeScaler.constraintScheduling(DataStructureHandler.sortDataStructure(dataStructure), adaptativeConstraintsSet);
    }
    static <E> TimeLapseMomentum constraintScheduling(Object sortDataStructure, E adaptativeConstraintsSet) {
        return ConstraintScheduler.schedule(sortDataStructure, adaptativeConstraintsSet);
    }
    DataStructure sortDataStructure(T dataStructure);
}
