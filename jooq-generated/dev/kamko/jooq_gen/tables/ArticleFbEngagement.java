/*
 * This file is generated by jOOQ.
 */
package dev.kamko.jooq_gen.tables;


import dev.kamko.jooq_gen.Indexes;
import dev.kamko.jooq_gen.Keys;
import dev.kamko.jooq_gen.Public;
import dev.kamko.jooq_gen.tables.records.ArticleFbEngagementRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ArticleFbEngagement extends TableImpl<ArticleFbEngagementRecord> {

    private static final long serialVersionUID = 1498006979;

    /**
     * The reference instance of <code>public.article_fb_engagement</code>
     */
    public static final ArticleFbEngagement ARTICLE_FB_ENGAGEMENT = new ArticleFbEngagement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticleFbEngagementRecord> getRecordType() {
        return ArticleFbEngagementRecord.class;
    }

    /**
     * The column <code>public.article_fb_engagement.url</code>.
     */
    public final TableField<ArticleFbEngagementRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.article_fb_engagement.reaction_count</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Integer> REACTION_COUNT = createField(DSL.name("reaction_count"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.article_fb_engagement.comment_count</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Integer> COMMENT_COUNT = createField(DSL.name("comment_count"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.article_fb_engagement.share_count</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Integer> SHARE_COUNT = createField(DSL.name("share_count"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.article_fb_engagement.comment_plugin_count</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Integer> COMMENT_PLUGIN_COUNT = createField(DSL.name("comment_plugin_count"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.article_fb_engagement.sync_date</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Timestamp> SYNC_DATE = createField(DSL.name("sync_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.article_fb_engagement.id</code>.
     */
    public final TableField<ArticleFbEngagementRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('article_fb_engagement_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.article_fb_engagement</code> table reference
     */
    public ArticleFbEngagement() {
        this(DSL.name("article_fb_engagement"), null);
    }

    /**
     * Create an aliased <code>public.article_fb_engagement</code> table reference
     */
    public ArticleFbEngagement(String alias) {
        this(DSL.name(alias), ARTICLE_FB_ENGAGEMENT);
    }

    /**
     * Create an aliased <code>public.article_fb_engagement</code> table reference
     */
    public ArticleFbEngagement(Name alias) {
        this(alias, ARTICLE_FB_ENGAGEMENT);
    }

    private ArticleFbEngagement(Name alias, Table<ArticleFbEngagementRecord> aliased) {
        this(alias, aliased, null);
    }

    private ArticleFbEngagement(Name alias, Table<ArticleFbEngagementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ArticleFbEngagement(Table<O> child, ForeignKey<O, ArticleFbEngagementRecord> key) {
        super(child, key, ARTICLE_FB_ENGAGEMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ARTICLE_FB_ENGAGEMENT_PKEY, Indexes.ARTICLE_FB_ENGAGEMENT_URL_INDEX);
    }

    @Override
    public Identity<ArticleFbEngagementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ARTICLE_FB_ENGAGEMENT;
    }

    @Override
    public UniqueKey<ArticleFbEngagementRecord> getPrimaryKey() {
        return Keys.ARTICLE_FB_ENGAGEMENT_PKEY;
    }

    @Override
    public List<UniqueKey<ArticleFbEngagementRecord>> getKeys() {
        return Arrays.<UniqueKey<ArticleFbEngagementRecord>>asList(Keys.ARTICLE_FB_ENGAGEMENT_PKEY);
    }

    @Override
    public ArticleFbEngagement as(String alias) {
        return new ArticleFbEngagement(DSL.name(alias), this);
    }

    @Override
    public ArticleFbEngagement as(Name alias) {
        return new ArticleFbEngagement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ArticleFbEngagement rename(String name) {
        return new ArticleFbEngagement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ArticleFbEngagement rename(Name name) {
        return new ArticleFbEngagement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, Integer, Integer, Integer, Timestamp, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
