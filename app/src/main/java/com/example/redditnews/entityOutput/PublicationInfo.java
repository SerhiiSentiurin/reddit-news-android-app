package com.example.redditnews.entityOutput;

import androidx.annotation.NonNull;

public class PublicationInfo {
    private String authorName;
    private String sourceHref;
    private String createdMillis;
    private String numberOfComments;


    public PublicationInfo(String authorName, String sourceHref, String createdMillis, String numberOfComments) {
        this.authorName = authorName;
        this.sourceHref = sourceHref;
        this.createdMillis = createdMillis;
        this.numberOfComments = numberOfComments;
    }

    public PublicationInfo() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSourceHref() {
        return sourceHref;
    }

    public void setSourceHref(String sourceHref) {
        this.sourceHref = sourceHref;
    }

    public String getCreatedMillis() {
        return createdMillis;
    }

    public void setCreatedMillis(String createdMillis) {
        this.createdMillis = createdMillis;
    }

    public String getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(String numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    @NonNull
    @Override
    public String toString() {
        return "PublicationInfo{" +
                "AuthorName='" + authorName + '\'' +
                ", sourceHref='" + sourceHref + '\'' +
                ", createdMillis='" + createdMillis + '\'' +
                ", numberOfComments=" + numberOfComments +
                '}';
    }
}
