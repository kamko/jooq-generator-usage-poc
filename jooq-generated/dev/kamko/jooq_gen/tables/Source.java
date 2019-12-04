/*
 * This file is generated by jOOQ.
 */
package dev.kamko.jooq_gen.tables;


import dev.kamko.jooq_gen.Indexes;
import dev.kamko.jooq_gen.Keys;
import dev.kamko.jooq_gen.Public;
import dev.kamko.jooq_gen.tables.records.SourceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Source extends TableImpl<SourceRecord> {

    private static final long serialVersionUID = 651456028;

    /**
     * The reference instance of <code>public.source</code>
     */
    public static final Source SOURCE = new Source();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SourceRecord> getRecordType() {
        return SourceRecord.class;
    }

    /**
     * The column <code>public.source.id</code>.
     */
    public final TableField<SourceRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('source_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.source.name</code>.
     */
    public final TableField<SourceRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.source.url</code>.
     */
    public final TableField<SourceRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.source.stype</code>.
     */
    public final TableField<SourceRecord, String> STYPE = createField(DSL.name("stype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.source</code> table reference
     */
    public Source() {
        this(DSL.name("source"), null);
    }

    /**
     * Create an aliased <code>public.source</code> table reference
     */
    public Source(String alias) {
        this(DSL.name(alias), SOURCE);
    }

    /**
     * Create an aliased <code>public.source</code> table reference
     */
    public Source(Name alias) {
        this(alias, SOURCE);
    }

    private Source(Name alias, Table<SourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Source(Name alias, Table<SourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Source(Table<O> child, ForeignKey<O, SourceRecord> key) {
        super(child, key, SOURCE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SOURCE_PKEY);
    }

    @Override
    public Identity<SourceRecord, Long> getIdentity() {
        return Keys.IDENTITY_SOURCE;
    }

    @Override
    public UniqueKey<SourceRecord> getPrimaryKey() {
        return Keys.SOURCE_PKEY;
    }

    @Override
    public List<UniqueKey<SourceRecord>> getKeys() {
        return Arrays.<UniqueKey<SourceRecord>>asList(Keys.SOURCE_PKEY);
    }

    @Override
    public Source as(String alias) {
        return new Source(DSL.name(alias), this);
    }

    @Override
    public Source as(Name alias) {
        return new Source(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Source rename(String name) {
        return new Source(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Source rename(Name name) {
        return new Source(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}