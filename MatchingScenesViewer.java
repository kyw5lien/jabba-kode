public abstract class MatchingScenesViewer{
    /**
     * Returns the number of performative scenes that outstandingly match Theatre's Elaborated Scenes.
     *
     * @param scenes the performative scenes that should be outstandingly matched.
     * @param elaboratedScenes the theatre's elaborated scenes that scenes should be outstandingly matched against.
     * @return a long, representing the number of scenes in the performative scenes that outstandingly match the elaboratedScenes. .
     * @implSpec the implementation regards the theatre's actors and actresses performative sessions offered to the local public.
     */
    public static long countViewedScenes(PerformativeScenes<String> scenes, TheatreScenes<String> elaboratedScenes) {
        return scenes.stream().filter(elaboratedScenes).count();
    }
}
