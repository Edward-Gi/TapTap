package com.test.taptapspider.po.vo.base;

import java.util.List;

public class Game {
    private long id;
    private String identifier;
    private String title;
    private List<String> title_labels;
    private Icon icon;
    private String sell_price;
    private String category;
    private Uri uri;
    private boolean can_view;
    private String author;
    private Price price;
    private int button_flag;
    private String button_label;
    private int style;
    private boolean hidden_button;
    private Ad_banner ad_banner;
    private Banner banner;
    private List<Tags> tags;
    private Stat stat;
    private Download download;
    private Event_log event_log;
    private Serial_number serial_number;
    private List<Highlight_tags> highlight_tags;
    private Log log;
    private Top_banner top_banner;

    public Game(){}

    public Game(long id, String identifier, String title, List<String> title_labels, Icon icon, String sell_price, String category, Uri uri, boolean can_view, String author, Price price, int button_flag, String button_label, int style, boolean hidden_button, Ad_banner ad_banner, Banner banner, List<Tags> tags, Stat stat, Download download, Event_log event_log, Serial_number serial_number, List<Highlight_tags> highlight_tags, Log log, Top_banner top_banner) {
        this.id = id;
        this.identifier = identifier;
        this.title = title;
        this.title_labels = title_labels;
        this.icon = icon;
        this.sell_price = sell_price;
        this.category = category;
        this.uri = uri;
        this.can_view = can_view;
        this.author = author;
        this.price = price;
        this.button_flag = button_flag;
        this.button_label = button_label;
        this.style = style;
        this.hidden_button = hidden_button;
        this.ad_banner = ad_banner;
        this.banner = banner;
        this.tags = tags;
        this.stat = stat;
        this.download = download;
        this.event_log = event_log;
        this.serial_number = serial_number;
        this.highlight_tags = highlight_tags;
        this.log = log;
        this.top_banner = top_banner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTitle_labels() {
        return title_labels;
    }

    public void setTitle_labels(List<String> title_labels) {
        this.title_labels = title_labels;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getSell_price() {
        return sell_price;
    }

    public void setSell_price(String sell_price) {
        this.sell_price = sell_price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public boolean isCan_view() {
        return can_view;
    }

    public void setCan_view(boolean can_view) {
        this.can_view = can_view;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getButton_flag() {
        return button_flag;
    }

    public void setButton_flag(int button_flag) {
        this.button_flag = button_flag;
    }

    public String getButton_label() {
        return button_label;
    }

    public void setButton_label(String button_label) {
        this.button_label = button_label;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public boolean isHidden_button() {
        return hidden_button;
    }

    public void setHidden_button(boolean hidden_button) {
        this.hidden_button = hidden_button;
    }

    public Ad_banner getAd_banner() {
        return ad_banner;
    }

    public void setAd_banner(Ad_banner ad_banner) {
        this.ad_banner = ad_banner;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public Download getDownload() {
        return download;
    }

    public void setDownload(Download download) {
        this.download = download;
    }

    public Event_log getEvent_log() {
        return event_log;
    }

    public void setEvent_log(Event_log event_log) {
        this.event_log = event_log;
    }

    public Serial_number getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Serial_number serial_number) {
        this.serial_number = serial_number;
    }

    public List<Highlight_tags> getHighlight_tags() {
        return highlight_tags;
    }

    public void setHighlight_tags(List<Highlight_tags> highlight_tags) {
        this.highlight_tags = highlight_tags;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Top_banner getTop_banner() {
        return top_banner;
    }

    public void setTop_banner(Top_banner top_banner) {
        this.top_banner = top_banner;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", identifier='" + identifier + '\'' +
                ", title='" + title + '\'' +
                ", title_labels=" + title_labels +
                ", icon=" + icon +
                ", sell_price='" + sell_price + '\'' +
                ", category='" + category + '\'' +
                ", uri=" + uri +
                ", can_view=" + can_view +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", button_flag=" + button_flag +
                ", button_label='" + button_label + '\'' +
                ", style=" + style +
                ", hidden_button=" + hidden_button +
                ", ad_banner=" + ad_banner +
                ", banner=" + banner +
                ", tags=" + tags +
                ", stat=" + stat +
                ", download=" + download +
                ", event_log=" + event_log +
                ", serial_number=" + serial_number +
                ", highlight_tags=" + highlight_tags +
                ", log=" + log +
                ", top_banner=" + top_banner +
                '}';
    }
}
