# Java学习笔记
**声明：本笔记具体可参考 [速学堂学习网站](https://www.sxt.cn/Java_jQuery_in_action/History_Direction.html)**

## 第一章 Java入门
### 1.1 计算机语言发展史以及未来
计算机语言的三代发展
* 机器语言
* 汇编语言
* 高级语言
*补：语录--算法是计算机的灵魂，编程语言是塑造计算机灵魂的工具*

### 1.2 常见编程语言介绍
1. C语言：C语言是人们追求结构化、模块化、高效率的“语言之花”。在底层编程，比如嵌入式、病毒开发等应用，可以替代汇编语言来开发系统程序。在高层应用，也可以开发从操作系统(Unix/Linux/Windows都基于C语言开发)到各种应用软件。
2. C++语言： C++语言在科学计算、操作系统、网络通讯、系统开发、引擎开发中仍然被大量使用。
3. Java语言： Java广泛应用于企业级软件开发、安卓移动开发、大数据云计算等领域，几乎涉及IT所有行业。
4. PHP语言：PHP语言，一般用于WEB开发领域；大量的中小型网站以及某些大型网站使用PHP开发。
5. Object-C和Swift语言：Object-C是扩充C的面向对象编程语言，主要用于苹果软件的开发。Swift是苹果于2014年WWDC（苹果开发者大会）发布的新开发语言，可与OC共同运行于Mac OS和iOS平台，用于搭建基于苹果平台的应用程序。
6. JavaScript语言：JavaScript是一种脚本语言,已经被广泛用于Web应用开发；应用范围越来越大，重要性越来越高。目前，流行的H5开发的核心其实就是JavaScript语言。
7. python语言：Python广泛应用于：图形处理、科学计算、web编程、多媒体应用、引擎开发；尤其是在未来大热方向机器学习和人工智能上有非常大的潜力。
8. C#语言：C#在基于windows操作系统的应用开发这一领域在取代C++，占据主导地位，但在其他IT领域应用较少。
9. Fortran语言： 世界上第一种高级语言， IBM公司在1954年提出的，主要用在需要复杂数学计算的科学和工程领域。现在仍然被广泛使用，尤其是工程领域。
10. Basic语言：已经逐步退出历史舞台。
11. COBOL语言：主要用于大量精确处理数据的商业领域中，比如金融、银行。
12. Pascal语言：由于没有大厂商和政府的支持，只是限于大学教育这一块。

### 1.3  Java简介
1. 发展史（略）
2. Java的核心优势--跨平台（基于Java虚拟机）和Java的强大生态系统
3. Java各版本的含义
* JavaSE：标准版，定位在个人计算机上的应用上
* JavaEE：企业版，定位在服务器端的应用，是JavaSE的扩展，增加了用于服务器开发的类库。如：JDBC是让程序员能直接在Java内使用的SQL的语法来访问数据库内的数据;Servlet能够延伸服务器的功能，通过请求-响应的模式来处理客户端的请求;JSP是一种可以将Java程序代码内嵌在网页内的技术
* JavaME：微型版，定位在消费电子产品的应用上，是JavaSE的内伸，包含J2SE的一部分核心类，也有自己的扩展类,增加了适合微小装置的类库。该版本针对资源有限的电子消费产品的需求精简核心类库，并提供了模块化的架构让不同类型产品能够随时增加支持的能力
**雷区：很多人开始会误解为安卓开发就是JavaME，这两个是完全不同的内容**
4. Java的特性和优势
* 跨平台/可移植性
* 安全性，适合于网络/分布式环境
* 面向对象，适合与大型软件的设计和开发
* 简单性
* 高性能，某些代码接近C++
* 分布式，Java是为Internet的分布式环境设计的
* 多线程，多线程的使用可以带来更好的交互响应和实时行为， Java多线程的简单性是Java成为主流服务器端开发语言的主要原因之一
* 健壮性
5. Java应用程序的运行机制：Java首先利用文本编辑器编写 Java源程序，源文件的后缀名为.java；再利用编译器（javac）将源程序编译成字节码文件，字节码文件的后缀名为.class； 最后利用虚拟机（解释器，java）解释执行。
6. JVM、JRE和JDK
* JVM(Java Virtual Machine)就是一个虚拟的用于执行bytecode字节码的”虚拟计算机”。他也定义了指令集、寄存器集、结构栈、垃圾收集堆、内存区域。JVM负责将Java字节码解释运行，边解释边运行，但是因此，其速度就会受到一定的影响
* JRE( Java Runtime Environment) 包含：Java虚拟机、库函数、运行Java应用程序所必须的文件
* JDK( Java  Development Kit )包含：包含JRE，以及增加编译器和调试器等用于程序开发的文件。
*建议：如果只是要运行 Java程序，只需要JRE就可以。JRE通常非常小，其中包含了 JVM；如果要开发 Java程序，就需要安装 JDK*
7. Java开发环境推荐--IntelliJ IDEA
*推荐理由：相较于其他 Java的 IDE，其有多重优点，比如自带 jdk，不需要额外配置路径等*

### 1.4 第一个Java程序
1. 第一个Java程序代码如下：
```java
public class Welcome{
    public static void main(String[] args){
        System.out.println("hello, world !");
    }
}
```

2. 第一个Java程序总结
* Java对大小写敏感
* 关键字public为访问修饰符（access modifier），用于控制程序的其他部分对这段代码的访问级别
* 关键字class为类，Java是面向对象的语言，所有代码必须位于类里面
* 一个源文件最多只能声明一个public类，其他类个数不限，如果源文件包含一个public类，源文件必须和其中定义的public类名相同，且以“.java”为扩展名
* 一个源文件可以包含多个类class
* 正确编译后的源文件，会得到相应的字节码文件，其以“.class”为扩展名
* main方法是Java应用程序的入口方法，有固定的书写格式：
```java
public static void main(String[] args){...}
```
* 在Java中，用花括号划分程序的各个部分，任何方法的代码都必须以“{”开始，以“}”结束，编译器忽略空格，因而花括号风格不受限制
* Java中每个语句必须以分号结束，回车不是语句结束的标志，所以一个语句可以跨多行
*建议：编程时，一定要注意缩进规范；在写括号、引号时，注意是成对编写的*

### 1.5 桌球游戏小项目
* 需要的图片
[小球](https://www.sxt.cn/360shop/Public/admin/UEditor/20170607/1496797408773563.png) 和[台球桌](https://www.sxt.cn/360shop/Public/admin/UEditor/20170607/1496802557924525.jpg)

* 源码
```java
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//这里在调用图片时，请使用电脑的绝对路径，不然可能显示不了图片
	double x = 100;	//小球的横坐标
	double y = 100;	//小球的纵坐标
	
	double degree = 3.14/3;	//弧度，此处为60度
	//画窗口的方法
	public void paint(Graphics g){
        System.out.println("init Game!");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        
        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);
        
        //碰到上下边界
        if(y>500-40-30||y<40+40){
        	//500是窗口高度，40是桌子边框，30是小球直径，最后一个40是标题栏的高度
            degree = -degree;
        }
        
        //碰到左右边界
        if(x<40||x>856-40-30){
            degree = 3.14 - degree;
        }
	}
    //窗口加载
    void launchFrame(){
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);
        
        //重画窗口，每秒画25次
        while(true){
            repaint();
            try{
                Thread.sleep(40);//40ms
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    //main方法是执行程序的入口
    public static void main(String[] args){
        System.out.println("This is a ball game!");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
```
*未完，请见第二章笔记~*

