package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Media {
    @JsonProperty("reddit_video")
    public RedditVideo getReddit_video() {
        return this.reddit_video; }
    public void setReddit_video(RedditVideo reddit_video) {
        this.reddit_video = reddit_video; }
    RedditVideo reddit_video;
    @JsonProperty("oembed")
    public Oembed getOembed() {
        return this.oembed; }
    public void setOembed(Oembed oembed) {
        this.oembed = oembed; }
    Oembed oembed;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
}
