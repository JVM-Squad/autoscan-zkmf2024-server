/*
 * This file is generated by jOOQ.
 */
package ch.zkmf2024.server.jooq.generated.tables.daos;

import ch.zkmf2024.server.jooq.generated.tables.JudgeReport;
import ch.zkmf2024.server.jooq.generated.tables.pojos.JudgeReportPojo;
import ch.zkmf2024.server.jooq.generated.tables.records.JudgeReportRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.util.List;
import java.util.Optional;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class JudgeReportDao extends DAOImpl<JudgeReportRecord, JudgeReportPojo, Long> {

    /**
     * Create a new JudgeReportDao without any configuration
     */
    public JudgeReportDao() {
        super(JudgeReport.JUDGE_REPORT, JudgeReportPojo.class);
    }

    /**
     * Create a new JudgeReportDao with an attached configuration
     */
    public JudgeReportDao(Configuration configuration) {
        super(JudgeReport.JUDGE_REPORT, JudgeReportPojo.class, configuration);
    }

    @Override
    public Long getId(JudgeReportPojo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JudgeReportPojo> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JudgeReport.JUDGE_REPORT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<JudgeReportPojo> fetchById(Long... values) {
        return fetch(JudgeReport.JUDGE_REPORT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public JudgeReportPojo fetchOneById(Long value) {
        return fetchOne(JudgeReport.JUDGE_REPORT.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<JudgeReportPojo> fetchOptionalById(Long value) {
        return fetchOptional(JudgeReport.JUDGE_REPORT.ID, value);
    }

    /**
     * Fetch records that have <code>fk_judge BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JudgeReportPojo> fetchRangeOfFkJudge(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JudgeReport.JUDGE_REPORT.FK_JUDGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>fk_judge IN (values)</code>
     */
    public List<JudgeReportPojo> fetchByFkJudge(Long... values) {
        return fetch(JudgeReport.JUDGE_REPORT.FK_JUDGE, values);
    }

    /**
     * Fetch records that have <code>fk_timetable_entry BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<JudgeReportPojo> fetchRangeOfFkTimetableEntry(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JudgeReport.JUDGE_REPORT.FK_TIMETABLE_ENTRY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>fk_timetable_entry IN (values)</code>
     */
    public List<JudgeReportPojo> fetchByFkTimetableEntry(Long... values) {
        return fetch(JudgeReport.JUDGE_REPORT.FK_TIMETABLE_ENTRY, values);
    }

    /**
     * Fetch records that have <code>score BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<JudgeReportPojo> fetchRangeOfScore(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(JudgeReport.JUDGE_REPORT.SCORE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<JudgeReportPojo> fetchByScore(Integer... values) {
        return fetch(JudgeReport.JUDGE_REPORT.SCORE, values);
    }
}
