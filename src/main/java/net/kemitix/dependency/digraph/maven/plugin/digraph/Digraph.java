package net.kemitix.dependency.digraph.maven.plugin.digraph;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * A GraphViz Directed Graph root node.
 *
 * @author pcampbell
 */
public class Digraph extends GraphElement implements ElementContainer {

    /**
     * A list of ordered elements.
     * <p>
     * These are in the order that they are to be present in the generate file.
     */
    @Getter
    private final List<GraphElement> elements = new ArrayList<>();

    @Override
    public boolean add(
            final GraphElement graphElement) {
        return elements.add(graphElement);
    }

}
