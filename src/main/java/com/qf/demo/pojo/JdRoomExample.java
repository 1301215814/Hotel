package com.qf.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JdRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdRoomExample() {
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

        public Criteria andRoidIsNull() {
            addCriterion("roid is null");
            return (Criteria) this;
        }

        public Criteria andRoidIsNotNull() {
            addCriterion("roid is not null");
            return (Criteria) this;
        }

        public Criteria andRoidEqualTo(Integer value) {
            addCriterion("roid =", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotEqualTo(Integer value) {
            addCriterion("roid <>", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThan(Integer value) {
            addCriterion("roid >", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roid >=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThan(Integer value) {
            addCriterion("roid <", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidLessThanOrEqualTo(Integer value) {
            addCriterion("roid <=", value, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidIn(List<Integer> values) {
            addCriterion("roid in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotIn(List<Integer> values) {
            addCriterion("roid not in", values, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidBetween(Integer value1, Integer value2) {
            addCriterion("roid between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andRoidNotBetween(Integer value1, Integer value2) {
            addCriterion("roid not between", value1, value2, "roid");
            return (Criteria) this;
        }

        public Criteria andRowifiIsNull() {
            addCriterion("rowifi is null");
            return (Criteria) this;
        }

        public Criteria andRowifiIsNotNull() {
            addCriterion("rowifi is not null");
            return (Criteria) this;
        }

        public Criteria andRowifiEqualTo(Integer value) {
            addCriterion("rowifi =", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiNotEqualTo(Integer value) {
            addCriterion("rowifi <>", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiGreaterThan(Integer value) {
            addCriterion("rowifi >", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowifi >=", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiLessThan(Integer value) {
            addCriterion("rowifi <", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiLessThanOrEqualTo(Integer value) {
            addCriterion("rowifi <=", value, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiIn(List<Integer> values) {
            addCriterion("rowifi in", values, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiNotIn(List<Integer> values) {
            addCriterion("rowifi not in", values, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiBetween(Integer value1, Integer value2) {
            addCriterion("rowifi between", value1, value2, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRowifiNotBetween(Integer value1, Integer value2) {
            addCriterion("rowifi not between", value1, value2, "rowifi");
            return (Criteria) this;
        }

        public Criteria andRoshowerIsNull() {
            addCriterion("roshower is null");
            return (Criteria) this;
        }

        public Criteria andRoshowerIsNotNull() {
            addCriterion("roshower is not null");
            return (Criteria) this;
        }

        public Criteria andRoshowerEqualTo(Integer value) {
            addCriterion("roshower =", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerNotEqualTo(Integer value) {
            addCriterion("roshower <>", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerGreaterThan(Integer value) {
            addCriterion("roshower >", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("roshower >=", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerLessThan(Integer value) {
            addCriterion("roshower <", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerLessThanOrEqualTo(Integer value) {
            addCriterion("roshower <=", value, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerIn(List<Integer> values) {
            addCriterion("roshower in", values, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerNotIn(List<Integer> values) {
            addCriterion("roshower not in", values, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerBetween(Integer value1, Integer value2) {
            addCriterion("roshower between", value1, value2, "roshower");
            return (Criteria) this;
        }

        public Criteria andRoshowerNotBetween(Integer value1, Integer value2) {
            addCriterion("roshower not between", value1, value2, "roshower");
            return (Criteria) this;
        }

        public Criteria andRowindowIsNull() {
            addCriterion("rowindow is null");
            return (Criteria) this;
        }

        public Criteria andRowindowIsNotNull() {
            addCriterion("rowindow is not null");
            return (Criteria) this;
        }

        public Criteria andRowindowEqualTo(Integer value) {
            addCriterion("rowindow =", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowNotEqualTo(Integer value) {
            addCriterion("rowindow <>", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowGreaterThan(Integer value) {
            addCriterion("rowindow >", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowindow >=", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowLessThan(Integer value) {
            addCriterion("rowindow <", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowLessThanOrEqualTo(Integer value) {
            addCriterion("rowindow <=", value, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowIn(List<Integer> values) {
            addCriterion("rowindow in", values, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowNotIn(List<Integer> values) {
            addCriterion("rowindow not in", values, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowBetween(Integer value1, Integer value2) {
            addCriterion("rowindow between", value1, value2, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRowindowNotBetween(Integer value1, Integer value2) {
            addCriterion("rowindow not between", value1, value2, "rowindow");
            return (Criteria) this;
        }

        public Criteria andRobreakfastIsNull() {
            addCriterion("robreakfast is null");
            return (Criteria) this;
        }

        public Criteria andRobreakfastIsNotNull() {
            addCriterion("robreakfast is not null");
            return (Criteria) this;
        }

        public Criteria andRobreakfastEqualTo(Integer value) {
            addCriterion("robreakfast =", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastNotEqualTo(Integer value) {
            addCriterion("robreakfast <>", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastGreaterThan(Integer value) {
            addCriterion("robreakfast >", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastGreaterThanOrEqualTo(Integer value) {
            addCriterion("robreakfast >=", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastLessThan(Integer value) {
            addCriterion("robreakfast <", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastLessThanOrEqualTo(Integer value) {
            addCriterion("robreakfast <=", value, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastIn(List<Integer> values) {
            addCriterion("robreakfast in", values, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastNotIn(List<Integer> values) {
            addCriterion("robreakfast not in", values, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastBetween(Integer value1, Integer value2) {
            addCriterion("robreakfast between", value1, value2, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobreakfastNotBetween(Integer value1, Integer value2) {
            addCriterion("robreakfast not between", value1, value2, "robreakfast");
            return (Criteria) this;
        }

        public Criteria andRobedIsNull() {
            addCriterion("robed is null");
            return (Criteria) this;
        }

        public Criteria andRobedIsNotNull() {
            addCriterion("robed is not null");
            return (Criteria) this;
        }

        public Criteria andRobedEqualTo(String value) {
            addCriterion("robed =", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedNotEqualTo(String value) {
            addCriterion("robed <>", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedGreaterThan(String value) {
            addCriterion("robed >", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedGreaterThanOrEqualTo(String value) {
            addCriterion("robed >=", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedLessThan(String value) {
            addCriterion("robed <", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedLessThanOrEqualTo(String value) {
            addCriterion("robed <=", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedLike(String value) {
            addCriterion("robed like", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedNotLike(String value) {
            addCriterion("robed not like", value, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedIn(List<String> values) {
            addCriterion("robed in", values, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedNotIn(List<String> values) {
            addCriterion("robed not in", values, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedBetween(String value1, String value2) {
            addCriterion("robed between", value1, value2, "robed");
            return (Criteria) this;
        }

        public Criteria andRobedNotBetween(String value1, String value2) {
            addCriterion("robed not between", value1, value2, "robed");
            return (Criteria) this;
        }

        public Criteria andRomenIsNull() {
            addCriterion("romen is null");
            return (Criteria) this;
        }

        public Criteria andRomenIsNotNull() {
            addCriterion("romen is not null");
            return (Criteria) this;
        }

        public Criteria andRomenEqualTo(Integer value) {
            addCriterion("romen =", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenNotEqualTo(Integer value) {
            addCriterion("romen <>", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenGreaterThan(Integer value) {
            addCriterion("romen >", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenGreaterThanOrEqualTo(Integer value) {
            addCriterion("romen >=", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenLessThan(Integer value) {
            addCriterion("romen <", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenLessThanOrEqualTo(Integer value) {
            addCriterion("romen <=", value, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenIn(List<Integer> values) {
            addCriterion("romen in", values, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenNotIn(List<Integer> values) {
            addCriterion("romen not in", values, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenBetween(Integer value1, Integer value2) {
            addCriterion("romen between", value1, value2, "romen");
            return (Criteria) this;
        }

        public Criteria andRomenNotBetween(Integer value1, Integer value2) {
            addCriterion("romen not between", value1, value2, "romen");
            return (Criteria) this;
        }

        public Criteria andRoareaIsNull() {
            addCriterion("roarea is null");
            return (Criteria) this;
        }

        public Criteria andRoareaIsNotNull() {
            addCriterion("roarea is not null");
            return (Criteria) this;
        }

        public Criteria andRoareaEqualTo(Integer value) {
            addCriterion("roarea =", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaNotEqualTo(Integer value) {
            addCriterion("roarea <>", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaGreaterThan(Integer value) {
            addCriterion("roarea >", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("roarea >=", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaLessThan(Integer value) {
            addCriterion("roarea <", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaLessThanOrEqualTo(Integer value) {
            addCriterion("roarea <=", value, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaIn(List<Integer> values) {
            addCriterion("roarea in", values, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaNotIn(List<Integer> values) {
            addCriterion("roarea not in", values, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaBetween(Integer value1, Integer value2) {
            addCriterion("roarea between", value1, value2, "roarea");
            return (Criteria) this;
        }

        public Criteria andRoareaNotBetween(Integer value1, Integer value2) {
            addCriterion("roarea not between", value1, value2, "roarea");
            return (Criteria) this;
        }

        public Criteria andRonameIsNull() {
            addCriterion("roname is null");
            return (Criteria) this;
        }

        public Criteria andRonameIsNotNull() {
            addCriterion("roname is not null");
            return (Criteria) this;
        }

        public Criteria andRonameEqualTo(String value) {
            addCriterion("roname =", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotEqualTo(String value) {
            addCriterion("roname <>", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameGreaterThan(String value) {
            addCriterion("roname >", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameGreaterThanOrEqualTo(String value) {
            addCriterion("roname >=", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLessThan(String value) {
            addCriterion("roname <", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLessThanOrEqualTo(String value) {
            addCriterion("roname <=", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameLike(String value) {
            addCriterion("roname like", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotLike(String value) {
            addCriterion("roname not like", value, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameIn(List<String> values) {
            addCriterion("roname in", values, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotIn(List<String> values) {
            addCriterion("roname not in", values, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameBetween(String value1, String value2) {
            addCriterion("roname between", value1, value2, "roname");
            return (Criteria) this;
        }

        public Criteria andRonameNotBetween(String value1, String value2) {
            addCriterion("roname not between", value1, value2, "roname");
            return (Criteria) this;
        }

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
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