/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IUser extends Serializable {

    /**
     * Setter for <code>user.email</code>.
     */
    public void setEmail(String value);

    /**
     * Getter for <code>user.email</code>.
     */
    public String getEmail();

    /**
     * Setter for <code>user.role</code>.
     */
    public void setRole(String value);

    /**
     * Getter for <code>user.role</code>.
     */
    public String getRole();

    /**
     * Setter for <code>user.password</code>.
     */
    public void setPassword(String value);

    /**
     * Getter for <code>user.password</code>.
     */
    public String getPassword();

    /**
     * Setter for <code>user.last_login</code>.
     */
    public void setLastLogin(LocalDateTime value);

    /**
     * Getter for <code>user.last_login</code>.
     */
    public LocalDateTime getLastLogin();

    /**
     * Setter for <code>user.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>user.created_at</code>.
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>user.email_verification</code>.
     */
    public void setEmailVerification(String value);

    /**
     * Getter for <code>user.email_verification</code>.
     */
    public String getEmailVerification();

    /**
     * Setter for <code>user.email_verified_at</code>.
     */
    public void setEmailVerifiedAt(LocalDateTime value);

    /**
     * Getter for <code>user.email_verified_at</code>.
     */
    public LocalDateTime getEmailVerifiedAt();

    /**
     * Setter for <code>user.password_reset_token</code>.
     */
    public void setPasswordResetToken(String value);

    /**
     * Getter for <code>user.password_reset_token</code>.
     */
    public String getPasswordResetToken();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IUser
     */
    public void from(IUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IUser
     */
    public <E extends IUser> E into(E into);
}