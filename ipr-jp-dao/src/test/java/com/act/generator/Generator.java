package com.act.generator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author xiongfeixiang
 * @title Generator
 * @date 2017/7/7 19:54
 * @since v1.0.0
 */
public class Generator {
    public static void main(String[] args) throws IOException, XMLParserException, SQLException, InterruptedException, InvalidConfigurationException {
        Properties props = new Properties();
        File file = new File(Generator.class.getResource("/").getPath()+"/generator/config.properties");
        props.load(new FileReader(file));
        String path = System.getProperty("user.dir") + "/" + props.get("targetProject").toString();
        props.setProperty("targetProject", path);
        System.out.println(path);
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(Generator.class.getResource("/").getPath()+"/generator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(props, warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator= new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
        System.out.println(warnings);
    }
}
