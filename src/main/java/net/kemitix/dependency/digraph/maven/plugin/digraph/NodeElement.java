package net.kemitix.dependency.digraph.maven.plugin.digraph;

import lombok.Getter;
import lombok.Setter;

import net.kemitix.dependency.digraph.maven.plugin.PackageData;
import net.kemitix.node.Node;

/**
 * Represents a node on the graph.
 */
@Setter
@Getter
public class NodeElement extends GraphElement
        implements HasId, HasLabel, HasStyle, EdgeEndpoint {

    private String id;

    private String label;

    private String style = "";

    private Node<PackageData> packageDataNode;

    /**
     * Constructor.
     *
     * @param packageDataNode the package data node for this node element
     * @param id              the id of the node
     * @param label           the label of the node
     */
    public NodeElement(
            final Node<PackageData> packageDataNode, final String id,
            final String label) {
        setPackageDataNode(packageDataNode);
        setId(id);
        setLabel(label);
    }

}
