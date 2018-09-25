package com.gx.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andIsDeletableIsNull() {
            addCriterion("is_deletable is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletableIsNotNull() {
            addCriterion("is_deletable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletableEqualTo(Integer value) {
            addCriterion("is_deletable =", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableNotEqualTo(Integer value) {
            addCriterion("is_deletable <>", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableGreaterThan(Integer value) {
            addCriterion("is_deletable >", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deletable >=", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableLessThan(Integer value) {
            addCriterion("is_deletable <", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableLessThanOrEqualTo(Integer value) {
            addCriterion("is_deletable <=", value, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableIn(List<Integer> values) {
            addCriterion("is_deletable in", values, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableNotIn(List<Integer> values) {
            addCriterion("is_deletable not in", values, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableBetween(Integer value1, Integer value2) {
            addCriterion("is_deletable between", value1, value2, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsDeletableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deletable not between", value1, value2, "isDeletable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableIsNull() {
            addCriterion("is_updatable is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableIsNotNull() {
            addCriterion("is_updatable is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableEqualTo(Integer value) {
            addCriterion("is_updatable =", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableNotEqualTo(Integer value) {
            addCriterion("is_updatable <>", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableGreaterThan(Integer value) {
            addCriterion("is_updatable >", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_updatable >=", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableLessThan(Integer value) {
            addCriterion("is_updatable <", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableLessThanOrEqualTo(Integer value) {
            addCriterion("is_updatable <=", value, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableIn(List<Integer> values) {
            addCriterion("is_updatable in", values, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableNotIn(List<Integer> values) {
            addCriterion("is_updatable not in", values, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableBetween(Integer value1, Integer value2) {
            addCriterion("is_updatable between", value1, value2, "isUpdatable");
            return (Criteria) this;
        }

        public Criteria andIsUpdatableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_updatable not between", value1, value2, "isUpdatable");
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Long value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Long value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Long value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Long value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Long value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Long> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Long> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Long value1, Long value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Long value1, Long value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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