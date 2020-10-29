package com.zhanghongshan.springcloud.mybatisplusgenerator;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;

/**
 * @author zhangmin
 * @date 2020/3/29
 */
public class CodeGenerator {
    static Logger log = LoggerFactory.getLogger(CodeGenerator.class);

    public static void main(String[] args) {

        //1.全局配置
        String outDir = System.getProperty("user.dir") + "/mybatis-plus-generator/src/main/java";

        GlobalConfig gbCfg = new GlobalConfig();
        gbCfg.setAuthor("zhangmin")
                .setOutputDir(outDir)
                .setIdType(IdType.AUTO)
                .setFileOverride(true)
                .setServiceName("%sService")
                .setBaseColumnList(true)
                .setBaseResultMap(true)
                .setOpen(false);


        //2.数据库配置
        DataSourceConfig dataConfig = new DataSourceConfig();
        dataConfig.setDbType(DbType.MYSQL);
        dataConfig.setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:13306/jeecg-boot?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false")
                .setUsername("root")
                .setPassword("123456");


        //3.策略配置
        StrategyConfig strategyConf = new StrategyConfig();
        strategyConf.setCapitalMode(true);
        strategyConf.setNaming(NamingStrategy.underline_to_camel);
        strategyConf.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConf.setEntityLombokModel(true);
        strategyConf.setRestControllerStyle(true);
        strategyConf.setEntityBooleanColumnRemoveIsPrefix(true);
        strategyConf.setInclude("demo");// 指定表名

        String moduleFolder = "demo";

        //4.包策略配置
        PackageConfig packConf = new PackageConfig();
        packConf.setParent("com.zhanghongshan.springcloud.generator.code."+moduleFolder);
        packConf.setController("controller");
        packConf.setService("service");
        packConf.setMapper("mapper");
        packConf.setEntity("entity");
        packConf.setXml("mapper");


        AutoGenerator generator = new AutoGenerator();
        generator.setGlobalConfig(gbCfg)
                .setDataSource(dataConfig)
                .setPackageInfo(packConf)
                .setStrategy(strategyConf);

        //5.执行
        generator.execute();
    }

}
