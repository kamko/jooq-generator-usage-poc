/*
 * This file is generated by jOOQ.
 */
package dev.kamko.jooq_gen.tables;


import dev.kamko.jooq_gen.Indexes;
import dev.kamko.jooq_gen.Keys;
import dev.kamko.jooq_gen.Public;
import dev.kamko.jooq_gen.tables.records.MonitoredArticleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class MonitoredArticle extends TableImpl<MonitoredArticleRecord> {

    private static final long serialVersionUID = -1539371204;

    /**
     * The reference instance of <code>public.monitored_article</code>
     */
    public static final MonitoredArticle MONITORED_ARTICLE = new MonitoredArticle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MonitoredArticleRecord> getRecordType() {
        return MonitoredArticleRecord.class;
    }

    /**
     * The column <code>public.monitored_article.id</code>.
     */
    public final TableField<MonitoredArticleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('monitored_article_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.monitored_article.article_id</code>.
     */
    public final TableField<MonitoredArticleRecord, Long> ARTICLE_ID = createField(DSL.name("article_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.monitored_article</code> table reference
     */
    public MonitoredArticle() {
        this(DSL.name("monitored_article"), null);
    }

    /**
     * Create an aliased <code>public.monitored_article</code> table reference
     */
    public MonitoredArticle(String alias) {
        this(DSL.name(alias), MONITORED_ARTICLE);
    }

    /**
     * Create an aliased <code>public.monitored_article</code> table reference
     */
    public MonitoredArticle(Name alias) {
        this(alias, MONITORED_ARTICLE);
    }

    private MonitoredArticle(Name alias, Table<MonitoredArticleRecord> aliased) {
        this(alias, aliased, null);
    }

    private MonitoredArticle(Name alias, Table<MonitoredArticleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MonitoredArticle(Table<O> child, ForeignKey<O, MonitoredArticleRecord> key) {
        super(child, key, MONITORED_ARTICLE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MONITORED_ARTICLE_PKEY);
    }

    @Override
    public Identity<MonitoredArticleRecord, Long> getIdentity() {
        return Keys.IDENTITY_MONITORED_ARTICLE;
    }

    @Override
    public UniqueKey<MonitoredArticleRecord> getPrimaryKey() {
        return Keys.MONITORED_ARTICLE_PKEY;
    }

    @Override
    public List<UniqueKey<MonitoredArticleRecord>> getKeys() {
        return Arrays.<UniqueKey<MonitoredArticleRecord>>asList(Keys.MONITORED_ARTICLE_PKEY);
    }

    @Override
    public List<ForeignKey<MonitoredArticleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MonitoredArticleRecord, ?>>asList(Keys.MONITORED_ARTICLE__MONITORED_ARTICLE_ARTICLE_ID_FKEY);
    }

    public Article article() {
        return new Article(this, Keys.MONITORED_ARTICLE__MONITORED_ARTICLE_ARTICLE_ID_FKEY);
    }

    @Override
    public MonitoredArticle as(String alias) {
        return new MonitoredArticle(DSL.name(alias), this);
    }

    @Override
    public MonitoredArticle as(Name alias) {
        return new MonitoredArticle(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MonitoredArticle rename(String name) {
        return new MonitoredArticle(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MonitoredArticle rename(Name name) {
        return new MonitoredArticle(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}