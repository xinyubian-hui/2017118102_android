＃第一次的android作业bug解析
遇到版本不一致的问题，解决方案如下：
1、build.gradle 配置文件 
  gradle改为当前版本号：3.5.0；
  即：classpath 'com.android.tools.build:gradle:3.5.0'
  在jcenter();前加上google();
2、grade-wrapper.properties中
  distributionUrl=https\://services.gradle.org/distributions/gradle-5.4.1-all.zip
