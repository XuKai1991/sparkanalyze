package com.learn.analyze.dao.impl;

import com.learn.analyze.dao.IPageSplitConvertRateDAO;
import com.learn.analyze.domain.PageSplitConvertRate;
import com.learn.analyze.jdbc.JDBCHelper;

/**
 * Author: Xukai
 * Description: 页面切片转换率DAO接口实现类
 * CreateDate: 2018/5/21 16:49
 * Modified By:
 */
public class PageSplitConvertRateDAOImpl implements IPageSplitConvertRateDAO {
    @Override
    public void insert(PageSplitConvertRate pageSplitConvertRate) {
        String sql = "insert into page_split_convert_rate values(?,?)";
        Object[] params = new Object[]{
                pageSplitConvertRate.getTaskid(),
                pageSplitConvertRate.getConvertRate()
        };
        JDBCHelper jdbcHelper = JDBCHelper.getInstance();
        jdbcHelper.executeUpdate(sql, params);
    }
}
