package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ChildData {

    @JsonProperty("before")
    public Object getBefore() {
        return this.before; }
    public void setBefore(Object before) {
        this.before = before; }
    Object before;
    @JsonProperty("approved_at_utc")
    public Object getApproved_at_utc() {
        return this.approved_at_utc; }
    public void setApproved_at_utc(Object approved_at_utc) {
        this.approved_at_utc = approved_at_utc; }
    Object approved_at_utc;
    @JsonProperty("subreddit")
    public String getSubreddit() {
        return this.subreddit; }
    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit; }
    String subreddit;
    @JsonProperty("selftext")
    public String getSelftext() {
        return this.selftext; }
    public void setSelftext(String selftext) {
        this.selftext = selftext; }
    String selftext;
    @JsonProperty("author_fullname")
    public String getAuthor_fullname() {
        return this.author_fullname; }
    public void setAuthor_fullname(String author_fullname) {
        this.author_fullname = author_fullname; }
    String author_fullname;
    @JsonProperty("saved")
    public boolean getSaved() {
        return this.saved; }
    public void setSaved(boolean saved) {
        this.saved = saved; }
    boolean saved;
    @JsonProperty("mod_reason_title")
    public Object getMod_reason_title() {
        return this.mod_reason_title; }
    public void setMod_reason_title(Object mod_reason_title) {
        this.mod_reason_title = mod_reason_title; }
    Object mod_reason_title;
    @JsonProperty("gilded")
    public int getGilded() {
        return this.gilded; }
    public void setGilded(int gilded) {
        this.gilded = gilded; }
    int gilded;
    @JsonProperty("clicked")
    public boolean getClicked() {
        return this.clicked; }
    public void setClicked(boolean clicked) {
        this.clicked = clicked; }
    boolean clicked;
    @JsonProperty("title")
    public String getTitle() {
        return this.title; }
    public void setTitle(String title) {
        this.title = title; }
    String title;
    @JsonProperty("link_flair_richtext")
    public ArrayList<LinkFlairRichtext> getLink_flair_richtext() {
        return this.link_flair_richtext; }
    public void setLink_flair_richtext(ArrayList<LinkFlairRichtext> link_flair_richtext) {
        this.link_flair_richtext = link_flair_richtext; }
    ArrayList<LinkFlairRichtext> link_flair_richtext;
    @JsonProperty("subreddit_name_prefixed")
    public String getSubreddit_name_prefixed() {
        return this.subreddit_name_prefixed; }
    public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {
        this.subreddit_name_prefixed = subreddit_name_prefixed; }
    String subreddit_name_prefixed;
    @JsonProperty("hidden")
    public boolean getHidden() {
        return this.hidden; }
    public void setHidden(boolean hidden) {
        this.hidden = hidden; }
    boolean hidden;
    @JsonProperty("pwls")
    public int getPwls() {
        return this.pwls; }
    public void setPwls(int pwls) {
        this.pwls = pwls; }
    int pwls;
    @JsonProperty("link_flair_css_class")
    public String getLink_flair_css_class() {
        return this.link_flair_css_class; }
    public void setLink_flair_css_class(String link_flair_css_class) {
        this.link_flair_css_class = link_flair_css_class; }
    String link_flair_css_class;
    @JsonProperty("downs")
    public int getDowns() {
        return this.downs; }
    public void setDowns(int downs) {
        this.downs = downs; }
    int downs;
    @JsonProperty("thumbnail_height")
    public int getThumbnail_height() {
        return this.thumbnail_height; }
    public void setThumbnail_height(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height; }
    int thumbnail_height;
    @JsonProperty("top_awarded_type")
    public String getTop_awarded_type() {
        return this.top_awarded_type; }
    public void setTop_awarded_type(String top_awarded_type) {
        this.top_awarded_type = top_awarded_type; }
    String top_awarded_type;
    @JsonProperty("hide_score")
    public boolean getHide_score() {
        return this.hide_score; }
    public void setHide_score(boolean hide_score) {
        this.hide_score = hide_score; }
    boolean hide_score;
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("quarantine")
    public boolean getQuarantine() {
        return this.quarantine; }
    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine; }
    boolean quarantine;
    @JsonProperty("link_flair_text_color")
    public String getLink_flair_text_color() {
        return this.link_flair_text_color; }
    public void setLink_flair_text_color(String link_flair_text_color) {
        this.link_flair_text_color = link_flair_text_color; }
    String link_flair_text_color;
    @JsonProperty("upvote_ratio")
    public double getUpvote_ratio() {
        return this.upvote_ratio; }
    public void setUpvote_ratio(double upvote_ratio) {
        this.upvote_ratio = upvote_ratio; }
    double upvote_ratio;
    @JsonProperty("author_flair_background_color")
    public Object getAuthor_flair_background_color() {
        return this.author_flair_background_color; }
    public void setAuthor_flair_background_color(Object author_flair_background_color) {
        this.author_flair_background_color = author_flair_background_color; }
    Object author_flair_background_color;
    @JsonProperty("subreddit_type")
    public String getSubreddit_type() {
        return this.subreddit_type; }
    public void setSubreddit_type(String subreddit_type) {
        this.subreddit_type = subreddit_type; }
    String subreddit_type;
    @JsonProperty("ups")
    public int getUps() {
        return this.ups; }
    public void setUps(int ups) {
        this.ups = ups; }
    int ups;
    @JsonProperty("total_awards_received")
    public int getTotal_awards_received() {
        return this.total_awards_received; }
    public void setTotal_awards_received(int total_awards_received) {
        this.total_awards_received = total_awards_received; }
    int total_awards_received;
    @JsonProperty("media_embed")
    public MediaEmbed getMedia_embed() {
        return this.media_embed; }
    public void setMedia_embed(MediaEmbed media_embed) {
        this.media_embed = media_embed; }
    MediaEmbed media_embed;
    @JsonProperty("thumbnail_width")
    public int getThumbnail_width() {
        return this.thumbnail_width; }
    public void setThumbnail_width(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width; }
    int thumbnail_width;
    @JsonProperty("author_flair_template_id")
    public Object getAuthor_flair_template_id() {
        return this.author_flair_template_id; }
    public void setAuthor_flair_template_id(Object author_flair_template_id) {
        this.author_flair_template_id = author_flair_template_id; }
    Object author_flair_template_id;
    @JsonProperty("is_original_content")
    public boolean getIs_original_content() {
        return this.is_original_content; }
    public void setIs_original_content(boolean is_original_content) {
        this.is_original_content = is_original_content; }
    boolean is_original_content;
    @JsonProperty("user_reports")
    public ArrayList<Object> getUser_reports() {
        return this.user_reports; }
    public void setUser_reports(ArrayList<Object> user_reports) {
        this.user_reports = user_reports; }
    ArrayList<Object> user_reports;
    @JsonProperty("secure_media")
    public SecureMedia getSecure_media() {
        return this.secure_media; }
    public void setSecure_media(SecureMedia secure_media) {
        this.secure_media = secure_media; }
    SecureMedia secure_media;
    @JsonProperty("is_reddit_media_domain")
    public boolean getIs_reddit_media_domain() {
        return this.is_reddit_media_domain; }
    public void setIs_reddit_media_domain(boolean is_reddit_media_domain) {
        this.is_reddit_media_domain = is_reddit_media_domain; }
    boolean is_reddit_media_domain;
    @JsonProperty("is_meta")
    public boolean getIs_meta() {
        return this.is_meta; }
    public void setIs_meta(boolean is_meta) {
        this.is_meta = is_meta; }
    boolean is_meta;
    @JsonProperty("category")
    public Object getCategory() {
        return this.category; }
    public void setCategory(Object category) {
        this.category = category; }
    Object category;
    @JsonProperty("secure_media_embed")
    public SecureMediaEmbed getSecure_media_embed() {
        return this.secure_media_embed; }
    public void setSecure_media_embed(SecureMediaEmbed secure_media_embed) {
        this.secure_media_embed = secure_media_embed; }
    SecureMediaEmbed secure_media_embed;
    @JsonProperty("link_flair_text")
    public String getLink_flair_text() {
        return this.link_flair_text; }
    public void setLink_flair_text(String link_flair_text) {
        this.link_flair_text = link_flair_text; }
    String link_flair_text;
    @JsonProperty("can_mod_post")
    public boolean getCan_mod_post() {
        return this.can_mod_post; }
    public void setCan_mod_post(boolean can_mod_post) {
        this.can_mod_post = can_mod_post; }
    boolean can_mod_post;
    @JsonProperty("score")
    public int getScore() {
        return this.score; }
    public void setScore(int score) {
        this.score = score; }
    int score;
    @JsonProperty("approved_by")
    public Object getApproved_by() {
        return this.approved_by; }
    public void setApproved_by(Object approved_by) {
        this.approved_by = approved_by; }
    Object approved_by;
    @JsonProperty("is_created_from_ads_ui")
    public boolean getIs_created_from_ads_ui() {
        return this.is_created_from_ads_ui; }
    public void setIs_created_from_ads_ui(boolean is_created_from_ads_ui) {
        this.is_created_from_ads_ui = is_created_from_ads_ui; }
    boolean is_created_from_ads_ui;
    @JsonProperty("author_premium")
    public boolean getAuthor_premium() {
        return this.author_premium; }
    public void setAuthor_premium(boolean author_premium) {
        this.author_premium = author_premium; }
    boolean author_premium;
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return this.thumbnail; }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail; }
    String thumbnail;
    @JsonProperty("edited")
    public boolean getEdited() {
        return this.edited; }
    public void setEdited(boolean edited) {
        this.edited = edited; }
    boolean edited;
    @JsonProperty("author_flair_css_class")
    public Object getAuthor_flair_css_class() {
        return this.author_flair_css_class; }
    public void setAuthor_flair_css_class(Object author_flair_css_class) {
        this.author_flair_css_class = author_flair_css_class; }
    Object author_flair_css_class;
    @JsonProperty("author_flair_richtext")
    public ArrayList<Object> getAuthor_flair_richtext() {
        return this.author_flair_richtext; }
    public void setAuthor_flair_richtext(ArrayList<Object> author_flair_richtext) {
        this.author_flair_richtext = author_flair_richtext; }
    ArrayList<Object> author_flair_richtext;
    @JsonProperty("gildings")
    public Gildings getGildings() {
        return this.gildings; }
    public void setGildings(Gildings gildings) {
        this.gildings = gildings; }
    Gildings gildings;
    @JsonProperty("post_hint")
    public String getPost_hint() {
        return this.post_hint; }
    public void setPost_hint(String post_hint) {
        this.post_hint = post_hint; }
    String post_hint;
    @JsonProperty("content_categories")
    public ArrayList<String> getContent_categories() {
        return this.content_categories; }
    public void setContent_categories(ArrayList<String> content_categories) {
        this.content_categories = content_categories; }
    ArrayList<String> content_categories;
    @JsonProperty("is_self")
    public boolean getIs_self() {
        return this.is_self; }
    public void setIs_self(boolean is_self) {
        this.is_self = is_self; }
    boolean is_self;
    @JsonProperty("mod_note")
    public Object getMod_note() {
        return this.mod_note; }
    public void setMod_note(Object mod_note) {
        this.mod_note = mod_note; }
    Object mod_note;
    @JsonProperty("created")
    public int getCreated() {
        return this.created; }
    public void setCreated(int created) {
        this.created = created; }
    int created;
    @JsonProperty("link_flair_type")
    public String getLink_flair_type() {
        return this.link_flair_type; }
    public void setLink_flair_type(String link_flair_type) {
        this.link_flair_type = link_flair_type; }
    String link_flair_type;
    @JsonProperty("wls")
    public int getWls() {
        return this.wls; }
    public void setWls(int wls) {
        this.wls = wls; }
    int wls;
    @JsonProperty("removed_by_category")
    public Object getRemoved_by_category() {
        return this.removed_by_category; }
    public void setRemoved_by_category(Object removed_by_category) {
        this.removed_by_category = removed_by_category; }
    Object removed_by_category;
    @JsonProperty("banned_by")
    public Object getBanned_by() {
        return this.banned_by; }
    public void setBanned_by(Object banned_by) {
        this.banned_by = banned_by; }
    Object banned_by;
    @JsonProperty("author_flair_type")
    public String getAuthor_flair_type() {
        return this.author_flair_type; }
    public void setAuthor_flair_type(String author_flair_type) {
        this.author_flair_type = author_flair_type; }
    String author_flair_type;
    @JsonProperty("domain")
    public String getDomain() {
        return this.domain; }
    public void setDomain(String domain) {
        this.domain = domain; }
    String domain;
    @JsonProperty("allow_live_comments")
    public boolean getAllow_live_comments() {
        return this.allow_live_comments; }
    public void setAllow_live_comments(boolean allow_live_comments) {
        this.allow_live_comments = allow_live_comments; }
    boolean allow_live_comments;
    @JsonProperty("selftext_html")
    public Object getSelftext_html() {
        return this.selftext_html; }
    public void setSelftext_html(Object selftext_html) {
        this.selftext_html = selftext_html; }
    Object selftext_html;
    @JsonProperty("likes")
    public Object getLikes() {
        return this.likes; }
    public void setLikes(Object likes) {
        this.likes = likes; }
    Object likes;
    @JsonProperty("suggested_sort")
    public String getSuggested_sort() {
        return this.suggested_sort; }
    public void setSuggested_sort(String suggested_sort) {
        this.suggested_sort = suggested_sort; }
    String suggested_sort;
    @JsonProperty("banned_at_utc")
    public Object getBanned_at_utc() {
        return this.banned_at_utc; }
    public void setBanned_at_utc(Object banned_at_utc) {
        this.banned_at_utc = banned_at_utc; }
    Object banned_at_utc;
    @JsonProperty("url_overridden_by_dest")
    public String getUrl_overridden_by_dest() {
        return this.url_overridden_by_dest; }
    public void setUrl_overridden_by_dest(String url_overridden_by_dest) {
        this.url_overridden_by_dest = url_overridden_by_dest; }
    String url_overridden_by_dest;
    @JsonProperty("view_count")
    public Object getView_count() {
        return this.view_count; }
    public void setView_count(Object view_count) {
        this.view_count = view_count; }
    Object view_count;
    @JsonProperty("archived")
    public boolean getArchived() {
        return this.archived; }
    public void setArchived(boolean archived) {
        this.archived = archived; }
    boolean archived;
    @JsonProperty("no_follow")
    public boolean getNo_follow() {
        return this.no_follow; }
    public void setNo_follow(boolean no_follow) {
        this.no_follow = no_follow; }
    boolean no_follow;
    @JsonProperty("is_crosspostable")
    public boolean getIs_crosspostable() {
        return this.is_crosspostable; }
    public void setIs_crosspostable(boolean is_crosspostable) {
        this.is_crosspostable = is_crosspostable; }
    boolean is_crosspostable;
    @JsonProperty("pinned")
    public boolean getPinned() {
        return this.pinned; }
    public void setPinned(boolean pinned) {
        this.pinned = pinned; }
    boolean pinned;
    @JsonProperty("over_18")
    public boolean getOver_18() {
        return this.over_18; }
    public void setOver_18(boolean over_18) {
        this.over_18 = over_18; }
    boolean over_18;
    @JsonProperty("preview")
    public Preview getPreview() {
        return this.preview; }
    public void setPreview(Preview preview) {
        this.preview = preview; }
    Preview preview;
    @JsonProperty("all_awardings")
    public ArrayList<AllAwarding> getAll_awardings() {
        return this.all_awardings; }
    public void setAll_awardings(ArrayList<AllAwarding> all_awardings) {
        this.all_awardings = all_awardings; }
    ArrayList<AllAwarding> all_awardings;
    @JsonProperty("awarders")
    public ArrayList<Object> getAwarders() {
        return this.awarders; }
    public void setAwarders(ArrayList<Object> awarders) {
        this.awarders = awarders; }
    ArrayList<Object> awarders;
    @JsonProperty("media_only")
    public boolean getMedia_only() {
        return this.media_only; }
    public void setMedia_only(boolean media_only) {
        this.media_only = media_only; }
    boolean media_only;
    @JsonProperty("can_gild")
    public boolean getCan_gild() {
        return this.can_gild; }
    public void setCan_gild(boolean can_gild) {
        this.can_gild = can_gild; }
    boolean can_gild;
    @JsonProperty("spoiler")
    public boolean getSpoiler() {
        return this.spoiler; }
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler; }
    boolean spoiler;
    @JsonProperty("locked")
    public boolean getLocked() {
        return this.locked; }
    public void setLocked(boolean locked) {
        this.locked = locked; }
    boolean locked;
    @JsonProperty("author_flair_text")
    public Object getAuthor_flair_text() {
        return this.author_flair_text; }
    public void setAuthor_flair_text(Object author_flair_text) {
        this.author_flair_text = author_flair_text; }
    Object author_flair_text;
    @JsonProperty("treatment_tags")
    public ArrayList<Object> getTreatment_tags() {
        return this.treatment_tags; }
    public void setTreatment_tags(ArrayList<Object> treatment_tags) {
        this.treatment_tags = treatment_tags; }
    ArrayList<Object> treatment_tags;
    @JsonProperty("visited")
    public boolean getVisited() {
        return this.visited; }
    public void setVisited(boolean visited) {
        this.visited = visited; }
    boolean visited;
    @JsonProperty("removed_by")
    public Object getRemoved_by() {
        return this.removed_by; }
    public void setRemoved_by(Object removed_by) {
        this.removed_by = removed_by; }
    Object removed_by;
    @JsonProperty("num_reports")
    public Object getNum_reports() {
        return this.num_reports; }
    public void setNum_reports(Object num_reports) {
        this.num_reports = num_reports; }
    Object num_reports;
    @JsonProperty("distinguished")
    public Object getDistinguished() {
        return this.distinguished; }
    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished; }
    Object distinguished;
    @JsonProperty("subreddit_id")
    public String getSubreddit_id() {
        return this.subreddit_id; }
    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id; }
    String subreddit_id;
    @JsonProperty("author_is_blocked")
    public boolean getAuthor_is_blocked() {
        return this.author_is_blocked; }
    public void setAuthor_is_blocked(boolean author_is_blocked) {
        this.author_is_blocked = author_is_blocked; }
    boolean author_is_blocked;
    @JsonProperty("mod_reason_by")
    public Object getMod_reason_by() {
        return this.mod_reason_by; }
    public void setMod_reason_by(Object mod_reason_by) {
        this.mod_reason_by = mod_reason_by; }
    Object mod_reason_by;
    @JsonProperty("removal_reason")
    public Object getRemoval_reason() {
        return this.removal_reason; }
    public void setRemoval_reason(Object removal_reason) {
        this.removal_reason = removal_reason; }
    Object removal_reason;
    @JsonProperty("link_flair_background_color")
    public String getLink_flair_background_color() {
        return this.link_flair_background_color; }
    public void setLink_flair_background_color(String link_flair_background_color) {
        this.link_flair_background_color = link_flair_background_color; }
    String link_flair_background_color;
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
    @JsonProperty("is_robot_indexable")
    public boolean getIs_robot_indexable() {
        return this.is_robot_indexable; }
    public void setIs_robot_indexable(boolean is_robot_indexable) {
        this.is_robot_indexable = is_robot_indexable; }
    boolean is_robot_indexable;
    @JsonProperty("report_reasons")
    public Object getReport_reasons() {
        return this.report_reasons; }
    public void setReport_reasons(Object report_reasons) {
        this.report_reasons = report_reasons; }
    Object report_reasons;
    @JsonProperty("author")
    public String getAuthor() {
        return this.author; }
    public void setAuthor(String author) {
        this.author = author; }
    String author;
    @JsonProperty("discussion_type")
    public Object getDiscussion_type() {
        return this.discussion_type; }
    public void setDiscussion_type(Object discussion_type) {
        this.discussion_type = discussion_type; }
    Object discussion_type;
    @JsonProperty("num_comments")
    public String getNum_comments() {
        return this.num_comments; }
    public void setNum_comments(String num_comments) {
        this.num_comments = num_comments; }
    String num_comments;
    @JsonProperty("send_replies")
    public boolean getSend_replies() {
        return this.send_replies; }
    public void setSend_replies(boolean send_replies) {
        this.send_replies = send_replies; }
    boolean send_replies;
    @JsonProperty("whitelist_status")
    public String getWhitelist_status() {
        return this.whitelist_status; }
    public void setWhitelist_status(String whitelist_status) {
        this.whitelist_status = whitelist_status; }
    String whitelist_status;
    @JsonProperty("contest_mode")
    public boolean getContest_mode() {
        return this.contest_mode; }
    public void setContest_mode(boolean contest_mode) {
        this.contest_mode = contest_mode; }
    boolean contest_mode;
    @JsonProperty("mod_reports")
    public ArrayList<Object> getMod_reports() {
        return this.mod_reports; }
    public void setMod_reports(ArrayList<Object> mod_reports) {
        this.mod_reports = mod_reports; }
    ArrayList<Object> mod_reports;
    @JsonProperty("author_patreon_flair")
    public boolean getAuthor_patreon_flair() {
        return this.author_patreon_flair; }
    public void setAuthor_patreon_flair(boolean author_patreon_flair) {
        this.author_patreon_flair = author_patreon_flair; }
    boolean author_patreon_flair;
    @JsonProperty("author_flair_text_color")
    public Object getAuthor_flair_text_color() {
        return this.author_flair_text_color; }
    public void setAuthor_flair_text_color(Object author_flair_text_color) {
        this.author_flair_text_color = author_flair_text_color; }
    Object author_flair_text_color;
    @JsonProperty("permalink")
    public String getPermalink() {
        return this.permalink; }
    public void setPermalink(String permalink) {
        this.permalink = permalink; }
    String permalink;
    @JsonProperty("parent_whitelist_status")
    public String getParent_whitelist_status() {
        return this.parent_whitelist_status; }
    public void setParent_whitelist_status(String parent_whitelist_status) {
        this.parent_whitelist_status = parent_whitelist_status; }
    String parent_whitelist_status;
    @JsonProperty("stickied")
    public boolean getStickied() {
        return this.stickied; }
    public void setStickied(boolean stickied) {
        this.stickied = stickied; }
    boolean stickied;
    @JsonProperty("url")
    public String getUrl() {
        return this.url; }
    public void setUrl(String url) {
        this.url = url; }
    String url;
    @JsonProperty("subreddit_subscribers")
    public int getSubreddit_subscribers() {
        return this.subreddit_subscribers; }
    public void setSubreddit_subscribers(int subreddit_subscribers) {
        this.subreddit_subscribers = subreddit_subscribers; }
    int subreddit_subscribers;
    @JsonProperty("created_utc")
    public long getCreated_utc() {
        return this.created_utc; }
    public void setCreated_utc(long created_utc) {
        this.created_utc = created_utc; }
    long created_utc;
    @JsonProperty("num_crossposts")
    public int getNum_crossposts() {
        return this.num_crossposts; }
    public void setNum_crossposts(int num_crossposts) {
        this.num_crossposts = num_crossposts; }
    int num_crossposts;
    @JsonProperty("media")
    public Media getMedia() {
        return this.media; }
    public void setMedia(Media media) {
        this.media = media; }
    Media media;
    @JsonProperty("is_video")
    public boolean getIs_video() {
        return this.is_video; }
    public void setIs_video(boolean is_video) {
        this.is_video = is_video; }
    boolean is_video;
    @JsonProperty("link_flair_template_id")
    public String getLink_flair_template_id() {
        return this.link_flair_template_id; }
    public void setLink_flair_template_id(String link_flair_template_id) {
        this.link_flair_template_id = link_flair_template_id; }
    String link_flair_template_id;
    @JsonProperty("author_cakeday")
    public boolean getAuthor_cakeday() {
        return this.author_cakeday; }
    public void setAuthor_cakeday(boolean author_cakeday) {
        this.author_cakeday = author_cakeday; }
    boolean author_cakeday;
    @JsonProperty("crosspost_parent_list")
    public ArrayList<CrosspostParentList> getCrosspost_parent_list() {
        return this.crosspost_parent_list; }
    public void setCrosspost_parent_list(ArrayList<CrosspostParentList> crosspost_parent_list) {
        this.crosspost_parent_list = crosspost_parent_list; }
    ArrayList<CrosspostParentList> crosspost_parent_list;
    @JsonProperty("crosspost_parent")
    public String getCrosspost_parent() {
        return this.crosspost_parent; }
    public void setCrosspost_parent(String crosspost_parent) {
        this.crosspost_parent = crosspost_parent; }
    String crosspost_parent;
}
