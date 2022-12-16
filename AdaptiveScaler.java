public interface AdaptiveScaler <T,E>{
    public default <T> TimeLapseMomentum adaptiveScaling(T dataStructure, E adaptiveConstraintsSet) {
        return AdaptiveScaler.constraintScheduler(DataStructureHandler.sortDataStructure(dataStructure), adaptiveConstraintsSet);
    }
    static <E> TimeLapseMomentum constraintScheduler(Object sortDataStructure, E adaptiveConstraintsSet) {
        return null;
    }
    DataStructure sortDataStructure(T dataStructure);
}
