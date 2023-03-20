/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.daos;

import ch.zkmf2024.server.jooq.generated.tables.Zkmf2024User;
import ch.zkmf2024.server.jooq.generated.tables.pojos.Zkmf2024UserPojo;
import ch.zkmf2024.server.jooq.generated.tables.records.Zkmf2024UserRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Zkmf2024UserDao extends DAOImpl<Zkmf2024UserRecord, Zkmf2024UserPojo, String> {

    /**
     * Create a new Zkmf2024UserDao without any configuration
     */
    public Zkmf2024UserDao() {
        super(Zkmf2024User.ZKMF2024_USER, Zkmf2024UserPojo.class);
    }

    /**
     * Create a new Zkmf2024UserDao with an attached configuration
     */
    public Zkmf2024UserDao(Configuration configuration) {
        super(Zkmf2024User.ZKMF2024_USER, Zkmf2024UserPojo.class, configuration);
    }

    @Override
    public String getId(Zkmf2024UserPojo object) {
        return object.getEmail();
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByEmail(String... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public Zkmf2024UserPojo fetchOneByEmail(String value) {
        return fetchOne(Zkmf2024User.ZKMF2024_USER.EMAIL, value);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public Optional<Zkmf2024UserPojo> fetchOptionalByEmail(String value) {
        return fetchOptional(Zkmf2024User.ZKMF2024_USER.EMAIL, value);
    }

    /**
     * Fetch records that have <code>role BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfRole(String lowerInclusive, String upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.ROLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>role IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByRole(String... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.ROLE, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByPassword(String... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>last_login BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfLastLogin(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.LAST_LOGIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_login IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByLastLogin(LocalDateTime... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.LAST_LOGIN, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>email_verification BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfEmailVerification(String lowerInclusive, String upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.EMAIL_VERIFICATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email_verification IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByEmailVerification(String... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.EMAIL_VERIFICATION, values);
    }

    /**
     * Fetch records that have <code>email_verified_at BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfEmailVerifiedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.EMAIL_VERIFIED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email_verified_at IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByEmailVerifiedAt(LocalDateTime... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.EMAIL_VERIFIED_AT, values);
    }

    /**
     * Fetch records that have <code>password_reset_token BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<Zkmf2024UserPojo> fetchRangeOfPasswordResetToken(String lowerInclusive, String upperInclusive) {
        return fetchRange(Zkmf2024User.ZKMF2024_USER.PASSWORD_RESET_TOKEN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password_reset_token IN (values)</code>
     */
    public List<Zkmf2024UserPojo> fetchByPasswordResetToken(String... values) {
        return fetch(Zkmf2024User.ZKMF2024_USER.PASSWORD_RESET_TOKEN, values);
    }
}
