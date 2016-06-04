# webUIPractice
web UI实战

- 基础知识概览
    - [HTML](https://github.com/vagabond1-1983/blog/issues/39)
    - 作业： 设计一个注册表单
          这个网页标题为：系统注册页面
          表单包括：用户名、密码、确认密码、性别单选、所在省市、提交
          表单要规范，用表格形式呈现
    - [JavaScript](https://github.com/vagabond1-1983/blog/issues/40)
        - 表单验证部分代码 - formValidate.html
        - 随堂练习：注册页面在提交时，检查用户名的合法性（不为空、首字母不是空格、_），如果不合法，提示输入不正确，重新输入，如果合法，提示用户名输入正确
    - [DOM](https://github.com/vagabond1-1983/blog/issues/41)
        - 随堂练习：用DOM查找元素的方式，重写检查用户名的方法
    - [JQuery](https://github.com/vagabond1-1983/blog/issues/42)
        - 随堂练习：用JQuery查找元素的方式，重写检查用户名的方法
    - 作业：注册表单完善，包含JavaScript交互:
        提交后验证下列字段：
        用户名不能为空、用户名不能以数字0开头
        密码不少于8位
        密码和确认密码相同
        注册提交后，用户输入的信息展示：用户名，性别，所在省市
        要求使用jquery方式验证
    AJAX异步请求：1.观察获取异步请求 - baidu search 2.JQUERY AJAX异步请求方式
- Selenium热身：不同浏览器自动化访问baidu
    - [什么是selenium](https://www.ibm.com/developerworks/cn/web/wa-selenium2/)
    - 软件安装：firefox(安装到默认位置后，记得关闭更新), selenium IDE [百度云盘的软件共享](http://yun.baidu.com/pcloud/album/info?uk=1913063318&album_id=2794016679837573555)
    - [Firefox](src/main/java/com/test/java/webui/accessBaiduDemo/FirefoxAccessBaidu.java) -- 火狐访问百度
    - [Chrome](src/main/java/com/test/java/webui/accessBaiduDemo/ChromeAccessBaidu.java) -- Chrome访问百度
    - [IE](src/main/java/com/test/java/webui/accessBaiduDemo/IEAccessBaidu.java) -- IE访问百度
    - [小小封装下变成Common](src/main/java/com/test/java/webui/accessBaiduDemo/CommonAccessBaidu.java) -- 简单封装思路
- SeleniumIDE
    - 定位元素方式 ?  [baidu搜索为例](src/main/java/com/test/java/webui/seleniumIDE定位元素/seleniumIDE定位元素.md)
        - id
        - name
        - css
        - xpath(重点)  http://www.w3school.com.cn/xpath/xpath_syntax.asp
    - 使用 软件介绍
    - 录制回放  演示用IDE录制回放登录百度
    - 随堂：IDE录制回放登录百度
- TestNG基本介绍
    - [单元测试及框架 JUnit](src/main/java/com/test/java/unit/junit/AddFunctionServiceTest.java)
    - [什么是TestNG？跟JUnit区别在哪](https://github.com/vagabond1-1983/webUIPractice/issues/6)
    - [为什么用单元测试框架驱动selenium](https://github.com/vagabond1-1983/webUIPractice/issues/9)
        - 能够灵活的配置测试脚本（用例）运行Selenium脚本
    - [TestNG基本写法](src/main/java/com/test/java/testng/BasicDemo.java) -- before, test, after, assert
    有哪些基本注解?
- WebDriver基本API
    - [原理浅析?](https://github.com/vagabond1-1983/webUIPractice/issues/7) selenium1和2的原理
    - 更好的利用TestNG构建Selenium自动化用例  BaseTest & AbstractAccessBaidu
        - BestTest 作用：运行Test之前启动driver，运行Test之后退出driver
        - AbstractAccessBaidu 作用：访问相同网站baidu。也可以扩展为在所有的Test之前登录百度网站
    - WebDriver 接口
        - [浏览器最大化](src/main/java/com/test/java/webui/api/driver/MaximumBrowser.java)
    - WebElement 接口
        - *****[一个业务实例](src/main/java/com/test/java/webui/api/element/SearchTestOnBaidu.java) -- 百度一下Test，并记录下第一个div的文本
        - [getText](src/main/java/com/test/java/webui/api/element/GetTextTest.java) --获取元素文本
        - [getAttribute](src/main/java/com/test/java/webui/api/element/GetAttrubuteTest.java) --获取元素属性

    test-output 测试报告  reportNG 高级特性
- 高级技巧
    - Actions(键盘事件、鼠标双击)
        - *****[鼠标双击](src/main/java/com/test/java/webui/api/highLevelSkills/actions/ActionsDemo)
    - 执行JS
        - ***[用jQuery框架辅助](src/main/java/com/test/java/webui/api/highLevelSkills/jsExecutor/SelectElement.java)
    - 截图
        - *****[截图功能](src/main/java/com/test/java/webui/api/screenshot/highLevelSkills/TakesScreenshotTest.java)
    - 下拉列表
        - [选择下拉列表中的值](src/main/java/com/test/java/webui/api/highLevelSkills/select/SelectDemo.java)
    - 随堂：完成注册页面的自动化，并检验注册成功页面是否打开并截图
    - 测试流控制
        - 等待 *****
            - ****隐式等待(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/ImplicitlyWaitDemo.java)
            - *****显式等待(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/ConditionWaitDemo.java)
            - 简单来说，隐式等待是符合时间要求 - 超时时间，而显示等待是符合自定义条件，更灵活
            - 改进SearchTestOnBaidu的等待方式
        - 检查元素 *****
            - *****是否存在(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/ElementPresentDemo.java)
            - ***状态(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/ElementStatusCheckDemo.java)
        - 弹出窗口
            - ***名称识别(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/WindowPopupDemo.java) -- windowsNameTest()
            - ***标题识别(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/WindowPopupDemo.java) -- windowsTitleTest()
            - ****内容识别(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/WindowPopupDemo.java) -- windowsContentTest()
        - 警告框
            - ****警告框(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/AlertDemo.java) -- alertTest()
            - ****确认框(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/AlertDemo.java) -- confirmTest()
        - 框架
            - ***通过id或者name进入框架(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/FrameDemo.java) -- frameByIdOrNameTest()
            - ***通过页面内容进入框架(src/main/java/com/test/java/webui/api/highLevelSkills/testFlowControl/FrameDemo.java) -- frameByContentTest()
        - 作业：完成登录苏宁易购并添加商品到购物车的操作
- TestNG数据驱动
    - DataProvider
        - [基本写法](src/main/java/com/test/java/unit/testng/DataProviderDemo.java)
        - 实际用法 - 多账户登录验证 后面项目涉及
- TestNG xml运行
    - suite, test 套件的概念 TestRun.xml
- TestNG Listeners
    - 应用一：编写自己的listener
    - 应用二：美化版报告 ReportNG pom文件的配置  会配置，能说出来即可
    - [Arrow自学](https://github.com/NetEase/arrow)
- Page Factory 框架
    - [简单介绍Page Factory编程方式](src/main/java/com/test/java/webui/PageFactory/DriveLoginWithSimplePOM.java)
    - [数据和脚本分离](src/main/java/com/test/java/webui/PageFactory/LoginDrive.java)
- 模拟项目 自动化下单操作 苏宁的购买商品过程
    - 增强WebDriver类，WebDriverPlus，不用每次都初始化一堆driver，可以根据条件初始化
    - AbstractBasePage，创建基础方法供子类调用，如执行js，判断元素等
    - 把数据放到文件中，用数据驱动脚本  InvokeData -- 测试用例脚本需要继承InvokeData，读数据的方法才能起作用
    - 把流程拆开，login一般用在before阶段，商品、下单和查看变成多个测试用例


- [接口测试部分 - 简单介绍](接口测试.md)

- TODO 研究录制视频 appium介绍

附录：
- 书籍文章推荐
    - [JavaScript秘密花园](http://bonsaiden.github.io/JavaScript-Garden/zh/)
    - [PageFactory官方说明](https://github.com/SeleniumHQ/selenium/wiki/PageFactory)
    - [深入TestNG](http://www.shenyanchao.cn/blog/2013/06/05/deep-in-testng/)