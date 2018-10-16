package com.adc.da.gen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.codemagic.DbCodeGenerateFactory;

public class CodeUtil {

    public CodeUtil() {}

    public static void main(String args[]) {

        String entityPackage;

        entityPackage = "workflow";
        /*#######################################管理(manager)###################################################*/
       /* DbCodeGenerateFactory.codeGenerate("USERROLE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("DEPARTMENTAL", entityPackage);
        DbCodeGenerateFactory.codeGenerate("DEPARTMENTALPOSITIONS", entityPackage);
        DbCodeGenerateFactory.codeGenerate("FUNCTION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PERSONDEPARTMENTPOSITION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PERSONNEWS", entityPackage);
        DbCodeGenerateFactory.codeGenerate("USERLOG", entityPackage);
        DbCodeGenerateFactory.codeGenerate("POSITION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("ROLEDISTRIBUTION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("ROLEFUNCTION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("USERLOGIN", entityPackage);*/
       /*###################################业务(business)###################################################*/
       /* DbCodeGenerateFactory.codeGenerate("RESUMESCORE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("ANNOUNCE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("INTERVIEWRECORDS", entityPackage);
        DbCodeGenerateFactory.codeGenerate("INTERVIEWIMAGE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("CAREERTALK", entityPackage);
        DbCodeGenerateFactory.codeGenerate("WEBSITECONFIGURATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PROJECTMANAGEMENT", entityPackage);
        DbCodeGenerateFactory.codeGenerate("MAILSENDLOG", entityPackage);
        DbCodeGenerateFactory.codeGenerate("MAILMODULETEMPLATE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("RECRUITMENTINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPLICATIONTEMPLATEDETAILS", entityPackage);
        DbCodeGenerateFactory.codeGenerate("HANDSONBACKGROUND", entityPackage);
        DbCodeGenerateFactory.codeGenerate("EDUCATIONALBACKGROUND", entityPackage);
        DbCodeGenerateFactory.codeGenerate("FAMILYSITUATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("TEMPORARYINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("JOBINTENSION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PROJECTEXPERIENCE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("ADDITIONALINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PRACTICEEXPERIENCE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("REWARD", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PAPER", entityPackage);
        DbCodeGenerateFactory.codeGenerate("SYSTEMLOG", entityPackage);
        DbCodeGenerateFactory.codeGenerate("TALENTPOOL", entityPackage);
        DbCodeGenerateFactory.codeGenerate("SCHOOLINFORMATIONMANAGEMENT", entityPackage);
        DbCodeGenerateFactory.codeGenerate("CITYINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("STAFFSTYLE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("CITYINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPLYMEMBER", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPLICATIONTEMPLATE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPLICATIONINFORMATION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("JOBCANDIDATESPOST", entityPackage);
        DbCodeGenerateFactory.codeGenerate("ABILITY", entityPackage);
        DbCodeGenerateFactory.codeGenerate("JOBPOSITION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("INTERVIEWPLACE", entityPackage);*/
       /*####################################业务流#############################################################*/
        /*DbCodeGenerateFactory.codeGenerate("OPERATIONFLOW", entityPackage);
        DbCodeGenerateFactory.codeGenerate("PROCESSNODE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("NODEAPPROVER", entityPackage);
        DbCodeGenerateFactory.codeGenerate("NODEFUNCTION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPROVALFUNCTION", entityPackage);
        DbCodeGenerateFactory.codeGenerate("NODEATTRIBUTE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("APPROVALSERVICE", entityPackage);
        DbCodeGenerateFactory.codeGenerate("NODETRACKING", entityPackage);
        DbCodeGenerateFactory.codeGenerate("FEEDBACKINFORMATION", entityPackage);*/


    }


    public static void testOracle()
    {
        Connection con = null;// 创建一个数据库连接
        PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
        ResultSet result = null;// 创建一个结果集对象
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
            System.out.println("开始尝试连接数据库！");
            String url = "jdbc:oracle:" + "thin:@60.30.69.61:1521:ADC";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
            String user = "adcda01";// 用户名,系统默认的账户名
            String password = "adcda01";// 你安装时选设置的密码
            con = DriverManager.getConnection(url, user, password);// 获取连接
            System.out.println("连接成功！");
            String sql = "select * from TEST";// 预编译语句，“？”代表参数
            pre = con.prepareStatement(sql);// 实例化预编译语句
            result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
            while (result.next())
                // 当结果集不为空时
                System.out.println("学号:" + result.getInt("id") );
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
                // 注意关闭的顺序，最后使用的最先关闭
                if (result != null)
                    result.close();
                if (pre != null)
                    pre.close();
                if (con != null)
                    con.close();
                System.out.println("数据库连接已关闭！");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
