public interface AdaptativeScaler <T,E>{
    public default <T> TimeLapseMomentum adaptativeScaling(T dataStructure, E adaptativeConstraintsSet) {
        return AdaptativeScaler.constraintScheduler(DataStructureHandler.sortDataStructure(dataStructure), adaptativeConstraintsSet);
    }
    static <E> TimeLapseMomentum constraintScheduler(Object sortDataStructure, E adaptativeConstraintsSet) {
        return null;
    }
    DataStructure sortDataStructure(T dataStructure);
}
