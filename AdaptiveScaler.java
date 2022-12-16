public interface AdaptiveScaler<T,E>{
    public default <T> TimeLapseMomentum adaptiveScaling(T dataStructure, E adaptiveConstraintSet) {
        return AdaptiveScaler.constraintScheduling(DataStructureHandler.sortDataStructure(dataStructure), adaptiveConstraintSet);
    }
    static <E> TimeLapseMomentum constraintScheduling(Object sortedDataStructure, E adaptiveConstraintSet) {
        return ConstraintScheduler.schedule(sortedDataStructure, adaptiveConstraintSet);
    }
    DataStructure sortDataStructure(T dataStructure);
}
