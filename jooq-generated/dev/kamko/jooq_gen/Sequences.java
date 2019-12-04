/*
 * This file is generated by jOOQ.
 */
package dev.kamko.jooq_gen;


import javax.annotation.processing.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.article_fb_engagement_id_seq</code>
     */
    public static final Sequence<Integer> ARTICLE_FB_ENGAGEMENT_ID_SEQ = new SequenceImpl<Integer>("article_fb_engagement_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.article_id_seq</code>
     */
    public static final Sequence<Long> ARTICLE_ID_SEQ = new SequenceImpl<Long>("article_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.media_id_seq</code>
     */
    public static final Sequence<Long> MEDIA_ID_SEQ = new SequenceImpl<Long>("media_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.monitor_job_run_log_id_seq</code>
     */
    public static final Sequence<Long> MONITOR_JOB_RUN_LOG_ID_SEQ = new SequenceImpl<Long>("monitor_job_run_log_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.monitored_article_id_seq</code>
     */
    public static final Sequence<Long> MONITORED_ARTICLE_ID_SEQ = new SequenceImpl<Long>("monitored_article_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.source_id_seq</code>
     */
    public static final Sequence<Long> SOURCE_ID_SEQ = new SequenceImpl<Long>("source_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}