package com.adc.da.business.entity;

import com.adc.da.base.entity.BaseEntity;

import com.adc.da.util.utils.DateUtils;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <b>功能：</b>APPLYMEMBER ApplymemberEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-27 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ApplymemberEO extends BaseEntity {

    private Integer volunteer;//志愿

    private String annexresume;//附件简历

    private String mailingaddress;//通信地址

    private String japaneselevel;//日语等级

    private String religiousbelief;//宗教信仰

    private String technicaltitle;//专业技术职称

    @org.springframework.format.annotation.DateTimeFormat(pattern= DateUtils.yyyy_MM_dd_HH_mm_ss_EN)
    private Date workinghours;//参加工作时间

    private String graduating;//应届往届

    private String professionalranking;//专业排名

    private String awardwinning;//获奖情况

    private String positioninschool;//在校职务

    private String englishachievement;//英语等级成绩

    private String englishclass;//英语等级

    private String origin;//籍贯

    private String nation;//民族

    private String politicaloutlook;//政治面貌

    private String hukou;//户口所在地

    private String presentaddress;//现居住地址

    @org.springframework.format.annotation.DateTimeFormat(pattern= DateUtils.yyyy_MM_dd_HH_mm_ss_EN)
    private Date graduationtime;//毕业时间

    /**
     *更改信息源:{}
     * **/
    private String updateinformation;//修改信息源

    /**
     * 创建信息源:{}
     * **/
    private String createinformation;//创建信息源

    private Float totalscore;//简历评分总数

    private String account;//登陆账户

    private String password;//登陆密码

    private String schoolinformation;//学校信息

    /**
     * 人员状态:{}
     * **/
    private Integer personnelstate;//人员状态

    @NotNull(message = "黑名单不能为空")
    @Range(message = "是否进入黑名单只有0(黑名单),1(白名单)",min = 0,max = 1)
    private Integer blacklist = 1;//是否进入黑名单

    private String idphoto;//证件类型及号码

    private Long idnumber;//证件照

    private String workinglife;//工作年限

    private String highestdegree;//最高学历

    private Long phone;//手机号码

    @Email(message = "不是正确的邮箱格式")
    private String email;//邮箱地址

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//出生日期
    private Date birth;

    private String gender;//性别

    private String professionalname;//专业名称

    private String name;//姓名

    private String applymemberkey;//应聘人员主键


    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>professionalname -> professionalname</li>
     * <li>gender -> gender</li>
     * <li>birth -> birth</li>
     * <li>email -> email</li>
     * <li>phone -> phone</li>
     * <li>highestdegree -> highestdegree</li>
     * <li>workinglife -> workinglife</li>
     * <li>idnumber -> idnumber</li>
     * <li>idphoto -> idphoto</li>
     * <li>blacklist -> blacklist</li>
     * <li>personnelstate -> personnelstate</li>
     * <li>schoolinformation -> schoolinformation</li>
     * <li>password -> password</li>
     * <li>account -> account</li>
     * <li>totalscore -> totalscore</li>
     * <li>createinformation -> createinformation</li>
     * <li>updateinformation -> updateinformation</li>
     * <li>graduationtime -> graduationtime</li>
     * <li>presentaddress -> presentaddress</li>
     * <li>hukou -> hukou</li>
     * <li>politicaloutlook -> politicaloutlook</li>
     * <li>nation -> nation</li>
     * <li>origin -> origin</li>
     * <li>englishclass -> englishclass</li>
     * <li>englishachievement -> englishachievement</li>
     * <li>positioninschool -> positioninschool</li>
     * <li>awardwinning -> awardwinning</li>
     * <li>professionalranking -> professionalranking</li>
     * <li>graduating -> graduating</li>
     * <li>workinghours -> workinghours</li>
     * <li>technicaltitle -> technicaltitle</li>
     * <li>religiousbelief -> religiousbelief</li>
     * <li>japaneselevel -> japaneselevel</li>
     * <li>mailingaddress -> mailingaddress</li>
     * <li>annexresume -> annexresume</li>
     * <li>volunteer -> volunteer</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "professionalname": return "professionalname";
            case "gender": return "gender";
            case "birth": return "birth";
            case "email": return "email";
            case "phone": return "phone";
            case "highestdegree": return "highestdegree";
            case "workinglife": return "workinglife";
            case "idnumber": return "idnumber";
            case "idphoto": return "idphoto";
            case "blacklist": return "blacklist";
            case "personnelstate": return "personnelstate";
            case "schoolinformation": return "schoolinformation";
            case "password": return "password";
            case "account": return "account";
            case "totalscore": return "totalscore";
            case "createinformation": return "createinformation";
            case "updateinformation": return "updateinformation";
            case "graduationtime": return "graduationtime";
            case "presentaddress": return "presentaddress";
            case "hukou": return "hukou";
            case "politicaloutlook": return "politicaloutlook";
            case "nation": return "nation";
            case "origin": return "origin";
            case "englishclass": return "englishclass";
            case "englishachievement": return "englishachievement";
            case "positioninschool": return "positioninschool";
            case "awardwinning": return "awardwinning";
            case "professionalranking": return "professionalranking";
            case "graduating": return "graduating";
            case "workinghours": return "workinghours";
            case "technicaltitle": return "technicaltitle";
            case "religiousbelief": return "religiousbelief";
            case "japaneselevel": return "japaneselevel";
            case "mailingaddress": return "mailingaddress";
            case "annexresume": return "annexresume";
            case "volunteer": return "volunteer";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>applymemberkey -> applymemberkey</li>
     * <li>name -> name</li>
     * <li>professionalname -> professionalname</li>
     * <li>gender -> gender</li>
     * <li>birth -> birth</li>
     * <li>email -> email</li>
     * <li>phone -> phone</li>
     * <li>highestdegree -> highestdegree</li>
     * <li>workinglife -> workinglife</li>
     * <li>idnumber -> idnumber</li>
     * <li>idphoto -> idphoto</li>
     * <li>blacklist -> blacklist</li>
     * <li>personnelstate -> personnelstate</li>
     * <li>schoolinformation -> schoolinformation</li>
     * <li>password -> password</li>
     * <li>account -> account</li>
     * <li>totalscore -> totalscore</li>
     * <li>createinformation -> createinformation</li>
     * <li>updateinformation -> updateinformation</li>
     * <li>graduationtime -> graduationtime</li>
     * <li>presentaddress -> presentaddress</li>
     * <li>hukou -> hukou</li>
     * <li>politicaloutlook -> politicaloutlook</li>
     * <li>nation -> nation</li>
     * <li>origin -> origin</li>
     * <li>englishclass -> englishclass</li>
     * <li>englishachievement -> englishachievement</li>
     * <li>positioninschool -> positioninschool</li>
     * <li>awardwinning -> awardwinning</li>
     * <li>professionalranking -> professionalranking</li>
     * <li>graduating -> graduating</li>
     * <li>workinghours -> workinghours</li>
     * <li>technicaltitle -> technicaltitle</li>
     * <li>religiousbelief -> religiousbelief</li>
     * <li>japaneselevel -> japaneselevel</li>
     * <li>mailingaddress -> mailingaddress</li>
     * <li>annexresume -> annexresume</li>
     * <li>volunteer -> volunteer</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "applymemberkey": return "applymemberkey";
            case "name": return "name";
            case "professionalname": return "professionalname";
            case "gender": return "gender";
            case "birth": return "birth";
            case "email": return "email";
            case "phone": return "phone";
            case "highestdegree": return "highestdegree";
            case "workinglife": return "workinglife";
            case "idnumber": return "idnumber";
            case "idphoto": return "idphoto";
            case "blacklist": return "blacklist";
            case "personnelstate": return "personnelstate";
            case "schoolinformation": return "schoolinformation";
            case "password": return "password";
            case "account": return "account";
            case "totalscore": return "totalscore";
            case "createinformation": return "createinformation";
            case "updateinformation": return "updateinformation";
            case "graduationtime": return "graduationtime";
            case "presentaddress": return "presentaddress";
            case "hukou": return "hukou";
            case "politicaloutlook": return "politicaloutlook";
            case "nation": return "nation";
            case "origin": return "origin";
            case "englishclass": return "englishclass";
            case "englishachievement": return "englishachievement";
            case "positioninschool": return "positioninschool";
            case "awardwinning": return "awardwinning";
            case "professionalranking": return "professionalranking";
            case "graduating": return "graduating";
            case "workinghours": return "workinghours";
            case "technicaltitle": return "technicaltitle";
            case "religiousbelief": return "religiousbelief";
            case "japaneselevel": return "japaneselevel";
            case "mailingaddress": return "mailingaddress";
            case "annexresume": return "annexresume";
            case "volunteer": return "volunteer";
            default: return null;
        }
    }
    
    /**  **/
    public String getApplymemberkey() {
        return this.applymemberkey;
    }

    /**  **/
    public void setApplymemberkey(String applymemberkey) {
        this.applymemberkey = applymemberkey;
    }

    /**  **/
    public String getName() {
        return this.name;
    }

    /**  **/
    public String getProfessionalname() {
        return this.professionalname;
    }

    /**  **/
    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname;
    }

    /**  **/
    public String getGender() {
        return this.gender;
    }

    /**  **/
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**  **/
    public Date getBirth() {
        return this.birth;
    }

    /**  **/
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**  **/
    public String getEmail() {
        return this.email;
    }

    /**  **/
    public void setEmail(String email) {
        this.email = email;
    }

    /**  **/
    public Long getPhone() {
        return this.phone;
    }

    /**  **/
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**  **/
    public String getHighestdegree() {
        return this.highestdegree;
    }

    /**  **/
    public void setHighestdegree(String highestdegree) {
        this.highestdegree = highestdegree;
    }

    /**  **/
    public String getWorkinglife() {
        return this.workinglife;
    }

    /**  **/
    public void setWorkinglife(String workinglife) {
        this.workinglife = workinglife;
    }

    /**  **/
    public Long getIdnumber() {
        return this.idnumber;
    }

    /**  **/
    public void setIdnumber(Long idnumber) {
        this.idnumber = idnumber;
    }

    /**  **/
    public String getIdphoto() {
        return this.idphoto;
    }

    /**  **/
    public void setIdphoto(String idphoto) {
        this.idphoto = idphoto;
    }

    /**  **/
    public Integer getBlacklist() {
        return this.blacklist;
    }

    /**  **/
    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    /**  **/
    public Integer getPersonnelstate() {
        return this.personnelstate;
    }

    /**  **/
    public void setPersonnelstate(Integer personnelstate) {
        this.personnelstate = personnelstate;
    }

    /**  **/
    public String getSchoolinformation() {
        return this.schoolinformation;
    }

    /**  **/
    public void setSchoolinformation(String schoolinformation) {
        this.schoolinformation = schoolinformation;
    }

    /**  **/
    public String getPassword() {
        return this.password;
    }

    /**  **/
    public void setPassword(String password) {
        this.password = password;
    }

    /**  **/
    public String getAccount() {
        return this.account;
    }

    /**  **/
    public void setAccount(String account) {
        this.account = account;
    }

    /**  **/
    public Float getTotalscore() {
        return this.totalscore;
    }

    /**  **/
    public void setTotalscore(Float totalscore) {
        this.totalscore = totalscore;
    }

    /**  **/
    public String getCreateinformation() {
        return this.createinformation;
    }

    /**  **/
    public void setCreateinformation(String createinformation) {
        this.createinformation = createinformation;
    }

    /**  **/
    public String getUpdateinformation() {
        return this.updateinformation;
    }

    /**  **/
    public void setUpdateinformation(String updateinformation) {
        this.updateinformation = updateinformation;
    }

    /**  **/
    public Date getGraduationtime() {
        return this.graduationtime;
    }

    /**  **/
    public void setGraduationtime(Date graduationtime) {
        this.graduationtime = graduationtime;
    }

    /**  **/
    public String getPresentaddress() {
        return this.presentaddress;
    }

    /**  **/
    public void setPresentaddress(String presentaddress) {
        this.presentaddress = presentaddress;
    }

    /**  **/
    public String getHukou() {
        return this.hukou;
    }

    /**  **/
    public void setHukou(String hukou) {
        this.hukou = hukou;
    }

    /**  **/
    public String getPoliticaloutlook() {
        return this.politicaloutlook;
    }

    /**  **/
    public void setPoliticaloutlook(String politicaloutlook) {
        this.politicaloutlook = politicaloutlook;
    }

    /**  **/
    public String getNation() {
        return this.nation;
    }

    /**  **/
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**  **/
    public String getOrigin() {
        return this.origin;
    }

    /**  **/
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**  **/
    public String getEnglishclass() {
        return this.englishclass;
    }

    /**  **/
    public void setEnglishclass(String englishclass) {
        this.englishclass = englishclass;
    }

    /**  **/
    public String getEnglishachievement() {
        return this.englishachievement;
    }

    /**  **/
    public void setEnglishachievement(String englishachievement) {
        this.englishachievement = englishachievement;
    }

    /**  **/
    public String getPositioninschool() {
        return this.positioninschool;
    }

    /**  **/
    public void setPositioninschool(String positioninschool) {
        this.positioninschool = positioninschool;
    }

    /**  **/
    public String getAwardwinning() {
        return this.awardwinning;
    }

    /**  **/
    public void setAwardwinning(String awardwinning) {
        this.awardwinning = awardwinning;
    }

    /**  **/
    public String getProfessionalranking() {
        return this.professionalranking;
    }

    /**  **/
    public void setProfessionalranking(String professionalranking) {
        this.professionalranking = professionalranking;
    }

    /**  **/
    public String getGraduating() {
        return this.graduating;
    }

    /**  **/
    public void setGraduating(String graduating) {
        this.graduating = graduating;
    }

    /**  **/
    public Date getWorkinghours() {
        return this.workinghours;
    }

    /**  **/
    public void setWorkinghours(Date workinghours) {
        this.workinghours = workinghours;
    }

    /**  **/
    public String getTechnicaltitle() {
        return this.technicaltitle;
    }

    /**  **/
    public void setTechnicaltitle(String technicaltitle) {
        this.technicaltitle = technicaltitle;
    }

    /**  **/
    public String getReligiousbelief() {
        return this.religiousbelief;
    }

    /**  **/
    public void setReligiousbelief(String religiousbelief) {
        this.religiousbelief = religiousbelief;
    }

    /**  **/
    public String getJapaneselevel() {
        return this.japaneselevel;
    }

    /**  **/
    public void setJapaneselevel(String japaneselevel) {
        this.japaneselevel = japaneselevel;
    }

    /**  **/
    public String getMailingaddress() {
        return this.mailingaddress;
    }

    /**  **/
    public void setName(String name) {
        this.name = name;
    }

    /**  **/
    public String getAnnexresume() {
        return this.annexresume;
    }

    /**  **/
    public void setAnnexresume(String annexresume) {
        this.annexresume = annexresume;
    }

    /**  **/
    public Integer getVolunteer() {
        return this.volunteer;
    }

    /**  **/
    public void setVolunteer(Integer volunteer) {
        this.volunteer = volunteer;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"volunteer\":")
                .append(volunteer);
        sb.append(",\"annexresume\":\"")
                .append(annexresume).append('\"');
        sb.append(",\"mailingaddress\":\"")
                .append(mailingaddress).append('\"');
        sb.append(",\"japaneselevel\":\"")
                .append(japaneselevel).append('\"');
        sb.append(",\"religiousbelief\":\"")
                .append(religiousbelief).append('\"');
        sb.append(",\"technicaltitle\":\"")
                .append(technicaltitle).append('\"');
        sb.append(",\"workinghours\":\"")
                .append(workinghours).append('\"');
        sb.append(",\"graduating\":\"")
                .append(graduating).append('\"');
        sb.append(",\"professionalranking\":\"")
                .append(professionalranking).append('\"');
        sb.append(",\"awardwinning\":\"")
                .append(awardwinning).append('\"');
        sb.append(",\"positioninschool\":\"")
                .append(positioninschool).append('\"');
        sb.append(",\"englishachievement\":\"")
                .append(englishachievement).append('\"');
        sb.append(",\"englishclass\":\"")
                .append(englishclass).append('\"');
        sb.append(",\"origin\":\"")
                .append(origin).append('\"');
        sb.append(",\"nation\":\"")
                .append(nation).append('\"');
        sb.append(",\"politicaloutlook\":\"")
                .append(politicaloutlook).append('\"');
        sb.append(",\"hukou\":\"")
                .append(hukou).append('\"');
        sb.append(",\"presentaddress\":\"")
                .append(presentaddress).append('\"');
        sb.append(",\"graduationtime\":\"")
                .append(graduationtime).append('\"');
        sb.append(",\"updateinformation\":\"")
                .append(updateinformation).append('\"');
        sb.append(",\"createinformation\":\"")
                .append(createinformation).append('\"');
        sb.append(",\"totalscore\":")
                .append(totalscore);
        sb.append(",\"account\":\"")
                .append(account).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"schoolinformation\":")
                .append(schoolinformation);
        sb.append(",\"personnelstate\":")
                .append(personnelstate);
        sb.append(",\"blacklist\":")
                .append(blacklist);
        sb.append(",\"idphoto\":\"")
                .append(idphoto).append('\"');
        sb.append(",\"idnumber\":")
                .append(idnumber);
        sb.append(",\"workinglife\":\"")
                .append(workinglife).append('\"');
        sb.append(",\"highestdegree\":\"")
                .append(highestdegree).append('\"');
        sb.append(",\"phone\":")
                .append(phone);
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"birth\":\"")
                .append(birth).append('\"');
        sb.append(",\"gender\":\"")
                .append(gender).append('\"');
        sb.append(",\"professionalname\":\"")
                .append(professionalname).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"applymemberkey\":\"")
                .append(applymemberkey).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
