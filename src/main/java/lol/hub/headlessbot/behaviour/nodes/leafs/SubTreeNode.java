package lol.hub.headlessbot.behaviour.nodes.leafs;

import lol.hub.headlessbot.behaviour.BehaviourTree;
import lol.hub.headlessbot.behaviour.State;

public final class SubTreeNode extends TaskNode {
    private final BehaviourTree tree;

    public SubTreeNode(BehaviourTree tree) {
        this.tree = tree;
        tree.root().parent(this);
    }

    @Override
    public State run() {
        return tree.run();
    }
}