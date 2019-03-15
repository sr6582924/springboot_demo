
/**
 * @author 徐丹丹
 */
package com.example.demo.models;


public class SystemUpdateEntity {
    private String phoneType;//Android/IOS
    private String sfversion;
    private String appFlag;

    public String getAppFlag() {
        return appFlag;
    }

    public void setAppFlag(String appFlag) {
        this.appFlag = appFlag;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getSfversion() {
        return sfversion;
    }

    public void setSfversion(String sfversion) {
        this.sfversion = sfversion;
    }

    public String toString2() {
        return "phoneType=" + phoneType + "&sfversion=" + sfversion;
    }

    public static void main(String[] args) {
        SystemUpdateEntity entity = new SystemUpdateEntity();
        entity.setPhoneType("Android");
        entity.setSfversion("3.0.1");
        System.out.println(entity);
    }

}
