package xyz.zinglizingli.books.po;

import java.util.Date;

public class BookParseLog {
    private Long id;

    private String bookUrl;

    private String bookName;

    private Float score;

    private Date createTime;

    private Byte priority;

    private Byte updateCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl == null ? null : bookUrl.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Byte getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(Byte updateCount) {
        this.updateCount = updateCount;
    }
}