package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Preview {
    @JsonProperty("images")
    public ArrayList<Image> getImages() {
        return this.images; }
    public void setImages(ArrayList<Image> images) {
        this.images = images; }
    ArrayList<Image> images;
    @JsonProperty("enabled")
    public boolean getEnabled() {
        return this.enabled; }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled; }
    boolean enabled;
    @JsonProperty("reddit_video_preview")
    public RedditVideoPreview getReddit_video_preview() {
        return this.reddit_video_preview; }
    public void setReddit_video_preview(RedditVideoPreview reddit_video_preview) {
        this.reddit_video_preview = reddit_video_preview; }
    RedditVideoPreview reddit_video_preview;
}
