package com.gx.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContributorIsNull() {
            addCriterion("contributor is null");
            return (Criteria) this;
        }

        public Criteria andContributorIsNotNull() {
            addCriterion("contributor is not null");
            return (Criteria) this;
        }

        public Criteria andContributorEqualTo(String value) {
            addCriterion("contributor =", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotEqualTo(String value) {
            addCriterion("contributor <>", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThan(String value) {
            addCriterion("contributor >", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThanOrEqualTo(String value) {
            addCriterion("contributor >=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThan(String value) {
            addCriterion("contributor <", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThanOrEqualTo(String value) {
            addCriterion("contributor <=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLike(String value) {
            addCriterion("contributor like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotLike(String value) {
            addCriterion("contributor not like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorIn(List<String> values) {
            addCriterion("contributor in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotIn(List<String> values) {
            addCriterion("contributor not in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorBetween(String value1, String value2) {
            addCriterion("contributor between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotBetween(String value1, String value2) {
            addCriterion("contributor not between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("suffix is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("suffix is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("suffix =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("suffix <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("suffix >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("suffix >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("suffix <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("suffix <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("suffix like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("suffix not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("suffix in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("suffix not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("suffix between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("suffix not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSummaryCnIsNull() {
            addCriterion("summary_cn is null");
            return (Criteria) this;
        }

        public Criteria andSummaryCnIsNotNull() {
            addCriterion("summary_cn is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryCnEqualTo(String value) {
            addCriterion("summary_cn =", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnNotEqualTo(String value) {
            addCriterion("summary_cn <>", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnGreaterThan(String value) {
            addCriterion("summary_cn >", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnGreaterThanOrEqualTo(String value) {
            addCriterion("summary_cn >=", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnLessThan(String value) {
            addCriterion("summary_cn <", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnLessThanOrEqualTo(String value) {
            addCriterion("summary_cn <=", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnLike(String value) {
            addCriterion("summary_cn like", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnNotLike(String value) {
            addCriterion("summary_cn not like", value, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnIn(List<String> values) {
            addCriterion("summary_cn in", values, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnNotIn(List<String> values) {
            addCriterion("summary_cn not in", values, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnBetween(String value1, String value2) {
            addCriterion("summary_cn between", value1, value2, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryCnNotBetween(String value1, String value2) {
            addCriterion("summary_cn not between", value1, value2, "summaryCn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnIsNull() {
            addCriterion("summary_en is null");
            return (Criteria) this;
        }

        public Criteria andSummaryEnIsNotNull() {
            addCriterion("summary_en is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEnEqualTo(String value) {
            addCriterion("summary_en =", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnNotEqualTo(String value) {
            addCriterion("summary_en <>", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnGreaterThan(String value) {
            addCriterion("summary_en >", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnGreaterThanOrEqualTo(String value) {
            addCriterion("summary_en >=", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnLessThan(String value) {
            addCriterion("summary_en <", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnLessThanOrEqualTo(String value) {
            addCriterion("summary_en <=", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnLike(String value) {
            addCriterion("summary_en like", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnNotLike(String value) {
            addCriterion("summary_en not like", value, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnIn(List<String> values) {
            addCriterion("summary_en in", values, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnNotIn(List<String> values) {
            addCriterion("summary_en not in", values, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnBetween(String value1, String value2) {
            addCriterion("summary_en between", value1, value2, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andSummaryEnNotBetween(String value1, String value2) {
            addCriterion("summary_en not between", value1, value2, "summaryEn");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorunitIsNull() {
            addCriterion("authorunit is null");
            return (Criteria) this;
        }

        public Criteria andAuthorunitIsNotNull() {
            addCriterion("authorunit is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorunitEqualTo(String value) {
            addCriterion("authorunit =", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitNotEqualTo(String value) {
            addCriterion("authorunit <>", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitGreaterThan(String value) {
            addCriterion("authorunit >", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitGreaterThanOrEqualTo(String value) {
            addCriterion("authorunit >=", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitLessThan(String value) {
            addCriterion("authorunit <", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitLessThanOrEqualTo(String value) {
            addCriterion("authorunit <=", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitLike(String value) {
            addCriterion("authorunit like", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitNotLike(String value) {
            addCriterion("authorunit not like", value, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitIn(List<String> values) {
            addCriterion("authorunit in", values, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitNotIn(List<String> values) {
            addCriterion("authorunit not in", values, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitBetween(String value1, String value2) {
            addCriterion("authorunit between", value1, value2, "authorunit");
            return (Criteria) this;
        }

        public Criteria andAuthorunitNotBetween(String value1, String value2) {
            addCriterion("authorunit not between", value1, value2, "authorunit");
            return (Criteria) this;
        }

        public Criteria andPgTimeIsNull() {
            addCriterion("pg_time is null");
            return (Criteria) this;
        }

        public Criteria andPgTimeIsNotNull() {
            addCriterion("pg_time is not null");
            return (Criteria) this;
        }

        public Criteria andPgTimeEqualTo(Date value) {
            addCriterion("pg_time =", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeNotEqualTo(Date value) {
            addCriterion("pg_time <>", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeGreaterThan(Date value) {
            addCriterion("pg_time >", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pg_time >=", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeLessThan(Date value) {
            addCriterion("pg_time <", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeLessThanOrEqualTo(Date value) {
            addCriterion("pg_time <=", value, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeIn(List<Date> values) {
            addCriterion("pg_time in", values, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeNotIn(List<Date> values) {
            addCriterion("pg_time not in", values, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeBetween(Date value1, Date value2) {
            addCriterion("pg_time between", value1, value2, "pgTime");
            return (Criteria) this;
        }

        public Criteria andPgTimeNotBetween(Date value1, Date value2) {
            addCriterion("pg_time not between", value1, value2, "pgTime");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIsNull() {
            addCriterion("local_url is null");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIsNotNull() {
            addCriterion("local_url is not null");
            return (Criteria) this;
        }

        public Criteria andLocalUrlEqualTo(String value) {
            addCriterion("local_url =", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotEqualTo(String value) {
            addCriterion("local_url <>", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlGreaterThan(String value) {
            addCriterion("local_url >", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("local_url >=", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLessThan(String value) {
            addCriterion("local_url <", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLessThanOrEqualTo(String value) {
            addCriterion("local_url <=", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLike(String value) {
            addCriterion("local_url like", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotLike(String value) {
            addCriterion("local_url not like", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIn(List<String> values) {
            addCriterion("local_url in", values, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotIn(List<String> values) {
            addCriterion("local_url not in", values, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlBetween(String value1, String value2) {
            addCriterion("local_url between", value1, value2, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotBetween(String value1, String value2) {
            addCriterion("local_url not between", value1, value2, "localUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNull() {
            addCriterion("visit_url is null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNotNull() {
            addCriterion("visit_url is not null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlEqualTo(String value) {
            addCriterion("visit_url =", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotEqualTo(String value) {
            addCriterion("visit_url <>", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThan(String value) {
            addCriterion("visit_url >", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("visit_url >=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThan(String value) {
            addCriterion("visit_url <", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("visit_url <=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLike(String value) {
            addCriterion("visit_url like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotLike(String value) {
            addCriterion("visit_url not like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIn(List<String> values) {
            addCriterion("visit_url in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotIn(List<String> values) {
            addCriterion("visit_url not in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlBetween(String value1, String value2) {
            addCriterion("visit_url between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotBetween(String value1, String value2) {
            addCriterion("visit_url not between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNull() {
            addCriterion("is_original is null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIsNotNull() {
            addCriterion("is_original is not null");
            return (Criteria) this;
        }

        public Criteria andIsOriginalEqualTo(Integer value) {
            addCriterion("is_original =", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotEqualTo(Integer value) {
            addCriterion("is_original <>", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThan(Integer value) {
            addCriterion("is_original >", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_original >=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThan(Integer value) {
            addCriterion("is_original <", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalLessThanOrEqualTo(Integer value) {
            addCriterion("is_original <=", value, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalIn(List<Integer> values) {
            addCriterion("is_original in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotIn(List<Integer> values) {
            addCriterion("is_original not in", values, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalBetween(Integer value1, Integer value2) {
            addCriterion("is_original between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andIsOriginalNotBetween(Integer value1, Integer value2) {
            addCriterion("is_original not between", value1, value2, "isOriginal");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Long value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Long value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Long value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Long value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Long value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Long value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Long> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Long> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Long value1, Long value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Long value1, Long value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Long value) {
            addCriterion("downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Long value) {
            addCriterion("downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Long value) {
            addCriterion("downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Long value) {
            addCriterion("downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Long value) {
            addCriterion("downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Long value) {
            addCriterion("downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Long> values) {
            addCriterion("downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Long> values) {
            addCriterion("downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Long value1, Long value2) {
            addCriterion("downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Long value1, Long value2) {
            addCriterion("downloads not between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNull() {
            addCriterion("original is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNotNull() {
            addCriterion("original is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEqualTo(String value) {
            addCriterion("original =", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotEqualTo(String value) {
            addCriterion("original <>", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThan(String value) {
            addCriterion("original >", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("original >=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThan(String value) {
            addCriterion("original <", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThanOrEqualTo(String value) {
            addCriterion("original <=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLike(String value) {
            addCriterion("original like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotLike(String value) {
            addCriterion("original not like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalIn(List<String> values) {
            addCriterion("original in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotIn(List<String> values) {
            addCriterion("original not in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalBetween(String value1, String value2) {
            addCriterion("original between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotBetween(String value1, String value2) {
            addCriterion("original not between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableIsNull() {
            addCriterion("is_downloadable is null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableIsNotNull() {
            addCriterion("is_downloadable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableEqualTo(Integer value) {
            addCriterion("is_downloadable =", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableNotEqualTo(Integer value) {
            addCriterion("is_downloadable <>", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableGreaterThan(Integer value) {
            addCriterion("is_downloadable >", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_downloadable >=", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableLessThan(Integer value) {
            addCriterion("is_downloadable <", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableLessThanOrEqualTo(Integer value) {
            addCriterion("is_downloadable <=", value, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableIn(List<Integer> values) {
            addCriterion("is_downloadable in", values, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableNotIn(List<Integer> values) {
            addCriterion("is_downloadable not in", values, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableBetween(Integer value1, Integer value2) {
            addCriterion("is_downloadable between", value1, value2, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsDownloadableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_downloadable not between", value1, value2, "isDownloadable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableIsNull() {
            addCriterion("is_visiable is null");
            return (Criteria) this;
        }

        public Criteria andIsVisiableIsNotNull() {
            addCriterion("is_visiable is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisiableEqualTo(Integer value) {
            addCriterion("is_visiable =", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableNotEqualTo(Integer value) {
            addCriterion("is_visiable <>", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableGreaterThan(Integer value) {
            addCriterion("is_visiable >", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_visiable >=", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableLessThan(Integer value) {
            addCriterion("is_visiable <", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableLessThanOrEqualTo(Integer value) {
            addCriterion("is_visiable <=", value, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableIn(List<Integer> values) {
            addCriterion("is_visiable in", values, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableNotIn(List<Integer> values) {
            addCriterion("is_visiable not in", values, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableBetween(Integer value1, Integer value2) {
            addCriterion("is_visiable between", value1, value2, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsVisiableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_visiable not between", value1, value2, "isVisiable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableIsNull() {
            addCriterion("is_uploadable is null");
            return (Criteria) this;
        }

        public Criteria andIsUploadableIsNotNull() {
            addCriterion("is_uploadable is not null");
            return (Criteria) this;
        }

        public Criteria andIsUploadableEqualTo(Integer value) {
            addCriterion("is_uploadable =", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableNotEqualTo(Integer value) {
            addCriterion("is_uploadable <>", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableGreaterThan(Integer value) {
            addCriterion("is_uploadable >", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_uploadable >=", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableLessThan(Integer value) {
            addCriterion("is_uploadable <", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableLessThanOrEqualTo(Integer value) {
            addCriterion("is_uploadable <=", value, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableIn(List<Integer> values) {
            addCriterion("is_uploadable in", values, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableNotIn(List<Integer> values) {
            addCriterion("is_uploadable not in", values, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableBetween(Integer value1, Integer value2) {
            addCriterion("is_uploadable between", value1, value2, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andIsUploadableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_uploadable not between", value1, value2, "isUploadable");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}