package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AllAwarding {
    @JsonProperty("giver_coin_reward")
    public Object getGiver_coin_reward() {
        return this.giver_coin_reward; }
    public void setGiver_coin_reward(Object giver_coin_reward) {
        this.giver_coin_reward = giver_coin_reward; }
    Object giver_coin_reward;
    @JsonProperty("subreddit_id")
    public String getSubreddit_id() {
        return this.subreddit_id; }
    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id; }
    String subreddit_id;
    @JsonProperty("is_new")
    public boolean getIs_new() {
        return this.is_new; }
    public void setIs_new(boolean is_new) {
        this.is_new = is_new; }
    boolean is_new;
    @JsonProperty("days_of_drip_extension")
    public int getDays_of_drip_extension() {
        return this.days_of_drip_extension; }
    public void setDays_of_drip_extension(int days_of_drip_extension) {
        this.days_of_drip_extension = days_of_drip_extension; }
    int days_of_drip_extension;
    @JsonProperty("coin_price")
    public int getCoin_price() {
        return this.coin_price; }
    public void setCoin_price(int coin_price) {
        this.coin_price = coin_price; }
    int coin_price;
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
    @JsonProperty("penny_donate")
    public Object getPenny_donate() {
        return this.penny_donate; }
    public void setPenny_donate(Object penny_donate) {
        this.penny_donate = penny_donate; }
    Object penny_donate;
    @JsonProperty("award_sub_type")
    public String getAward_sub_type() {
        return this.award_sub_type; }
    public void setAward_sub_type(String award_sub_type) {
        this.award_sub_type = award_sub_type; }
    String award_sub_type;
    @JsonProperty("coin_reward")
    public int getCoin_reward() {
        return this.coin_reward; }
    public void setCoin_reward(int coin_reward) {
        this.coin_reward = coin_reward; }
    int coin_reward;
    @JsonProperty("icon_url")
    public String getIcon_url() {
        return this.icon_url; }
    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url; }
    String icon_url;
    @JsonProperty("days_of_premium")
    public int getDays_of_premium() {
        return this.days_of_premium; }
    public void setDays_of_premium(int days_of_premium) {
        this.days_of_premium = days_of_premium; }
    int days_of_premium;
    @JsonProperty("tiers_by_required_awardings")
    public Object getTiers_by_required_awardings() {
        return this.tiers_by_required_awardings; }
    public void setTiers_by_required_awardings(Object tiers_by_required_awardings) {
        this.tiers_by_required_awardings = tiers_by_required_awardings; }
    Object tiers_by_required_awardings;
    @JsonProperty("resized_icons")
    public ArrayList<ResizedIcon> getResized_icons() {
        return this.resized_icons; }
    public void setResized_icons(ArrayList<ResizedIcon> resized_icons) {
        this.resized_icons = resized_icons; }
    ArrayList<ResizedIcon> resized_icons;
    @JsonProperty("icon_width")
    public int getIcon_width() {
        return this.icon_width; }
    public void setIcon_width(int icon_width) {
        this.icon_width = icon_width; }
    int icon_width;
    @JsonProperty("static_icon_width")
    public int getStatic_icon_width() {
        return this.static_icon_width; }
    public void setStatic_icon_width(int static_icon_width) {
        this.static_icon_width = static_icon_width; }
    int static_icon_width;
    @JsonProperty("start_date")
    public Object getStart_date() {
        return this.start_date; }
    public void setStart_date(Object start_date) {
        this.start_date = start_date; }
    Object start_date;
    @JsonProperty("is_enabled")
    public boolean getIs_enabled() {
        return this.is_enabled; }
    public void setIs_enabled(boolean is_enabled) {
        this.is_enabled = is_enabled; }
    boolean is_enabled;
    @JsonProperty("awardings_required_to_grant_benefits")
    public Object getAwardings_required_to_grant_benefits() {
        return this.awardings_required_to_grant_benefits; }
    public void setAwardings_required_to_grant_benefits(Object awardings_required_to_grant_benefits) {
        this.awardings_required_to_grant_benefits = awardings_required_to_grant_benefits; }
    Object awardings_required_to_grant_benefits;
    @JsonProperty("description")
    public String getDescription() {
        return this.description; }
    public void setDescription(String description) {
        this.description = description; }
    String description;
    @JsonProperty("end_date")
    public Object getEnd_date() {
        return this.end_date; }
    public void setEnd_date(Object end_date) {
        this.end_date = end_date; }
    Object end_date;
    @JsonProperty("sticky_duration_seconds")
    public Object getSticky_duration_seconds() {
        return this.sticky_duration_seconds; }
    public void setSticky_duration_seconds(Object sticky_duration_seconds) {
        this.sticky_duration_seconds = sticky_duration_seconds; }
    Object sticky_duration_seconds;
    @JsonProperty("subreddit_coin_reward")
    public int getSubreddit_coin_reward() {
        return this.subreddit_coin_reward; }
    public void setSubreddit_coin_reward(int subreddit_coin_reward) {
        this.subreddit_coin_reward = subreddit_coin_reward; }
    int subreddit_coin_reward;
    @JsonProperty("count")
    public int getCount() {
        return this.count; }
    public void setCount(int count) {
        this.count = count; }
    int count;
    @JsonProperty("static_icon_height")
    public int getStatic_icon_height() {
        return this.static_icon_height; }
    public void setStatic_icon_height(int static_icon_height) {
        this.static_icon_height = static_icon_height; }
    int static_icon_height;
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("resized_static_icons")
    public ArrayList<ResizedStaticIcon> getResized_static_icons() {
        return this.resized_static_icons; }
    public void setResized_static_icons(ArrayList<ResizedStaticIcon> resized_static_icons) {
        this.resized_static_icons = resized_static_icons; }
    ArrayList<ResizedStaticIcon> resized_static_icons;
    @JsonProperty("icon_format")
    public String getIcon_format() {
        return this.icon_format; }
    public void setIcon_format(String icon_format) {
        this.icon_format = icon_format; }
    String icon_format;
    @JsonProperty("icon_height")
    public int getIcon_height() {
        return this.icon_height; }
    public void setIcon_height(int icon_height) {
        this.icon_height = icon_height; }
    int icon_height;
    @JsonProperty("penny_price")
    public int getPenny_price() {
        return this.penny_price; }
    public void setPenny_price(int penny_price) {
        this.penny_price = penny_price; }
    int penny_price;
    @JsonProperty("award_type")
    public String getAward_type() {
        return this.award_type; }
    public void setAward_type(String award_type) {
        this.award_type = award_type; }
    String award_type;
    @JsonProperty("static_icon_url")
    public String getStatic_icon_url() {
        return this.static_icon_url; }
    public void setStatic_icon_url(String static_icon_url) {
        this.static_icon_url = static_icon_url; }
    String static_icon_url;
}
