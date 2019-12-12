package com.company;

/**
 * @author Jasper Roloff, Matrikelnummer 18837
 */

public class MediaWikiPage extends ElektronischesMedium { // could additionally implement Buch class, but doesn't have an ISBN
    private MediaWikiPageRevision latestRevision;
    private String regal;

    public MediaWikiPageRevision getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(MediaWikiPageRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    public String getRegal() {
        return regal;
    }

    public void setRegal(String regal) {
        this.regal = regal;
    }

    @Override
    public void validate() throws ValidationException {
        // validate fields inherited from superclass
        super.validate();

        // validate field revision
        if (this.latestRevision == null) {
            throw new ValidationException("empty revision not allowed");
        }
    }
}
