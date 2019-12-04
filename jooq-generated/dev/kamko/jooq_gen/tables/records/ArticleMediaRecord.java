/*
 * This file is generated by jOOQ.
 */
package dev.kamko.jooq_gen.tables.records;


import dev.kamko.jooq_gen.tables.ArticleMedia;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleMediaRecord extends TableRecordImpl<ArticleMediaRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1892708717;

    /**
     * Setter for <code>public.article_media.article_id</code>.
     */
    public void setArticleId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.article_media.article_id</code>.
     */
    public Long getArticleId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.article_media.media_id</code>.
     */
    public void setMediaId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.article_media.media_id</code>.
     */
    public Long getMediaId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ArticleMedia.ARTICLE_MEDIA.ARTICLE_ID;
    }

    @Override
    public Field<Long> field2() {
        return ArticleMedia.ARTICLE_MEDIA.MEDIA_ID;
    }

    @Override
    public Long component1() {
        return getArticleId();
    }

    @Override
    public Long component2() {
        return getMediaId();
    }

    @Override
    public Long value1() {
        return getArticleId();
    }

    @Override
    public Long value2() {
        return getMediaId();
    }

    @Override
    public ArticleMediaRecord value1(Long value) {
        setArticleId(value);
        return this;
    }

    @Override
    public ArticleMediaRecord value2(Long value) {
        setMediaId(value);
        return this;
    }

    @Override
    public ArticleMediaRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleMediaRecord
     */
    public ArticleMediaRecord() {
        super(ArticleMedia.ARTICLE_MEDIA);
    }

    /**
     * Create a detached, initialised ArticleMediaRecord
     */
    public ArticleMediaRecord(Long articleId, Long mediaId) {
        super(ArticleMedia.ARTICLE_MEDIA);

        set(0, articleId);
        set(1, mediaId);
    }
}
