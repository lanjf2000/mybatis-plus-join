package com.github.yulichang.query.interfaces;

import com.baomidou.mybatisplus.core.conditions.interfaces.Compare;
import com.github.yulichang.config.MybatisPlusJoinIfAbsent;

/**
 * 查询条件封装
 * <p>比较值</p>
 *
 * @author yulichang
 * @since 1.4.9
 */
@SuppressWarnings("unused")
public interface CompareIfAbsent<Children, R> extends Compare<Children, R> {

    MybatisPlusJoinIfAbsent getIfAbsent();

    /**
     * 等于 =
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children eqIfAbsent(R column, Object val) {
        return eq(getIfAbsent().test(val), column, val);
    }

    /**
     * 不等于 &lt;&gt;
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children neIfAbsent(R column, Object val) {
        return ne(getIfAbsent().test(val), column, val);
    }

    /**
     * 大于 &gt;
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children gtIfAbsent(R column, Object val) {
        return gt(getIfAbsent().test(val), column, val);
    }

    /**
     * 大于等于 &gt;=
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children geIfAbsent(R column, Object val) {
        return ge(getIfAbsent().test(val), column, val);
    }

    /**
     * 小于 &lt;
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children ltIfAbsent(R column, Object val) {
        return lt(getIfAbsent().test(val), column, val);
    }

    /**
     * 小于等于 &lt;=
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children leIfAbsent(R column, Object val) {
        return le(getIfAbsent().test(val), column, val);
    }

    /**
     * LIKE '%值%'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children likeIfAbsent(R column, Object val) {
        return like(getIfAbsent().test(val), column, val);
    }

    /**
     * NOT LIKE '%值%'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children notLikeIfAbsent(R column, Object val) {
        return notLike(getIfAbsent().test(val), column, val);
    }

    /**
     * NOT LIKE '%值'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children notLikeLeftIfAbsent(R column, Object val) {
        return notLikeLeft(getIfAbsent().test(val), column, val);
    }

    /**
     * NOT LIKE '值%'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children notLikeRightIfAbsent(R column, Object val) {
        return notLikeRight(getIfAbsent().test(val), column, val);
    }

    /**
     * LIKE '%值'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children likeLeftIfAbsent(R column, Object val) {
        return likeLeft(getIfAbsent().test(val), column, val);
    }

    /**
     * LIKE '值%'
     *
     * @param column 字段
     * @param val    值
     * @return children
     */
    default Children likeRightIfAbsent(R column, Object val) {
        return likeRight(getIfAbsent().test(val), column, val);
    }
}
