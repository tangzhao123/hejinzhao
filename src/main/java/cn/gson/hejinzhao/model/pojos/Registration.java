package cn.gson.hejinzhao.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Registration {
    private int strationId; //序号
    private String strationName ;//患者姓名
    private String strationSex; //患者性别
    private int strationAge ;//患者年龄
    private String strationCoding; //社保编码
    private String strationUnits; //工作单位
    private String strationPhone ;//联系电话
    private String strationAddress; //家庭住址
    private Timestamp strationDate ;//入院时间
    private String strationDiagnosis; //诊断
    private String strationHospital ;//住院号
    private String strationAfter ;//外伤发生经过
    private String strationPresenters; //陈述人
    private String strationShip; //与患者的关系
    private String strationPreparer; //填表人
    private String strationPatients ;//患者签名

    public int getStrationId() {
        return strationId;
    }

    public void setStrationId(int strationId) {
        this.strationId = strationId;
    }

    public String getStrationName() {
        return strationName;
    }

    public void setStrationName(String strationName) {
        this.strationName = strationName;
    }

    public String getStrationSex() {
        return strationSex;
    }

    public void setStrationSex(String strationSex) {
        this.strationSex = strationSex;
    }

    public int getStrationAge() {
        return strationAge;
    }

    public void setStrationAge(int strationAge) {
        this.strationAge = strationAge;
    }

    public String getStrationCoding() {
        return strationCoding;
    }

    public void setStrationCoding(String strationCoding) {
        this.strationCoding = strationCoding;
    }

    public String getStrationUnits() {
        return strationUnits;
    }

    public void setStrationUnits(String strationUnits) {
        this.strationUnits = strationUnits;
    }

    public String getStrationPhone() {
        return strationPhone;
    }

    public void setStrationPhone(String strationPhone) {
        this.strationPhone = strationPhone;
    }

    public String getStrationAddress() {
        return strationAddress;
    }

    public void setStrationAddress(String strationAddress) {
        this.strationAddress = strationAddress;
    }

    public Timestamp getStrationDate() {
        return strationDate;
    }

    public void setStrationDate(Timestamp strationDate) {
        this.strationDate = strationDate;
    }

    public String getStrationDiagnosis() {
        return strationDiagnosis;
    }

    public void setStrationDiagnosis(String strationDiagnosis) {
        this.strationDiagnosis = strationDiagnosis;
    }

    public String getStrationHospital() {
        return strationHospital;
    }

    public void setStrationHospital(String strationHospital) {
        this.strationHospital = strationHospital;
    }

    public String getStrationAfter() {
        return strationAfter;
    }

    public void setStrationAfter(String strationAfter) {
        this.strationAfter = strationAfter;
    }

    public String getStrationPresenters() {
        return strationPresenters;
    }

    public void setStrationPresenters(String strationPresenters) {
        this.strationPresenters = strationPresenters;
    }

    public String getStrationShip() {
        return strationShip;
    }

    public void setStrationShip(String strationShip) {
        this.strationShip = strationShip;
    }

    public String getStrationPreparer() {
        return strationPreparer;
    }

    public void setStrationPreparer(String strationPreparer) {
        this.strationPreparer = strationPreparer;
    }

    public String getStrationPatients() {
        return strationPatients;
    }

    public void setStrationPatients(String strationPatients) {
        this.strationPatients = strationPatients;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "strationId=" + strationId +
                ", strationName='" + strationName + '\'' +
                ", strationSex='" + strationSex + '\'' +
                ", strationAge=" + strationAge +
                ", strationCoding='" + strationCoding + '\'' +
                ", strationUnits='" + strationUnits + '\'' +
                ", strationPhone='" + strationPhone + '\'' +
                ", strationAddress='" + strationAddress + '\'' +
                ", strationDate=" + strationDate +
                ", strationDiagnosis='" + strationDiagnosis + '\'' +
                ", strationHospital='" + strationHospital + '\'' +
                ", strationAfter='" + strationAfter + '\'' +
                ", strationPresenters='" + strationPresenters + '\'' +
                ", strationShip='" + strationShip + '\'' +
                ", strationPreparer='" + strationPreparer + '\'' +
                ", strationPatients='" + strationPatients + '\'' +
                '}';
    }
}
