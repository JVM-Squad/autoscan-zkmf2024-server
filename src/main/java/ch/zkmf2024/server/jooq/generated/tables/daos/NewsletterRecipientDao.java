/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.daos;

import ch.zkmf2024.server.jooq.generated.tables.NewsletterRecipient;
import ch.zkmf2024.server.jooq.generated.tables.pojos.NewsletterRecipientPojo;
import ch.zkmf2024.server.jooq.generated.tables.records.NewsletterRecipientRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class NewsletterRecipientDao extends DAOImpl<NewsletterRecipientRecord, NewsletterRecipientPojo, String> {

    /**
     * Create a new NewsletterRecipientDao without any configuration
     */
    public NewsletterRecipientDao() {
        super(NewsletterRecipient.NEWSLETTER_RECIPIENT, NewsletterRecipientPojo.class);
    }

    /**
     * Create a new NewsletterRecipientDao with an attached configuration
     */
    public NewsletterRecipientDao(Configuration configuration) {
        super(NewsletterRecipient.NEWSLETTER_RECIPIENT, NewsletterRecipientPojo.class, configuration);
    }

    @Override
    public String getId(NewsletterRecipientPojo object) {
        return object.getEmail();
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<NewsletterRecipientPojo> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(NewsletterRecipient.NEWSLETTER_RECIPIENT.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<NewsletterRecipientPojo> fetchByEmail(String... values) {
        return fetch(NewsletterRecipient.NEWSLETTER_RECIPIENT.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public NewsletterRecipientPojo fetchOneByEmail(String value) {
        return fetchOne(NewsletterRecipient.NEWSLETTER_RECIPIENT.EMAIL, value);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public Optional<NewsletterRecipientPojo> fetchOptionalByEmail(String value) {
        return fetchOptional(NewsletterRecipient.NEWSLETTER_RECIPIENT.EMAIL, value);
    }

    /**
     * Fetch records that have <code>vorname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<NewsletterRecipientPojo> fetchRangeOfVorname(String lowerInclusive, String upperInclusive) {
        return fetchRange(NewsletterRecipient.NEWSLETTER_RECIPIENT.VORNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>vorname IN (values)</code>
     */
    public List<NewsletterRecipientPojo> fetchByVorname(String... values) {
        return fetch(NewsletterRecipient.NEWSLETTER_RECIPIENT.VORNAME, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<NewsletterRecipientPojo> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(NewsletterRecipient.NEWSLETTER_RECIPIENT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<NewsletterRecipientPojo> fetchByName(String... values) {
        return fetch(NewsletterRecipient.NEWSLETTER_RECIPIENT.NAME, values);
    }

    /**
     * Fetch records that have <code>subscribed_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<NewsletterRecipientPojo> fetchRangeOfSubscribedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NewsletterRecipient.NEWSLETTER_RECIPIENT.SUBSCRIBED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>subscribed_at IN (values)</code>
     */
    public List<NewsletterRecipientPojo> fetchBySubscribedAt(LocalDateTime... values) {
        return fetch(NewsletterRecipient.NEWSLETTER_RECIPIENT.SUBSCRIBED_AT, values);
    }

    /**
     * Fetch records that have <code>unsubscribed_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<NewsletterRecipientPojo> fetchRangeOfUnsubscribedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NewsletterRecipient.NEWSLETTER_RECIPIENT.UNSUBSCRIBED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>unsubscribed_at IN (values)</code>
     */
    public List<NewsletterRecipientPojo> fetchByUnsubscribedAt(LocalDateTime... values) {
        return fetch(NewsletterRecipient.NEWSLETTER_RECIPIENT.UNSUBSCRIBED_AT, values);
    }
}