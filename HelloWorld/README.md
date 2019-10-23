实验一 导入HelloWorld文件
=====
遇到bug解析
-----
* build.gradle 配置文件 
>>gradle改为当前版本号：3.5.0；即：classpath 'com.android.tools.build:gradle:3.5.0'
* grade-wrapper.properties中
>>更改为：distributionUrl=https\://services.gradle.org/distributions/gradle-5.4.1-all.zip

实验二 创建两个活动相互转换
=====
* 声明按钮

实验三 三个活动间对应转换
=====
* 三个活动间的转换包含一到一、一到二、一到三

实验四 四个模式下活动的转换
=====
* standard模式
>>需要活动时会一直创建新的活动，退出的时候也是一个活动一个活动地退
* singleTask模式
>>当需要的活动在前面已经创建了，则注销压在所需活动上面的所有活动
* singleTop模式
>>若需要的活动在前面已经创建，但此时并不在栈顶则仍需创建一个新活动；若该活动已在栈顶则无需重新创建
* singleInstance模式
>>它具备所有singleTask的特点，唯一不同的是，它是存在于另一个任务栈中。上面的三种模式都存在于同一个任务栈中，而这种模式则是存在于另一个任务栈中。

实验五 使用隐式Intent的用法
=====
* 实现浏览器
>>URL为http://
* 实现拨号
>>URL为tel:
* 实现地理位置
>>URL为geo:
