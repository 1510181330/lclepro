package com.example.lclepro.Bean;

import java.util.ArrayList;
import java.util.List;

public class LcleClassestoteachermapperExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public LcleClassestoteachermapperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
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

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andGradleIsNull() {
            addCriterion("gradle is null");
            return (Criteria) this;
        }

        public Criteria andGradleIsNotNull() {
            addCriterion("gradle is not null");
            return (Criteria) this;
        }

        public Criteria andGradleEqualTo(Integer value) {
            addCriterion("gradle =", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleNotEqualTo(Integer value) {
            addCriterion("gradle <>", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleGreaterThan(Integer value) {
            addCriterion("gradle >", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradle >=", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleLessThan(Integer value) {
            addCriterion("gradle <", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleLessThanOrEqualTo(Integer value) {
            addCriterion("gradle <=", value, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleIn(List<Integer> values) {
            addCriterion("gradle in", values, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleNotIn(List<Integer> values) {
            addCriterion("gradle not in", values, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleBetween(Integer value1, Integer value2) {
            addCriterion("gradle between", value1, value2, "gradle");
            return (Criteria) this;
        }

        public Criteria andGradleNotBetween(Integer value1, Integer value2) {
            addCriterion("gradle not between", value1, value2, "gradle");
            return (Criteria) this;
        }

        public Criteria andWeeknumberIsNull() {
            addCriterion("weekNumber is null");
            return (Criteria) this;
        }

        public Criteria andWeeknumberIsNotNull() {
            addCriterion("weekNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWeeknumberEqualTo(Integer value) {
            addCriterion("weekNumber =", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberNotEqualTo(Integer value) {
            addCriterion("weekNumber <>", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberGreaterThan(Integer value) {
            addCriterion("weekNumber >", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekNumber >=", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberLessThan(Integer value) {
            addCriterion("weekNumber <", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberLessThanOrEqualTo(Integer value) {
            addCriterion("weekNumber <=", value, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberIn(List<Integer> values) {
            addCriterion("weekNumber in", values, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberNotIn(List<Integer> values) {
            addCriterion("weekNumber not in", values, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberBetween(Integer value1, Integer value2) {
            addCriterion("weekNumber between", value1, value2, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andWeeknumberNotBetween(Integer value1, Integer value2) {
            addCriterion("weekNumber not between", value1, value2, "weeknumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberIsNull() {
            addCriterion("totleNumber is null");
            return (Criteria) this;
        }

        public Criteria andTotlenumberIsNotNull() {
            addCriterion("totleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTotlenumberEqualTo(Integer value) {
            addCriterion("totleNumber =", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberNotEqualTo(Integer value) {
            addCriterion("totleNumber <>", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberGreaterThan(Integer value) {
            addCriterion("totleNumber >", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("totleNumber >=", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberLessThan(Integer value) {
            addCriterion("totleNumber <", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberLessThanOrEqualTo(Integer value) {
            addCriterion("totleNumber <=", value, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberIn(List<Integer> values) {
            addCriterion("totleNumber in", values, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberNotIn(List<Integer> values) {
            addCriterion("totleNumber not in", values, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberBetween(Integer value1, Integer value2) {
            addCriterion("totleNumber between", value1, value2, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andTotlenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("totleNumber not between", value1, value2, "totlenumber");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lcle_classestoteachermapper
     *
     * @mbg.generated
     */
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