package com.qf.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JdOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdOrderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnumIsNull() {
            addCriterion("onum is null");
            return (Criteria) this;
        }

        public Criteria andOnumIsNotNull() {
            addCriterion("onum is not null");
            return (Criteria) this;
        }

        public Criteria andOnumEqualTo(Integer value) {
            addCriterion("onum =", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotEqualTo(Integer value) {
            addCriterion("onum <>", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumGreaterThan(Integer value) {
            addCriterion("onum >", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("onum >=", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumLessThan(Integer value) {
            addCriterion("onum <", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumLessThanOrEqualTo(Integer value) {
            addCriterion("onum <=", value, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumIn(List<Integer> values) {
            addCriterion("onum in", values, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotIn(List<Integer> values) {
            addCriterion("onum not in", values, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumBetween(Integer value1, Integer value2) {
            addCriterion("onum between", value1, value2, "onum");
            return (Criteria) this;
        }

        public Criteria andOnumNotBetween(Integer value1, Integer value2) {
            addCriterion("onum not between", value1, value2, "onum");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andOdateIsNull() {
            addCriterion("odate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("odate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(String value) {
            addCriterion("odate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(String value) {
            addCriterion("odate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(String value) {
            addCriterion("odate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(String value) {
            addCriterion("odate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(String value) {
            addCriterion("odate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(String value) {
            addCriterion("odate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLike(String value) {
            addCriterion("odate like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotLike(String value) {
            addCriterion("odate not like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<String> values) {
            addCriterion("odate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<String> values) {
            addCriterion("odate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(String value1, String value2) {
            addCriterion("odate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(String value1, String value2) {
            addCriterion("odate not between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOintimeIsNull() {
            addCriterion("ointime is null");
            return (Criteria) this;
        }

        public Criteria andOintimeIsNotNull() {
            addCriterion("ointime is not null");
            return (Criteria) this;
        }

        public Criteria andOintimeEqualTo(String value) {
            addCriterion("ointime =", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeNotEqualTo(String value) {
            addCriterion("ointime <>", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeGreaterThan(String value) {
            addCriterion("ointime >", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeGreaterThanOrEqualTo(String value) {
            addCriterion("ointime >=", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeLessThan(String value) {
            addCriterion("ointime <", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeLessThanOrEqualTo(String value) {
            addCriterion("ointime <=", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeLike(String value) {
            addCriterion("ointime like", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeNotLike(String value) {
            addCriterion("ointime not like", value, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeIn(List<String> values) {
            addCriterion("ointime in", values, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeNotIn(List<String> values) {
            addCriterion("ointime not in", values, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeBetween(String value1, String value2) {
            addCriterion("ointime between", value1, value2, "ointime");
            return (Criteria) this;
        }

        public Criteria andOintimeNotBetween(String value1, String value2) {
            addCriterion("ointime not between", value1, value2, "ointime");
            return (Criteria) this;
        }

        public Criteria andOouttimeIsNull() {
            addCriterion("oouttime is null");
            return (Criteria) this;
        }

        public Criteria andOouttimeIsNotNull() {
            addCriterion("oouttime is not null");
            return (Criteria) this;
        }

        public Criteria andOouttimeEqualTo(String value) {
            addCriterion("oouttime =", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeNotEqualTo(String value) {
            addCriterion("oouttime <>", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeGreaterThan(String value) {
            addCriterion("oouttime >", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeGreaterThanOrEqualTo(String value) {
            addCriterion("oouttime >=", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeLessThan(String value) {
            addCriterion("oouttime <", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeLessThanOrEqualTo(String value) {
            addCriterion("oouttime <=", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeLike(String value) {
            addCriterion("oouttime like", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeNotLike(String value) {
            addCriterion("oouttime not like", value, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeIn(List<String> values) {
            addCriterion("oouttime in", values, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeNotIn(List<String> values) {
            addCriterion("oouttime not in", values, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeBetween(String value1, String value2) {
            addCriterion("oouttime between", value1, value2, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOouttimeNotBetween(String value1, String value2) {
            addCriterion("oouttime not between", value1, value2, "oouttime");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNull() {
            addCriterion("ophone is null");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNotNull() {
            addCriterion("ophone is not null");
            return (Criteria) this;
        }

        public Criteria andOphoneEqualTo(String value) {
            addCriterion("ophone =", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotEqualTo(String value) {
            addCriterion("ophone <>", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThan(String value) {
            addCriterion("ophone >", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ophone >=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThan(String value) {
            addCriterion("ophone <", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThanOrEqualTo(String value) {
            addCriterion("ophone <=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLike(String value) {
            addCriterion("ophone like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotLike(String value) {
            addCriterion("ophone not like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneIn(List<String> values) {
            addCriterion("ophone in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotIn(List<String> values) {
            addCriterion("ophone not in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneBetween(String value1, String value2) {
            addCriterion("ophone between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotBetween(String value1, String value2) {
            addCriterion("ophone not between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOidcardIsNull() {
            addCriterion("oidcard is null");
            return (Criteria) this;
        }

        public Criteria andOidcardIsNotNull() {
            addCriterion("oidcard is not null");
            return (Criteria) this;
        }

        public Criteria andOidcardEqualTo(Integer value) {
            addCriterion("oidcard =", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardNotEqualTo(Integer value) {
            addCriterion("oidcard <>", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardGreaterThan(Integer value) {
            addCriterion("oidcard >", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("oidcard >=", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardLessThan(Integer value) {
            addCriterion("oidcard <", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardLessThanOrEqualTo(Integer value) {
            addCriterion("oidcard <=", value, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardIn(List<Integer> values) {
            addCriterion("oidcard in", values, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardNotIn(List<Integer> values) {
            addCriterion("oidcard not in", values, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardBetween(Integer value1, Integer value2) {
            addCriterion("oidcard between", value1, value2, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOidcardNotBetween(Integer value1, Integer value2) {
            addCriterion("oidcard not between", value1, value2, "oidcard");
            return (Criteria) this;
        }

        public Criteria andOdayIsNull() {
            addCriterion("oday is null");
            return (Criteria) this;
        }

        public Criteria andOdayIsNotNull() {
            addCriterion("oday is not null");
            return (Criteria) this;
        }

        public Criteria andOdayEqualTo(Integer value) {
            addCriterion("oday =", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotEqualTo(Integer value) {
            addCriterion("oday <>", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayGreaterThan(Integer value) {
            addCriterion("oday >", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("oday >=", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayLessThan(Integer value) {
            addCriterion("oday <", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayLessThanOrEqualTo(Integer value) {
            addCriterion("oday <=", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayIn(List<Integer> values) {
            addCriterion("oday in", values, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotIn(List<Integer> values) {
            addCriterion("oday not in", values, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayBetween(Integer value1, Integer value2) {
            addCriterion("oday between", value1, value2, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotBetween(Integer value1, Integer value2) {
            addCriterion("oday not between", value1, value2, "oday");
            return (Criteria) this;
        }

        public Criteria andOmoneyIsNull() {
            addCriterion("omoney is null");
            return (Criteria) this;
        }

        public Criteria andOmoneyIsNotNull() {
            addCriterion("omoney is not null");
            return (Criteria) this;
        }

        public Criteria andOmoneyEqualTo(Integer value) {
            addCriterion("omoney =", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotEqualTo(Integer value) {
            addCriterion("omoney <>", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyGreaterThan(Integer value) {
            addCriterion("omoney >", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("omoney >=", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyLessThan(Integer value) {
            addCriterion("omoney <", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("omoney <=", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyIn(List<Integer> values) {
            addCriterion("omoney in", values, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotIn(List<Integer> values) {
            addCriterion("omoney not in", values, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyBetween(Integer value1, Integer value2) {
            addCriterion("omoney between", value1, value2, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("omoney not between", value1, value2, "omoney");
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