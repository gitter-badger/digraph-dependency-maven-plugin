package net.kemitix.dependency.digraph.maven.plugin.digraph;

/**
 * Interface for elements that have a id.
 *
 * @author pcampbell
 */
public interface HasId {

    /**
     * Sets the id.
     *
     * @param id the id
     */
    void setId(String id);

    /**
     * Returns the id.
     *
     * @return the id
     */
    String getId();

}
