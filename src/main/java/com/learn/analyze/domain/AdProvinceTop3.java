package com.learn.analyze.domain;

/**
 * Author: Xukai
 * Description: 各省top3热门广告
 * CreateDate: 2018/5/28 13:53
 * Modified By:
 */
public class AdProvinceTop3 {

    private String date;
    private String province;
    private long adid;
    private long clickCount;

    public AdProvinceTop3() {
        super();
    }

    public AdProvinceTop3(String date, String province, long adid, long clickCount) {
        this.date = date;
        this.province = province;
        this.adid = adid;
        this.clickCount = clickCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public long getAdid() {
        return adid;
    }

    public void setAdid(long adid) {
        this.adid = adid;
    }

    public long getClickCount() {
        return clickCount;
    }

    public void setClickCount(long clickCount) {
        this.clickCount = clickCount;
    }
}
