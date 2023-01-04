/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.interfaces;

import java.io.Serializable;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public interface IAppPage extends Serializable {

    /**
     * Setter for <code>app_page.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>app_page.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>app_page.markdown</code>.
     */
    public void setMarkdown(String value);

    /**
     * Getter for <code>app_page.markdown</code>.
     */
    public String getMarkdown();

    /**
     * Setter for <code>app_page.cloudflare_id</code>.
     */
    public void setCloudflareId(String value);

    /**
     * Getter for <code>app_page.cloudflare_id</code>.
     */
    public String getCloudflareId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IAppPage
     */
    public void from(IAppPage from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IAppPage
     */
    public <E extends IAppPage> E into(E into);
}
