/**
 *
 */
package com.alphasystem.morphologicalengine.model;

/**
 * @author sali
 */
public abstract class DetailedConjugationPair<G extends ConjugationGroup> {

    private G leftSideConjugations;
    private G rightSideConjugations;

    public DetailedConjugationPair(){
    }

    public DetailedConjugationPair(G leftSideConjugations, G rightSideConjugations) {
        this.leftSideConjugations = leftSideConjugations;
        this.rightSideConjugations = rightSideConjugations;
    }

    public G getLeftSideConjugations() {
        return leftSideConjugations;
    }

    public G getRightSideConjugations() {
        return rightSideConjugations;
    }

    public void setLeftSideConjugations(G leftSideConjugations) {
        this.leftSideConjugations = leftSideConjugations;
    }

    public void setRightSideConjugations(G rightSideConjugations) {
        this.rightSideConjugations = rightSideConjugations;
    }
}
